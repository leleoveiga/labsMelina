package lab10;
public class Mario {
	public int situacao = SituacaoMario.MARIO_PEQUENO;
	public long pontuacao = 0;
	public void pegarCogumelo() {
		if (situacao == SituacaoMario.MARIO_PEQUENO) {
			situacao = SituacaoMario.MARIO_GRANDE;
		} else if (situacao == SituacaoMario.MARIO_GRANDE || situacao == SituacaoMario.MARIO_FOGO) {
			pontuacao+=1000;
		}
	}
	public void levarDano() throws Exception {
		if (situacao == SituacaoMario.MARIO_PEQUENO) {
			throw new Exception("Mario morreu.");
		} else if (situacao == SituacaoMario.MARIO_GRANDE) {
			situacao = SituacaoMario.MARIO_PEQUENO;
		}else if (situacao == SituacaoMario.MARIO_FOGO) {
			situacao = SituacaoMario.MARIO_GRANDE;
		}
	}
	public void pegarFlor() {
		if (situacao == SituacaoMario.MARIO_PEQUENO || situacao == SituacaoMario.MARIO_GRANDE) {
			situacao = SituacaoMario.MARIO_FOGO;
		} else if (situacao == SituacaoMario.MARIO_FOGO) {
			pontuacao+=1000;
		}
	}
}
