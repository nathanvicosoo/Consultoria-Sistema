package model;


public class Servico {
    private int codigoServico;
    private String tipoServico;
    private String descricaoServico;
    private String valorServico;
    private String statusServico;

    public int getCodigoServico() {
        return codigoServico;
    }

    public void setCodigoServico(int codigoServico) {
        this.codigoServico = codigoServico;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    public String getValorServico() {
        return valorServico;
    }

    public void setValorServico(String valorServico) {
        this.valorServico = valorServico;
    }

    public String getStatusServico() {
        return statusServico;
    }

    public void setStatusServico(String statusServico) {
        this.statusServico = statusServico;
    }

    public Servico(int codigoServico, String tipoServico, String descricaoServico, String valorServico, String statusServico) {
        this.codigoServico = codigoServico;
        this.tipoServico = tipoServico;
        this.descricaoServico = descricaoServico;
        this.valorServico = valorServico;
        this.statusServico = statusServico;
    }

    public Servico() {
    }
    
    
}
