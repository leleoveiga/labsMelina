package formatos;

public class Minusculo implements TipoFormatacao {
    @Override
    public String formatar(String texto) {
        return texto.toLowerCase();
    }
}
