package lab9;

public abstract class FabricaMassa {
    protected FabricaCobertura cobertura;

    public void prepararBolo(FabricaCobertura cobertura) {
        fazerMassa();
        levarAoForno();
        fazerCobertura(cobertura);
        decorarBolo();
    }
    private void levarAoForno() {
        System.out.println("Leva ao forno");
    }
    private void decorarBolo() {
        System.out.println("Decora bolo");
    }
    public abstract void fazerCobertura(FabricaCobertura cobertura);
    public abstract void fazerMassa();
}
