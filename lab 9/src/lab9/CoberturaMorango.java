package lab9;

public class CoberturaMorango extends FabricaCobertura {

    @Override
    public void fazerCobertura() {
        fazerCoberturaMorango();
    }

    private void fazerCoberturaMorango(){
        System.out.println("Faz cobertura de morango");
    }
}
