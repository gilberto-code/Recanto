 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Controllers.ControllerAnimal;
import Objects.*;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Daniela
 */
public class MyTableModelAdocao extends AbstractTableModel {
    private static final String[] columnNames = 
                    {"Foto", "Nome", "Sexo", "Idade", "Espécie"};
    private ArrayList<Animal> animals;
    private ControllerAnimal controllerAnimal;
    
    //O construtor já recebe os dados do ArrayList para exibição 
    public MyTableModelAdocao() throws Exception{
        this.controllerAnimal = new ControllerAnimal();
        this.animals = this.controllerAnimal.getList();
        fireTableRowsInserted(0, this.animals.size()-1);//Força a chamada de getValueAt() para inserir todas as células na JTable
    }
    
    //O construtor já recebe os dados do ArrayList para exibição 
    public MyTableModelAdocao (ArrayList<Animal> a){
        this.animals = a;
        fireTableRowsInserted(0, a.size()-1);  //Força a chamada de getValueAt() para inserir todas as células na JTable
    }
     
    @Override
    //Obrigatório incluir: devolve o nome da coluna para exibição no JTable
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    //Acrescentado para adicionar uma linha ao JTableModel
    public void addRow(Animal d) throws Exception{
        this.controllerAnimal.insert(d);
        this.animals = this.controllerAnimal.getList();
        fireTableRowsInserted(0, this.animals.size()-1); //Força a chamada de getValueAt() para inserir mais uma linha ao final da JTable
        setValueAt(d, this.animals.size()-1, 0);
    }
     
    //Acrescentado para remover uma linha do JTableModel
    public void removeRow(int index) throws Exception{
       if (index != -1){
           Animal a = this.animals.get(index);
           this.controllerAnimal.delete(a);
           this.animals.remove(index);
           fireTableRowsDeleted(index, index); //Força a remoção de uma linha da JTable
       } 
    }
    
    //Acrescentado para atualizar uma linha inteira. Mais prático que o método setValuesAt()
    public void updateRow(int index, Animal d) throws Exception{
       if (index != -1){
         d.setId(this.animals.get(index).getId()); // pois d passado não tem o atributo id preenchido!
         //System.out.println(d.getId()+ " - "+this.animals.get(index).isAcidentado());
         this.controllerAnimal.update(d);
         this.animals.remove(index);
         this.animals.add(index, d);
         fireTableRowsUpdated(index, index); //Força a atualização de uma linha da JTable
       } 
    }
    
    //Acrescentado para retornar o objeto associado à linha selecionada
    public Animal getRowSelected(int index){
       if (index != -1){
           return this.animals.get(index);
       } 
       return null;
    }
    
    @Override
    //Obrigatório incluir: devolve o total de linhs para desenhar a JTable
    public int getRowCount() {
        return this.animals.size();
    }

    @Override
    //Obrigatório incluir: devolve o total de colunas para desenhar a JTable
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
    //Obrigatório incluir: método é chamado para exibir cada celula na JTable
    public Object getValueAt(int rowIndex, int columnIndex) {

        ImageIcon image;
        image = Services.ConverterImagens.montarImagem(this.animals.get(rowIndex).getImagem());
        switch(columnIndex){
            case 0: return image;
            case 1: return this.animals.get(rowIndex).getNome();
            case 2: return this.animals.get(rowIndex).getSexo();
            case 3: return this.animals.get(rowIndex).getIdade()+"   ";
            case 4: return this.animals.get(rowIndex).getEspecie();
        }
        return null;
    }
    
//    //Acrescentado para facilitar fazer inserção de todas as colunas. Faz o mesmo que o método updateRow()
//    public void setValuesAt(Animal discUpdated, int rowIndex, int columnIndex) {       
//        System.out.println("me amo");
//          this.animals.get(rowIndex).setImagemIcon(discUpdated.getImagemIcon());
//          this.animals.get(rowIndex).setNome(discUpdated.getNome());
//          this.animals.get(rowIndex).setSexo(discUpdated.getSexo());
//          this.animals.get(rowIndex).setIdade(discUpdated.getIdade());
//          this.animals.get(rowIndex).setEspecie(discUpdated.getEspecie());
//          fireTableRowsUpdated(rowIndex, rowIndex); //Força a atualização de uma linha da JTable
//    }
    @Override
    public Class getColumnClass(int column){
// 4 is the index of the column image

        if(column == 0){
            return Icon.class;
        }
        else{
            return getValueAt(0,column).getClass();
        }
    }
    /*
    @Override
    //Não é obrigatório incluir: para alterar uma célula do JTableModel
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: int ano = Integer.parseInt(aValue.toString());
                    this.disciplinas.get(rowIndex).setAno(ano);
                    break;
            case 1: int sem = Integer.parseInt(aValue.toString());
                    this.disciplinas.get(rowIndex).setSemestre(sem);
                    break;
            case 2: 
                    this.disciplinas.get(rowIndex).setNome(aValue.toString());
                    break;
            case 3: double nota = Double.parseDouble(aValue.toString());
                    this.disciplinas.get(rowIndex).setNota(nota);
                    break;
        }
        fireTableRowsUpdated(rowIndex, rowIndex); //Força a atualização de uma linha da JTable
         
    }*/
    
}
