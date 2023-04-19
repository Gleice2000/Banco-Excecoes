package Banco;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ContaPoupanca extends Conta {
  @Override
  public void atualiza(double taxa) {
      try {
          super.deposita(this.getSaldo() * taxa * 3);
      } catch (ValorInvalidoException ex) {
          Logger.getLogger(ContaPoupanca.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
}