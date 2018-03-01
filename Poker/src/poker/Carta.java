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
public class Carta {
    private String simbolo;
    private String numero;
    private int valor;

    public Carta(String simbolo, String numero, int valor) {
        this.simbolo = simbolo;
        this.numero = numero;
        this.valor = valor;
    }

    

    @Override
    public String toString() {
        return "Carta{" + "simbolo=" + getSimbolo() + ", numero=" + getNumero();
    }

    
    /**
     * @return the simbolo
     */
    public String getSimbolo() {
        return simbolo;
    }

    /**
     * @param simbolo the simbolo to set
     */
    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    
}
