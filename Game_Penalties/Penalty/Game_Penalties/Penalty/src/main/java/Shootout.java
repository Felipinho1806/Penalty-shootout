package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Shootout {
    
    private int scoreCroacia = 0;
    private int scoreBrasil = 0;
    private int cobrancas = 0;
    private ArrayList<String> jogadoresBrasil = new ArrayList<>(Arrays.asList(
        "Alisson",
        "Alex Sandro",
        "Marquinhos",
        "Thiago Silva",
        "Danilo",
        "Casemiro",
        "Fred",
        "Neymar",
        "Antony",
        "Pedro",
        "Rodrygo"
    )); 

    private ArrayList<String> cantosGoleiro = new ArrayList<>(Arrays.asList(
        "Meio",
        "Canto esquerdo inferior",
        "Canto direito inferior",
        "Canto esquerdo superior",
        "Canto direito superior"
    ));

    public int getScoreCroacia() {
        return scoreCroacia;
    }
    public void setScoreCroacia(int scoreCroacia) {
        this.scoreCroacia = scoreCroacia;
    }
    public int getScoreBrasil() {
        return scoreBrasil;
    }
    public void setScoreBrasil(int scoreBrasil) {
        this.scoreBrasil = scoreBrasil;
    }
    public ArrayList<String> getJogadoresBrasil() {
        return jogadoresBrasil;
    }
    public void setJogadoresBrasil(ArrayList<String> jogadoresBrasil) {
        this.jogadoresBrasil = jogadoresBrasil;
    }
    public ArrayList<String> getCantosGoleiro() {
        return cantosGoleiro;
    }
    public void setCantosGoleiro(ArrayList<String> cantosGoleiro) {
        this.cantosGoleiro = cantosGoleiro;
    }
    public int getCobrancas() {
        return cobrancas;
    }
    public void setCobrancas(int cobrancas) {
        this.cobrancas = cobrancas;
    }

    public void printarJogadoresBrasil() {
        for(String jogadores : jogadoresBrasil) {
            System.out.println(jogadores);
        }
    }

    public int verificaJogador(String jogadorEscolhido) {
        for(String jogadoresBra : jogadoresBrasil) {
            if(jogadoresBra.equals(jogadorEscolhido)) {
                return 0;
            }
        }
        return 1; 
    }

    public void excluirJogador(String jogadorEscolhido) {
        jogadoresBrasil.remove(jogadorEscolhido);
    }

    public void printarCantosBatidas() {
        for(String cantos : cantosGoleiro) {
            System.out.println(cantos);
        }
    }

    public int goleiroAgarra(String canto) {
        Random rand = new Random();
        int canto1Index = rand.nextInt(cantosGoleiro.size());
        int canto2Index = rand.nextInt(cantosGoleiro.size());

        while (canto1Index == canto2Index) {
            canto2Index = rand.nextInt(cantosGoleiro.size());
        }

        String canto1 = cantosGoleiro.get(canto1Index);
        String canto2 = cantosGoleiro.get(canto2Index);

        System.out.println("Cantos aleatórios escolhidos: " + canto1 + " e " + canto2);

        if (canto.equals(canto1) || canto.equals(canto2)) {
            System.out.println("O goleiro agarrou o pênalti!");
            return 1;  
        } else {
            System.out.println("O goleiro não agarrou o pênalti.");
            scoreBrasil++;
            return 0;  
        }
    }

    public int chuteCroacia() {
        
        Random rand = new Random();
        int canto1Index = rand.nextInt(cantosGoleiro.size());
        int canto2Index = rand.nextInt(cantosGoleiro.size());

        while (canto1Index == canto2Index) {
            canto2Index = rand.nextInt(cantosGoleiro.size());
        }

        String canto1 = cantosGoleiro.get(canto1Index);
        String canto2 = cantosGoleiro.get(canto2Index);

        System.out.println("Cantos aleatórios escolhidos: " + canto1 + " e " + canto2);

        int chuteCantoIndex = rand.nextInt(cantosGoleiro.size());
        String cantoChute = cantosGoleiro.get(chuteCantoIndex);

        System.out.println("O chute do Croata foi para: " + cantoChute);

        if (cantoChute.equals(canto1) || cantoChute.equals(canto2)) {
            System.out.println("ALISSON DEFENDE!!");
            return 1;  
        } else {
            System.out.println("Gol da Croácia.");
            scoreCroacia++;
            return 0;  
        }
    }

    public int verificaCanto(String cantoEscolhido) {
        for(String cantoChute : cantosGoleiro) {
            if(cantoChute.equals(cantoEscolhido)) {
                return 0;
            }
        }
        return 1;
    }

}