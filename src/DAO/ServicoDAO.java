
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Servico;
import dao.Conexao;

public class ServicoDAO {
    PreparedStatement pst;
    String sql;
    
    public void salvar (Servico servico) throws SQLException{
        sql = "insert into servico values (?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, servico.getTipoServico());
        pst.setString(3, servico.getDescricaoServico());
        pst.setString(4, servico.getValorServico());
        pst.setString(5, servico.getStatusServico());
        pst.execute();
        pst.close();
        
    }
    
    public void excluir (Servico servico) throws SQLException {
    sql = "delete from servico where codigoServico =?";
    pst = Conexao.getInstance().prepareStatement(sql);
    pst.setInt(1, servico.getCodigoServico());
    pst.execute();
    pst.close();
    }
    
    public void alterar (Servico servico) throws SQLException {
    sql = "update servico set tipoServico=?, descricao=?, valor=? ,statusServico=? WHERE codigoservico=?";
    pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, servico.getTipoServico());
        pst.setString(2, servico.getDescricaoServico());
        pst.setString(3, servico.getValorServico());
        pst.setString(4, servico.getStatusServico());
        pst.setInt(5, servico.getCodigoServico());
        
    pst.execute();
    pst.close();
    } 
    
    public Servico Consultar(String codigo) throws SQLException {
        sql = "SELECT * FROM servico WHERE codigoservico=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, codigo);

        ResultSet rs = pst.executeQuery();
        Servico serv= null;

        if (rs.next()) {
            serv = new Servico();
            serv.setCodigoServico(rs.getInt("codigoservico"));
            serv.setTipoServico(rs.getString("tipoServico"));
            serv.setDescricaoServico(rs.getString("descricao"));
            serv.setValorServico(rs.getString("valor"));
            serv.setStatusServico(rs.getString("statusServico"));     
        }

        pst.close();
        return serv;
    }
}
