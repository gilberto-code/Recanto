package Objects;

/**
 *
 * @author Gilberto
 */
import java.sql.Date;
import javax.swing.ImageIcon;

public class Animal {

    protected String nome;
    protected int idade;
    protected String especie;
    protected String raca;
    protected String cor;
    protected String porte;
    protected String sexo;
    protected String descricao;
    protected Date dataDeCadastro;
    protected String qualDoenca;
    protected boolean doente;
    protected boolean castrado;
    protected boolean vacinado;
    protected boolean adotado;
    protected int id;
    protected ImageIcon ImagemIcon;
    protected String imagem;

    public Animal() {
    }

    public Animal(String nome, int idade, String especie, String raca, String cor, String porte, String sexo, String descricao, String qualDoenca, boolean doente, boolean castrado, boolean vacinado, boolean adotado, String imagem) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.raca = raca;
        this.cor = cor;
        this.porte = porte;
        this.sexo = sexo;
        this.descricao = descricao;
        this.qualDoenca = qualDoenca;
        this.doente = doente;
        this.castrado = castrado;
        this.vacinado = vacinado;
        this.adotado = adotado;
        this.imagem = imagem;
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

    public Animal(String nome, int idade, String especie, String raca,
            String cor, String porte, String sexo, String descricao,
            Date dataDeCadastro, String qualDoenca, boolean doente,
            boolean castrado, boolean vacinado, boolean adotado, String imagem) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.raca = raca;
        this.cor = cor;
        this.porte = porte;
        this.sexo = sexo;
        this.descricao = descricao;
        this.dataDeCadastro = dataDeCadastro;
        this.qualDoenca = qualDoenca;
        this.doente = doente;
        this.castrado = castrado;
        this.vacinado = vacinado;
        this.adotado = adotado;
        this.imagem = imagem;

    }

    public Animal(String nome, int idade, String especie, String raca,
            String cor, String porte, String sexo, String descricao,
            Date dataDeCadastro, String qualDoenca, boolean doente,
            boolean castrado, boolean vacinado, String imagem, int id) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.raca = raca;
        this.cor = cor;
        this.porte = porte;
        this.sexo = sexo;
        this.descricao = descricao;
        this.dataDeCadastro = dataDeCadastro;
        this.qualDoenca = qualDoenca;
        this.doente = doente;
        this.castrado = castrado;
        this.vacinado = vacinado;
        this.imagem = imagem;
        this.id = id;
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

    public boolean isDoente() {
        return doente;
    }

    public void setDoente(boolean doente) {
        this.doente = doente;
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

    public boolean isAdotado() {
        return adotado;
    }

    public void setAdotado(boolean adotado) {
        this.adotado = adotado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Animal{nome=").append(nome);
        sb.append(", idade=").append(idade);
        sb.append(", especie=").append(especie);
        sb.append(", raca=").append(raca);
        sb.append(", cor=").append(cor);
        sb.append(", porte=").append(porte);
        sb.append(", sexo=").append(sexo);
        sb.append(", descricao=").append(descricao);
        sb.append(", dataDeCadastro=").append(dataDeCadastro);
        sb.append(", qualDoenca=").append(qualDoenca);
        sb.append(", doente=").append(doente);
        sb.append(", castrado=").append(castrado);
        sb.append(", vacinado=").append(vacinado);
        sb.append(", id=").append(id);
        sb.append(", ImagemIcon=").append(ImagemIcon);
        sb.append('}');
        return sb.toString();
    }
}
