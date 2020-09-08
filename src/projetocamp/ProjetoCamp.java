/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocamp;

/**
 *
 * @author lab214
 */
public class ProjetoCamp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Time t = new Time();
        Campeonato c = new Campeonato();
        t.cadastrarTimes();
        t.cadastrarTimes();
        c.cadastrarCampeonato();
        
    }
    
}
