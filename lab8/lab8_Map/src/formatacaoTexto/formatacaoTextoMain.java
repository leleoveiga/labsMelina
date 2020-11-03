package formatacaoTexto;

import formatos.TipoFormatacao;

import java.util.Map;
import java.util.Scanner;

public class formatacaoTextoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fabrica fabrica = new Fabrica();
        Map<Integer, TipoFormatacao> tipos = fabrica.getMapaTipos();

        System.out.println("Digite o texto a ser formatado");
        String texto = sc.nextLine();
        while (true) {
            for (TipoFormatacao formato : tipos.values()) {
                System.out.println(formato.getTipo());
            }
            int tipo = sc.nextInt();
            try {
                TipoFormatacao tipoFormatacao = fabrica.criarFormatacao(tipo);
                System.out.println(tipoFormatacao.formatar(texto));
            } catch (NullPointerException e) {
                System.out.println("Tipo inválido! Tente outro tipo");
            }
        }
    }
}
