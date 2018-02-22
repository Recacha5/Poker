/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

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
