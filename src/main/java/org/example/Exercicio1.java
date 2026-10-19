package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String[] Diasdasemana ={ "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"

        };

        Double[] Faturamento = new Double[7];
        double total = 0;
        int Maiorvenda = 0;

        for (int i = 0; i < Faturamento.length; i++) {
            System.out.println("Qual o faturamento de " + Diasdasemana[i] + ": R$ ");
            Faturamento[i] = sc.nextDouble();

            total += Faturamento[i];

            if (Faturamento[i] > Faturamento[Maiorvenda]){
                Maiorvenda = i;
            }
        }

        double media = total/7;

        System.out.println("\n---Resultado da semana---");
        System.out.printf(" total: R$ %.2f\n", total);
        System.out.printf("media do dia: R$ %.2f\n", media);
        System.out.printf("Maior venda: %s (R$ %.2f)\n", Diasdasemana[Maiorvenda], Faturamento[Maiorvenda]);






    }
}




