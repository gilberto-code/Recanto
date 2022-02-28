/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author Gilberto
 */
public class PedidoAdocao {
    protected int idUser;
    protected int idAnimal;
    protected String nomeAnimal;
    protected String nomeUsuario;
    protected String mensagem;
    protected String imagemAnimal;

    public PedidoAdocao(int idUser, int idAnimal, String nomeAnimal, String nomeUsuario, String mensagem, String imagemAnimal) {
        this.idUser = idUser;
        this.idAnimal = idAnimal;
        this.nomeAnimal = nomeAnimal;
        this.nomeUsuario = nomeUsuario;
        this.mensagem = mensagem;
        this.imagemAnimal = imagemAnimal;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getImagemAnimal() {
        return imagemAnimal;
    }

    public void setImagemAnimal(String imagemAnimal) {
        this.imagemAnimal = imagemAnimal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PedidoAdocao{idUser=").append(idUser);
        sb.append(", idAnimal=").append(idAnimal);
        sb.append(", nomeAnimal=").append(nomeAnimal);
        sb.append(", nomeUsuario=").append(nomeUsuario);
        sb.append(", mensagem=").append(mensagem);
        sb.append(", imagemAnimal=").append(imagemAnimal);
        sb.append('}');
        return sb.toString();
    }
    
}
