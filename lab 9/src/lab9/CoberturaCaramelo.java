package lab9;

public class CoberturaCaramelo extends FabricaCobertura {

    @Override
    public void fazerCobertura() {
        fazerCoberturaCaramelo();
    }

    private void fazerCoberturaCaramelo() {
        System.out.println("Faz cobertura de caramelo");
    }
}
