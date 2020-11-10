package lab10;

import estadosMario.*;

public class Mario {
    private SituacaoMario situacao = new MarioPequeno(0);

    public void pegarCogumelo(){
        this.situacao = situacao.pegarCogumelo();
    }
    public void levarDano() throws Exception{
        this.situacao = situacao.levarDano();
    }
    public void pegarFlor(){
        this.situacao = situacao.pegarFlor();
    }
}
