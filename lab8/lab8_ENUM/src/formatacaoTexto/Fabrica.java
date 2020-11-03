package formatacaoTexto;

import formatos.*;

public enum Fabrica {
    NEGRITO {
        public TipoFormatacao criarFormatacao(){
            return new Negrito();
        }
    },
    ITALICO {
        public TipoFormatacao criarFormatacao(){
            return new Italico();
        }
    },
    MAIUSCULO {
        public TipoFormatacao criarFormatacao(){
            return new Maiusculo();
        }
    },
    MINUSCULO {
        public TipoFormatacao criarFormatacao(){
            return new Minusculo();
        }
    };

    public abstract TipoFormatacao criarFormatacao();
}
