package formatacaoTexto;

import formatos.*;
import java.util.HashMap;
import java.util.Map;

public class Fabrica {

    private Map<Integer, TipoFormatacao> tipos;

    public Fabrica() {
        tipos = new HashMap<>();
        tipos.put(1, new Negrito());
        tipos.put(2, new Italico());
        tipos.put(3, new Maiusculo());
        tipos.put(4, new Minusculo());
    }

    public TipoFormatacao criarFormatacao(int tipo) {
        return tipos.get(tipo);
    }

    public Map<Integer, TipoFormatacao> getMapaTipos() {
        return tipos;
    }
}
