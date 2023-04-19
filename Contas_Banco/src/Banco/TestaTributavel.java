package Banco;
import java.util.zip.CRC32;

public class TestaTributavel {
    public static void main(String[] args) throws ValorInvalidoException {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        cc.calculaTributos();
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
    }
}