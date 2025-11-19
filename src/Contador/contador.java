package Contador;

import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        if (contagem == 0) {
            System.out.println("Os parâmetros são iguais, não há números para imprimir.");
        }
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

    
}
