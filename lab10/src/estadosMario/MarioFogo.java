package estadosMario;

public class MarioFogo extends SituacaoMario{
    public MarioFogo(long pontuacao) {
        super(pontuacao);
    }

    @Override
    public SituacaoMario pegarCogumelo() {
        return new MarioFogo(this.pontuacao + 1000);
    }

    @Override
    public SituacaoMario levarDano() {
        return new MarioGrande(this.pontuacao);
    }

    @Override
    public SituacaoMario pegarFlor() {
        return new MarioFogo(this.pontuacao + 1000);
    }
}
