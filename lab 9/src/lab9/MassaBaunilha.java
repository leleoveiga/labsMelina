package lab9;

public class MassaBaunilha extends FabricaMassa {

    @Override
    public void fazerCobertura(FabricaCobertura cobertura) {
        this.cobertura = cobertura;
        this.cobertura.fazerCobertura();
    }

    @Override
    public void fazerMassa() {
        fazerMassaBaunilha();
    }

    private void fazerMassaBaunilha() {
        System.out.println("Faz a massa de baunilha");
    }
}
