package model;

public class Funcionario {
    private int codigoFuncionario;
    private String nomeFuncionario;
    private String cpfFuncionario;
    private String cargoFuncionario;
    private String telefoneFuncionario;
    private String emailFuncionario;
    private String enderecoFuncionario;
    private String statusFuncionario;

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public String getCargoFuncionario() {
        return cargoFuncionario;
    }

    public void setCargoFuncionario(String cargoFuncionario) {
        this.cargoFuncionario = cargoFuncionario;
    }

    public String getTelefoneFuncionario() {
        return telefoneFuncionario;
    }

    public void setTelefoneFuncionario(String telefoneFuncionario) {
        this.telefoneFuncionario = telefoneFuncionario;
    }

    public String getEmailFuncionario() {
        return emailFuncionario;
    }

    public void setEmailFuncionario(String emailFuncionario) {
        this.emailFuncionario = emailFuncionario;
    }

    public String getEnderecoFuncionario() {
        return enderecoFuncionario;
    }

    public void setEnderecoFuncionario(String enderecoFuncionario) {
        this.enderecoFuncionario = enderecoFuncionario;
    }

    public String getStatusFuncionario() {
        return statusFuncionario;
    }

    public void setStatusFuncionario(String statusFuncionario) {
        this.statusFuncionario = statusFuncionario;
    }

    public Funcionario(int codigoFuncionario, String nomeFuncionario, String cpfFuncionario, String cargoFuncionario, String telefoneFuncionario, String emailFuncionario, String enderecoFuncionario, String statusFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.cpfFuncionario = cpfFuncionario;
        this.cargoFuncionario = cargoFuncionario;
        this.telefoneFuncionario = telefoneFuncionario;
        this.emailFuncionario = emailFuncionario;
        this.enderecoFuncionario = enderecoFuncionario;
        this.statusFuncionario = statusFuncionario;
    }

    public Funcionario() {
    }
    
    
}
