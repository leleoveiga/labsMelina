package formatos;

public class Maiusculo implements TipoFormatacao {
    @Override
    public String formatar(String texto) {
        return texto.toUpperCase();
    }

    @Override
    public String getTipo() {
        return "3 - Caixa Maiúsculo";
    }
}
