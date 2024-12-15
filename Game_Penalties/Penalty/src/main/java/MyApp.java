package main.java;
import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) throws Exception {

        Shootout BRAxCRO = new Shootout();
        Scanner sc = new Scanner(System.in);

        System.out.println("E termina a prorrogação! Vamos começar com a disputa de pênaltis... Vamos Brasil!");

        do {

            System.out.println("Cobradores disponíveis: ");
            BRAxCRO.printarJogadoresBrasil();
            System.out.println("Escolha um jogador: ");
            String jogador = sc.nextLine();
            BRAxCRO.verificaJogador(jogador);
            if(BRAxCRO.verificaJogador(jogador) == 1) {
                System.out.println("O jogador não está disponível!!! ERRO!");
                System.exit(0);
            }
            BRAxCRO.excluirJogador(jogador);

            System.out.println("〄〄〄〄〄〄〄〄〄〄〄〄〄〄");

            System.out.println("Lugares para bater o pênalti: ");
            BRAxCRO.printarCantosBatidas();
            System.out.println("Escolha onde bater a cobrança: ");
            String cantoBatida = sc.nextLine();
            BRAxCRO.verificaCanto(cantoBatida);
            if(BRAxCRO.verificaCanto(cantoBatida) == 0) {
                BRAxCRO.goleiroAgarra(cantoBatida);
            } else {
                System.out.println("Isolou!!!");
            }

            System.out.println("〄〄〄〄〄〄〄〄〄〄〄〄〄〄");

            System.out.println("O jogador da Croácia vai bater o pênalti..");
            BRAxCRO.chuteCroacia();

            System.out.println("〄〄〄〄〄〄〄〄〄〄〄〄〄〄");

            System.out.println("Placar: BRA (" + BRAxCRO.getScoreBrasil() + ") x CRO (" + BRAxCRO.getScoreCroacia() + ")");

            System.out.println("〄〄〄〄〄〄〄〄〄〄〄〄〄〄");

        } while (BRAxCRO.getScoreBrasil() < 5 && BRAxCRO.getScoreCroacia() < 5); 

        if (BRAxCRO.getScoreBrasil() > BRAxCRO.getScoreCroacia()) {
            System.out.println("O BRASIL AVANÇA PARA AS SEMIS!!");
        } else {
            System.out.println("É, amigos... Acabou..");
        }
    }
}
