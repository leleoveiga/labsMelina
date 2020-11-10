package estadosMario;

public class MarioPequeno extends SituacaoMario{
    public MarioPequeno(long pontuacao) {
        super(pontuacao);
    }

    @Override
    public SituacaoMario pegarCogumelo() {
        return new MarioGrande(this.pontuacao);
    }

    @Override
    public SituacaoMario levarDano() throws Exception {
        throw new Exception("Mario morreu.");
    }

    @Override
    public SituacaoMario pegarFlor() {
        return new MarioFogo(this.pontuacao);
    }
}
