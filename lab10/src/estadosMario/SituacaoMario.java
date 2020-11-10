package estadosMario;
public abstract class SituacaoMario {

	protected long pontuacao;
	public SituacaoMario(long pontuacao) {
		this.pontuacao = pontuacao;
	}

	public abstract SituacaoMario pegarCogumelo();
	public abstract SituacaoMario levarDano() throws Exception;
	public abstract SituacaoMario pegarFlor();
}
