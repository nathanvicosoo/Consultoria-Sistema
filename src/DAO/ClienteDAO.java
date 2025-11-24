package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Cliente;
import dao.Conexao;


public class ClienteDAO {
    PreparedStatement pst;
    String sql;
    
    public void salvar (Cliente cliente) throws SQLException{
        sql = "insert into cliente values (?,?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, cliente.getNomeCliente());
        pst.setString(3, cliente.getCpfCliente());
        pst.setString(4, cliente.getTelefoneCliente());
        pst.setString(5, cliente.getEmailCliente());
        pst.setString(6, cliente.getEnderecoCliente());
        pst.setString(7, cliente.getCidadeCliente());
        pst.setString(8, cliente.getEstadoCliente());
        pst.execute();
        pst.close();
        
    }
    
    public void excluir (Cliente cliente) throws SQLException {
    sql = "delete from cliente where codigoCliente =?";
    pst = Conexao.getInstance().prepareStatement(sql);
    pst.setInt(1, cliente.getCodigoCliente());
    pst.execute();
    pst.close();
    }
    
   public Cliente consultar (String codigo) throws SQLException{
        sql = "SELECT * FROM cliente WHERE codigoCliente = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, codigo);
        ResultSet rs = pst.executeQuery();
        Cliente cli = null;
        if(rs.next()){
            cli = new Cliente();
            cli.setCodigoCliente(rs.getInt("codigoCliente"));
            cli.setNomeCliente(rs.getString("nomeCliente"));
            cli.setCpfCliente(rs.getString("cpfCliente"));
            cli.setTelefoneCliente(rs.getString("telefoneCliente"));
            cli.setEmailCliente(rs.getString("emailCliente"));
            cli.setEnderecoCliente(rs.getString("enderecoCliente"));
            cli.setCidadeCliente(rs.getString("cidadeCliente"));
            cli.setEstadoCliente(rs.getString("estadoCliente"));
        }
        pst.close();
        return cli;
    }
    
    public void alterar (Cliente cliente) throws SQLException {
    sql = "update cliente set nomecliente=?, cpfCliente=?, telefoneCliente=?, emailCliente=?, enderecoCliente=?, cidadeCliente=?, estadoCliente=? ";
    pst = Conexao.getInstance().prepareStatement(sql);
    pst.setString(1, cliente.getNomeCliente());
    pst.setString(2, cliente.getCpfCliente());
    pst.setString(3, cliente.getTelefoneCliente());
    pst.setString(4, cliente.getEmailCliente());
    pst.setString(5, cliente.getEnderecoCliente());
    pst.setString(6, cliente.getCidadeCliente());
    pst.setString(7, cliente.getEstadoCliente());
    pst.execute();
    pst.close();
    }    
}
