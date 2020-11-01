package formatos;

public class Maiusculo implements TipoFormatacao {
    @Override
    public String formatar(String texto) {
        return texto.toUpperCase();
    }
}
