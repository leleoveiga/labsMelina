package lab9;

/*
	eu preferi usar bridge, pois diferentes tipos de massa e cobertura podem ser criados e usados futuramente, e não só isso,
	mas também outros tipos de coisas independentes pra se botar no bolo podem ser criados, e usando
	o bridge torna mais fácil esse processo.
 */

public class Cliente {
	public static void main(String[] args) {
		FabricaMassa fBoloBaunilha = new MassaBaunilha();
		FabricaMassa fBoloChocolate = new MassaChocolate();
		fBoloBaunilha.prepararBolo(new CoberturaMorango());
		fBoloChocolate.prepararBolo(new CoberturaCaramelo());
	}
}