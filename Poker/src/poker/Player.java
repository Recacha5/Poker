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
        this.mano = new Carta[5];
    }

    public void repartir(Carta[] baraja) {
        Random r = new Random();
        int aux = 0, num = 0;
        while (aux < 5) {
            num = r.nextInt(51);
            if (baraja[num] != null) {
                mano[aux] = baraja[num];
                baraja[num] = null;
                aux++;
            }

        }
        for (int i = 0; i < (mano.length - 1); i++) {
            for (int j = i + 1; j < mano.length; j++) {
                if (mano[i].getValor() > mano[j].getValor()) {
                    //Intercambiamos valores
                    Carta variableauxiliar = mano[i];
                    mano[i] = mano[j];
                    mano[j] = variableauxiliar;

                }
            }
        }

    }

    private boolean dPareja() {
        int aux = 0;
        for (int i = 1; i < mano.length; i++) {
            if (mano[i].getValor() == mano[i - 1].getValor()) {
                aux++;
                i++;
            }
        }
        if (aux == 2) {
            return true;
        } else {
            return false;
        }

    }

    private boolean pareja() {
        int aux = 1;
        for (int i = 1; i < mano.length; i++) {
            if (mano[i].getValor() == mano[i - 1].getValor()) {
                aux++;
            }
        }
        if (aux == 2) {
            return true;
        } else {
            return false;
        }

    }

    private boolean full() {

        if ((mano[0].getValor() == mano[1].getValor()) && (mano[1].getValor() == (mano[2].getValor()))) {
            if ((mano[3].getValor() == mano[4].getValor())) {
                return true;
            }
        } else if ((mano[2].getValor() == mano[3].getValor()) && (mano[3].getValor() == (mano[4].getValor()))) {
            if ((mano[0].getValor() == mano[1].getValor())) {
                return true;
            }
        }

        return false;

    }

    private boolean trio() {
        int aux = 1;
        for (int i = 1; i < mano.length; i++) {
            if (mano[i].getValor() == mano[i - 1].getValor()) {
                aux++;
            }
        }
        if (aux == 3) {
            return true;
        } else {
            return false;
        }

    }

    private boolean poker() {
        int aux = 1;
        for (int i = 1; i < mano.length; i++) {
            if (mano[i].getValor() == mano[i - 1].getValor()) {
                aux++;
            }
        }
        if (aux == 4) {
            return true;
        } else {
            return false;
        }

    }

    private boolean color() {
        boolean correcto = false;
        for (int i = 1; i < mano.length; i++) {
            if (mano[i].getSimbolo().equalsIgnoreCase(mano[i - 1].getSimbolo())) {
                correcto = true;
            } else {
                return false;
            }
        }
        return correcto;
    }

    private boolean escalera() {
        boolean correcto = false;
        for (int i = 1; i < mano.length; i++) {
            if ((mano[i - 1].getValor() + 1) == (mano[i].getValor())) {
                correcto = true;
            } else {
                return false;
            }
        }
        return correcto;
    }

    private boolean escaleraReal() {
        boolean correcto = false;

        if ((mano[0].getValor() == 10) && (escalera()) && (color())) {
            correcto = true;
        } else {
            return false;
        }

        return correcto;
    }
    private int[] dParejaMayor(){
        int[] dp = new int[2];
        dp[0]=0;
        for (int i = 1; i < mano.length; i++) {
            if(mano[i-1].getValor()==mano[i].getValor()){
                if(mano[i].getValor()>dp[0]){
                    dp[0]=mano[i].getValor();
                    dp[1]=mano[i].getValor();
                }else{
                   dp[1]=mano[i].getValor();
                          
                }
                i++;
            }
        }
        return dp;
        
    }
    public int[] puntuacion() {
        int[] aux = new int[3];
        if (escaleraReal()) {
            aux[0] = 9;
            return aux;
        } else if (escalera() && color()) {
            aux[0] = 8;
            aux[1] = mano[4].getValor();
            return aux;
        } else if (poker()) {
            aux[0] = 7;
            aux[1] = mano[2].getValor();
            return aux;
        } else if (full()) {
            aux[0] = 6;
            aux[1] = mano[2].getValor();
            return aux;
        } else if (color()) {
            aux[0] = 5;
            aux[1] = mano[4].getValor();
            return aux;
        } else if (escalera()) {
            aux[0] = 4;
            aux[1] = mano[4].getValor();
            return aux;
        } else if (trio()) {
            aux[0] = 3;
            aux[1] = mano[2].getValor();
            return aux;
        } else if (dPareja()) {
            aux[0] = 2;
            aux[1] = dParejaMayor()[0];
            aux[2] = dParejaMayor()[1];
            return aux;
        } else if (pareja()) {
            aux[0] = 1;
            aux[1] = dParejaMayor()[0];
            return aux;
        } else {
            aux[0] = 0;
            aux[1] = mano[4].getValor();
            return aux;
        }
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
