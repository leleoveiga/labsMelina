package lab9;

public class MassaChocolate extends FabricaMassa {

    @Override
    public void fazerCobertura(FabricaCobertura cobertura) {
        this.cobertura = cobertura;
        cobertura.fazerCobertura();
    }

    @Override
    public void fazerMassa() {
        fazerMassaChocolate();
    }

    private void fazerMassaChocolate() {
        System.out.println("Faz a massa de chocolate");
    }
}
