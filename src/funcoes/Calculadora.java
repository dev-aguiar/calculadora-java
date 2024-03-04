package funcoes;

import java.util.Scanner;

public class Calculadora {

    Scanner terminal = new Scanner(System.in);

    public void somar() {
        System.out.println("Digite o primeiro número:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo número:");
        int parametroDois = terminal.nextInt();
        int resultado = parametroUm + parametroDois;
        System.out.println("O resultado da soma é " + resultado);
    }

    public void subtrair() {
        System.out.println("Digite o primeiro número:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo número:");
        int parametroDois = terminal.nextInt();
        int resultado = parametroUm - parametroDois;
        System.out.println("O resultado da subtração é " + resultado);
    }

    public void multiplicar() {
        System.out.println("Digite o primeiro número:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo número:");
        int parametroDois = terminal.nextInt();
        int resultado = parametroUm * parametroDois;
        System.out.println("O resultado da multiplicação é " + resultado);
    }

    public void dividir() {
        System.out.println("Digite o primeiro número:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo número:");
        int parametroDois = terminal.nextInt();
        int resultado = parametroUm / parametroDois;
        System.out.println("O resultado da divisão é " + resultado);
    }

    public void iniciar() {
        System.out.println(">>> Bem vindo(a) a Calculadora Java! <<<");
        System.out.println("Escolha a operação que deseja executar:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("Digite o número da operação aqui: ");

        int escolha = terminal.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Você escolheu somar");
                somar();
                iniciar();
                break;
            case 2:
                System.out.println("Você escolheu subtrair");
                subtrair();
                iniciar();
                break;
            case 3:
                System.out.println("Você escolheu multiplicar");
                multiplicar();
                iniciar();
                break;
            case 4:
                System.out.println("Você escolheu dividir");
                dividir();
                iniciar();
                break;
            default:
                System.out.println("Opção inválida. Por favor, excolha uma opção válida");
                iniciar();
                break;
        }
    }
}
