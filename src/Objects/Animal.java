package Objects;

/**
 *
 * @author Gilberto
 */

import java.sql.Date;
import javax.swing.ImageIcon;

public class Animal{
    protected String nome; 
    protected String especie;
    protected int idade;
    protected String raca;
    protected String cor;
    protected String porte;
    protected String sexo;
    protected String descricao;
    protected String temperamento;
    protected String bairroEncontrado;
    protected String nomeContato;
    protected String telefoneContato;
    protected Date dataDeCadastro;
    protected String qualDoenca;
    protected String qualAcidente;
    protected boolean doente;
    protected boolean acidentado;
    protected boolean castrado;
    protected boolean vacinado;
    protected boolean prenha; 
    protected int id;
    protected ImageIcon ImagemIcon;
    protected String imagem;
    
    
        
    public Animal() {
    }

    public ImageIcon getImagemIcon() {
        return ImagemIcon;
    }

    
    public void setImagemIcon(ImageIcon ImagemIcon) {
        this.ImagemIcon = ImagemIcon;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagemPrinc) {
        this.imagem = imagemPrinc;
    }
   
    public Animal(String nome, int idade, String porte, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.porte = porte;
        this.sexo = sexo;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }

    public String getBairroEncontrado() {
        return bairroEncontrado;
    }

    public void setBairroEncontrado(String bairroEncontrado) {
        this.bairroEncontrado = bairroEncontrado;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public Date getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(Date dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public String getQualDoenca() {
        return qualDoenca;
    }

    public void setQualDoenca(String qualDoenca) {
        this.qualDoenca = qualDoenca;
    }

    public String getQualAcidente() {
        return qualAcidente;
    }

    public void setQualAcidente(String qualAcidente) {
        this.qualAcidente = qualAcidente;
    }

    public boolean isDoente() {
        return doente;
    }

    public void setDoente(boolean doente) {
        this.doente = doente;
    }

    public boolean isAcidentado() {
        return acidentado;
    }

    public void setAcidentado(boolean acidentado) {
        this.acidentado = acidentado;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    public boolean isPrenha() {
        return prenha;
    }

    public void setPrenha(boolean prenha) {
        this.prenha = prenha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nome;
    }

}