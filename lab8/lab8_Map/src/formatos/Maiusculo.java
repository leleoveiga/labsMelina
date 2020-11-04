package formatos;

public class Maiusculo implements TipoFormatacao {
    @Override
    public String formatar(String texto) {
        return texto.toUpperCase();
    }

    @Override
    public String getTipoEnumerado() {
        return "3 - Caixa Maiúsculo";
    }
}
