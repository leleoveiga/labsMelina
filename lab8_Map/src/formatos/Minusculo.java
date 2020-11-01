package formatos;

public class Minusculo implements TipoFormatacao {
    @Override
    public String formatar(String texto) {
        return texto.toLowerCase();
    }

    @Override
    public String getTipo() {
        return "4 - Caixa Minúsculo";
    }
}
