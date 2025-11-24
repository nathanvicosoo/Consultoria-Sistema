package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Funcionario;
import dao.Conexao;




public class FuncionarioDAO {
    PreparedStatement pst;
    String sql;
    
    public void salvar (Funcionario funcionario) throws SQLException{
        sql = "insert into funcionario values (?,?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, funcionario.getNomeFuncionario());
        pst.setString(3, funcionario.getCpfFuncionario());
        pst.setString(4, funcionario.getCargoFuncionario());
        pst.setString(5, funcionario.getTelefoneFuncionario());
        pst.setString(6, funcionario.getEmailFuncionario());
        pst.setString(7, funcionario.getEnderecoFuncionario());
        pst.setString(8, funcionario.getStatusFuncionario());
        pst.execute();
        pst.close();
        
    }
    public void excluir (Funcionario funcionario) throws SQLException {
    sql = "delete from funcionario where codigoFuncionario =?";
    pst = Conexao.getInstance().prepareStatement(sql);
    pst.setInt(1, funcionario.getCodigoFuncionario());
    pst.execute();
    pst.close();
    }
    
    public void alterar (Funcionario funcionario) throws SQLException {
    sql = "UPDATE funcionario SET nomeFuncionario=?, cpfFuncionario=?, cargoFuncionario=?, telefoneFuncionario=?, emailFuncionario=?, enderecoFuncionario=?, statusFuncionario=? WHERE codigoFuncionario=?";

        pst = Conexao.getInstance().prepareStatement(sql);

        pst.setString(1, funcionario.getNomeFuncionario());
        pst.setString(2, funcionario.getCpfFuncionario());
        pst.setString(3, funcionario.getCargoFuncionario());
        pst.setString(4, funcionario.getTelefoneFuncionario());
        pst.setString(5, funcionario.getEmailFuncionario());
        pst.setString(6, funcionario.getEnderecoFuncionario());
        pst.setString(7, funcionario.getStatusFuncionario());
        pst.setInt(8, funcionario.getCodigoFuncionario());

        pst.execute();
        pst.close();
    } 
    
    public Funcionario consultar(String codigo) throws SQLException {
        sql = "SELECT * FROM funcionario WHERE codigoFuncionario=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, codigo);

        ResultSet rs = pst.executeQuery();
        Funcionario fun = null;

        if (rs.next()) {
            fun = new Funcionario();
            fun.setCodigoFuncionario(rs.getInt("codigoFuncionario"));
            fun.setNomeFuncionario(rs.getString("nomeFuncionario"));
            fun.setCpfFuncionario(rs.getString("cpfFuncionario"));
            fun.setCargoFuncionario(rs.getString("cargoFuncionario"));
            fun.setTelefoneFuncionario(rs.getString("telefoneFuncionario"));
            fun.setEmailFuncionario(rs.getString("emailFuncionario"));
            fun.setEnderecoFuncionario(rs.getString("enderecoFuncionario"));
            fun.setStatusFuncionario(rs.getString("statusFuncionario"));
        }
        pst.close();
        return fun;
    }
}
