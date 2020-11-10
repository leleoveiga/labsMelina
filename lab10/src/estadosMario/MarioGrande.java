package estadosMario;

public class MarioGrande extends SituacaoMario {
    public MarioGrande(long pontuacao) {
        super(pontuacao);
    }

    @Override
    public SituacaoMario pegarCogumelo() {
        return new MarioGrande(this.pontuacao + 1000);
    }

    @Override
    public SituacaoMario levarDano() {
        return new MarioPequeno(this.pontuacao);
    }

    @Override
    public SituacaoMario pegarFlor() {
        return new MarioFogo(this.pontuacao);
    }
}
