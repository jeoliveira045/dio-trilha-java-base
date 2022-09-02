public class ContaTerminal {
    private String nomeCliente;
    private String agencia;
    private Integer conta;
    private Double salto;
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public Integer getConta() {
        return conta;
    }
    public void setConta(Integer conta) {
        this.conta = conta;
    }
    public Double getSalto() {
        return salto;
    }
    public void setSalto(Double salto) {
        this.salto = salto;
    }
    @Override
    public String toString(){
        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + salto + "já esta disponível";
    }


}
