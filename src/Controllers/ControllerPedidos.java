/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import DataAcess.ConnectionDB;
import Objects.PedidoAdocao;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Gilberto
 */
public class ControllerPedidos {

    public ArrayList<PedidoAdocao> getList() throws Exception {
        PreparedStatement ps
                = ConnectionDB.getConnection().prepareStatement("select tu.idUser, ta.idAnimal , "
                        + "tu.nome nomeUser, ta.nome nomeAnimal, tp.mensagem, ti.imagem\n"
                        + "from tb_pedidos_adocao tp\n"
                        + "left join tb_user tu on tp.idUser = tu.idUser\n"
                        + "left join tb_animais ta on tp.idAnimal = ta.idAnimal\n"
                        + "left join tb_imagens ti\n"
                        + "on ta.idAnimal = ti.idAnimal;");
        //ps.setBoolean(1, isAdotado);
        ResultSet rs = ps.executeQuery();
        return carregarLista(rs);
    }

    private ArrayList<PedidoAdocao> carregarLista(ResultSet rs) throws SQLException, IOException {
        ArrayList<PedidoAdocao> lista = new ArrayList<>();
        PedidoAdocao pedido;
        while (rs.next()) {
            pedido = new PedidoAdocao(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getString(4),
                    rs.getString(3),
                    rs.getString(5),
                    rs.getString(6));
            lista.add(pedido);
        }
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        rs.close();
        return lista;
    }
}
