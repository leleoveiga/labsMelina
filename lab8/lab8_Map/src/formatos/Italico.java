package formatos;

public class Italico implements TipoFormatacao{
    @Override
    public String formatar(String texto) {
        return "\033[3m" + texto + "\033[0m";
    }

    @Override
    public String getTipo() {
        return "2 - Caixa Itálico";
    }
}
