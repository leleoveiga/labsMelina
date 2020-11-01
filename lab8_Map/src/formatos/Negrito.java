package formatos;

public class Negrito implements TipoFormatacao {
    @Override
    public String formatar(String texto) {
        return "\033[1m" + texto + "\033[0m";
    }
    public String getTipo() {
        return "1 - Caixa Negrito";
    }
}
