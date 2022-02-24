/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import javax.swing.ImageIcon;

/**
 *
 * @author Gilberto
 */
public class Adotante {
    protected int id;
    protected String nome;
    protected String cpf;
    protected String telefone;
    protected String endereco;
    protected String imagem;

    public Adotante(int id, String nome, String cpf, String telefone, String endereco, String imagem) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.imagem = imagem;
    }

    public Adotante(String nome, String cpf, String telefone, String endereco, String imagem) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.imagem = imagem;
    }
    

    public Adotante() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Adotante{id=").append(id);
        sb.append(", nome=").append(nome);
        sb.append(", cpf=").append(cpf);
        sb.append(", telefone=").append(telefone);
        sb.append(", endereco=").append(endereco);
        sb.append(", imagem=").append(imagem);
        sb.append('}');
        return sb.toString();
    }
    
    
}
