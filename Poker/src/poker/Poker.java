/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

/**
 *
 * @author Alex Recacha & Company
 */
public class Poker {

    public static void main(String[] args) {
System.out.println("pepe");
        Carta[] vBaraja = Baraja.crearBaraja();
        Player p = new Player("pepe");
        p.repartir(vBaraja);
        for (int i = 0; i < p.getMano().length; i++) {
            System.out.println(p.getMano()[i]);

        }
        System.out.println("*******************************************************");
        System.out.println("juan");
        Player t = new Player("juan");
         t.repartir(vBaraja);
        for (int i = 0; i < t.getMano().length; i++) {
            System.out.println(t.getMano()[i]);

        }
        System.out.println("*******************************************************");
        
        Baraja.comparar(p, t);
        
        
    }
    
    
}


