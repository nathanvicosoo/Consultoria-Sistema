package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Usuario;
import dao.Conexao;


public class UsuarioDAO {
    PreparedStatement pst;
    String sql;
    
    public Usuario buscaLogin (String login, String senha) throws SQLException {
    sql = "SELECT * FROM usuario where login COLLATE utf8_bin =? and senha COLLATE utf8_bin=?;";
    Usuario usuario = null;
    pst = Conexao.getInstance().prepareStatement(sql);
    pst.setString(1, login);
    pst.setString(2, senha);
    pst.executeQuery();
    ResultSet rs = pst.getResultSet();
    while(rs.next()){
    usuario = new Usuario (rs.getInt("codigo"),rs.getString("login"), rs.getString("senha"), rs.getString("tipo"));
    }
    return usuario;
    
    }
}
