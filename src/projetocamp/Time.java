/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocamp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lab214
 */
public class Time {
    
    ArrayList<String> equipes = new ArrayList();

    private String nome;
    private String cidade;
    private int pontos;

    public void cadastrarTimes() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva o nome do time: ");
        nome = entrada.next();
        System.out.println("Escreva a cidade do time: ");
        cidade = entrada.next();
        equipes.add(nome+" de "+cidade);
    }
    
    public void imprimeTimes(){
        for(String times: equipes){
            System.out.println(equipes);
        }
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the pontos
     */
    public int getPontos() {
        return pontos;
    }

    /**
     * @param pontos the pontos to set
     */
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

}
