/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Controllers.ControllerAnimal;
import Controllers.ControllerPedidos;
import Objects.*;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gilberto
 */
public class MyTableModelPedidoAdocao extends AbstractTableModel {

    private static final String[] columnNames
            = {"Foto", "Nome Animal", "Nome Usuario", "Mensagem"};
    private ArrayList<PedidoAdocao> pedidos;
    private ControllerPedidos controllerPedidos;

    //O construtor já recebe os dados do ArrayList para exibição 
    public MyTableModelPedidoAdocao() throws Exception {
        this.controllerPedidos = new ControllerPedidos();
        this.pedidos = this.controllerPedidos.getList();
        fireTableRowsInserted(0, this.pedidos.size() - 1);//Força a chamada de getValueAt() para inserir todas as células na JTable
    }
    
    public ArrayList<PedidoAdocao> getListAnimal(){
        return pedidos;
    }

    //O construtor já recebe os dados do ArrayList para exibição 
    public MyTableModelPedidoAdocao(ArrayList<PedidoAdocao> a) {
        this.pedidos = a;
        fireTableRowsInserted(0, a.size() - 1);  //Força a chamada de getValueAt() para inserir todas as células na JTable
    }

    @Override
    //Obrigatório incluir: devolve o nome da coluna para exibição no JTable
    public String getColumnName(int column) {
        return columnNames[column];
    }

    //Acrescentado para adicionar uma linha ao JTableModel
    public void addRow(Animal d) throws Exception {
        //this.controllerPedidos.insert(d);
        this.pedidos = this.controllerPedidos.getList();
        fireTableRowsInserted(0, this.pedidos.size() - 1); //Força a chamada de getValueAt() para inserir mais uma linha ao final da JTable
        setValueAt(d, this.pedidos.size() - 1, 0);
    }

    //Acrescentado para remover uma linha do JTableModel
//    public void removeRow(int index) throws Exception {
//        if (index != -1) {
//            Animal a = this.pedidos.get(index);
//            this.controllerPedidos.delete(a);
//            this.pedidos.remove(index);
//            fireTableRowsDeleted(index, index); //Força a remoção de uma linha da JTable
//        }
//    }

    //Acrescentado para atualizar uma linha inteira. Mais prático que o método setValuesAt()
//    public void updateRow(int index, Animal d) throws Exception {
//        if (index != -1) {
//            d.setId(this.pedidos.get(index).getId()); // pois d passado não tem o atributo id preenchido!
//            this.controllerPedidos.update(d);
//            this.pedidos.remove(index);
//            this.pedidos.add(index, d);
//            fireTableRowsUpdated(index, index); //Força a atualização de uma linha da JTable
//        }
//    }

    //Acrescentado para retornar o objeto associado à linha selecionada
    public PedidoAdocao getRowSelected(int index) {
        if (index != -1) {
            return this.pedidos.get(index);
        }
        return null;
    }

    @Override
    //Obrigatório incluir: devolve o total de linhs para desenhar a JTable
    public int getRowCount() {
        return this.pedidos.size();
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
        image = Services.Controll_Images.montarImagem(
                this.pedidos.get(rowIndex).getImagemAnimal(),200,-1);
        switch (columnIndex) {
            case 0:
                return image;
            case 1:
                return this.pedidos.get(rowIndex).getNomeAnimal();
            case 2:
                return this.pedidos.get(rowIndex).getNomeUsuario();
            case 3:
                return this.pedidos.get(rowIndex).getMensagem();
                    }
        return null;
    }
    @Override
    public Class getColumnClass(int column) {
        try {
            if (column == 0) {
                return Icon.class;
            } else {
                return getValueAt(0, column).getClass();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
