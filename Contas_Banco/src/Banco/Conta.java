package Banco;

public abstract class Conta {
    protected double saldo;

    public void deposita(double valor) throws ValorInvalidoException {
        if (valor < 0) {
            throw new ValorInvalidoException(valor);
        } else {
            this.saldo += valor - 0.10;
        }
    }

  public abstract void atualiza(double taxaSelic);

  public double getSaldo() {
    return this.saldo;
  }
}