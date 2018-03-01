/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import java.util.Random;

/**
 *
 * @author alumno
 */
public class Player {
    private String nUsuario;
    private Carta[] mano;

    public Player(String nUsuario) {
        this.nUsuario = nUsuario;
        this.mano =new Carta[5];
    }

    public void repartir(Carta[] baraja){
        Random r = new Random();
        int aux = 0 , num = 0 ;
        while(aux<5){
        num =  r.nextInt(51);
        if(baraja[num]!=null){
            mano[aux]=baraja[num];
            baraja[num]=null;
            aux++;
        }    
        
        }
                
      
    }
    
  /*  public int puntuar(){
        for (int i = 0; i < mano.length; i++) {
            
                
            }
        }
    }
    */
    /**
     * @return the nUsuario
     */
    public String getnUsuario() {
        return nUsuario;
    }

    /**
     * @param nUsuario the nUsuario to set
     */
    public void setnUsuario(String nUsuario) {
        this.nUsuario = nUsuario;
    }

    /**
     * @return the mano
     */
    public Carta[] getMano() {
        return mano;
    }

    /**
     * @param mano the mano to set
     */
    public void setMano(Carta[] mano) {
        this.mano = mano;
    }
    
    
}
