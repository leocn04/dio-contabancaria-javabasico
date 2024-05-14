public class ContaBanco {
    private int numero;
    private String agencia;
    private String nome;
    private double saldo;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nomes) {
        nome = nomes;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public String toString() {
    return "Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +  " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque";
    }

    
    
}
