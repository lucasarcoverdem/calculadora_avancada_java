package Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("- - - C A L C U L A D O R A - - -");
        System.out.println("O que deseja fazer?");
        System.out.println("1 - Operações básicas\n2 - Circunferência\n3 - Teorema de Pitágoras\n4 - Fórmula de Bhaskara");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                operacoesBasicas(sc);
                break;
            case 2:
                calcularCircunferencia(sc);
                break;
            case 3:
                calcularTeoremaDePitagoras(sc);
                break;
            case 4:
                calcularBhaskara(sc);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }

    public static void operacoesBasicas(Scanner sc) {
        System.out.print("Insira o primeiro número: ");
        double a = sc.nextDouble();

        System.out.print("Insira o segundo número: ");
        double b = sc.nextDouble();

        System.out.println("O que deseja fazer?\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        int operacao = sc.nextInt();

        double resultado = 0;
        switch (operacao) {
            case 1:
                resultado = a + b;
                break;
            case 2:
                resultado = a - b;
                break;
            case 3:
                resultado = a * b;
                break;
            case 4:
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    return;
                }
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }
        System.out.println("O resultado é: " + resultado);
    }

    public static void calcularCircunferencia(Scanner sc) {
        System.out.print("Insira o raio de um círculo: ");
        double raio = sc.nextDouble();

        double circunferencia = 2 * Math.PI * raio;
        System.out.println("A circunferência é: " + circunferencia);
    }

    public static void calcularTeoremaDePitagoras(Scanner sc) {
        System.out.print("Insira o valor do cateto 1: ");
        double cateto1 = sc.nextDouble();

        System.out.print("Insira o valor do cateto 2: ");
        double cateto2 = sc.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("O valor da hipotenusa é: " + hipotenusa);
    }

    public static void calcularBhaskara(Scanner sc) {
        System.out.print("Insira o valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Insira o valor de b: ");
        double b = sc.nextDouble();

        System.out.print("Insira o valor de c: ");
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes da equação são: x1 = " + x1 + ", x2 = " + x2);
        }
    }
}
