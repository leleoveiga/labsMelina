package formatacaoTexto;

import formatos.TipoFormatacao;

import java.util.Scanner;

public class formatacaoTextoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o texto a ser formatado");
        String texto = sc.nextLine();

        while (true) {
            System.out.println("1 - Caixa Negrito\n"
                    + "2 - Caixa Itálico\n"
                    + "3 - Caixa Maiúsculo\n"
                    + "4 - Caixa Minúsculo\n");
            int tipo = sc.nextInt();

            try {
                Fabrica tipoFormatacao = Fabrica.values()[tipo - 1];
                TipoFormatacao formatacao = tipoFormatacao.criarFormatacao();
                System.out.println(formatacao.formatar(texto));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Tipo inválido! Tente outro tipo");
            }
        }

    }
}
