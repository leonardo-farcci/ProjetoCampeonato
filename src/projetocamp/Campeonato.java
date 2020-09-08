package projetocamp;

import java.util.Scanner;

import java.util.ArrayList;

public class Campeonato {

    Scanner entrada = new Scanner(System.in);

    private String nomeDoCampeonato;
    private ArrayList<Partida> partidas = new ArrayList();
    private ArrayList<Time> equipes = new ArrayList();

    public void cadastrarCampeonato() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do campeonato: ");
        nomeDoCampeonato = entrada.next();
        for (Time eq : equipes) {
            System.out.println(equipes);
        }
    }

    public void listarPartidas() {

    }

    /**
     * @return the nomeDoCampeonato
     */
    public String getNomeDoCampeonato() {
        return nomeDoCampeonato;
    }

    /**
     * @param nomeDoCampeonato the nomeDoCampeonato to set
     */
    public void setNomeDoCampeonato(String nomeDoCampeonato) {
        this.nomeDoCampeonato = nomeDoCampeonato;
    }

    /**
     * @return the partidas
     */
}
