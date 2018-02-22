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
public class Baraja {
    
  public static Carta[] crearBaraja(){
      Carta[] vBaraja = new Carta[52];
      int aux=2;
      for (int i = 0; i < vBaraja.length; i++) {
          if((vBaraja[i]==null)&&(aux<11)){
             vBaraja[i]= new Carta("pica", ""+aux+"");
             aux++;
          }else if ((vBaraja[i]==null)&&(aux>10)){
            vBaraja[i]= new Carta("pica", "a");
            vBaraja[i+1]= new Carta("pica", "j");
            vBaraja[i+2]= new Carta("pica", "q");
            vBaraja[i+3]= new Carta("pica", "k");
            aux=2;
            break;      
          }
      }
      for (int i = 0; i < vBaraja.length; i++) {
          if((vBaraja[i]==null)&&(aux<11)){
             vBaraja[i]= new Carta("diamante", ""+aux+"");
             aux++;
          }else if ((vBaraja[i]==null)&&(aux>10)){
            vBaraja[i]= new Carta("diamante", "a");
            vBaraja[i+1]= new Carta("diamante", "j");
            vBaraja[i+2]= new Carta("diamante", "q");
            vBaraja[i+3]= new Carta("diamante", "k");
            aux=2;
            break;      
          }
      }
      for (int i = 0; i < vBaraja.length; i++) {
          if((vBaraja[i]==null)&&(aux<11)){
             vBaraja[i]= new Carta("corazon", ""+aux+"");
             aux++;
          }else if ((vBaraja[i]==null)&&(aux>10)){
            vBaraja[i]= new Carta("corazon", "a");
            vBaraja[i+1]= new Carta("corazon", "j");
            vBaraja[i+2]= new Carta("corazon", "q");
            vBaraja[i+3]= new Carta("corazon", "k");
            aux=2;
            break;      
          }
      }
      for (int i = 0; i < vBaraja.length; i++) {
          if((vBaraja[i]==null)&&(aux<11)){
             vBaraja[i]= new Carta("trebol", ""+aux+"");
             aux++;
          }else if ((vBaraja[i]==null)&&(aux>10)){
            vBaraja[i]= new Carta("trebol", "a");
            vBaraja[i+1]= new Carta("trebol", "j");
            vBaraja[i+2]= new Carta("trebol", "q");
            vBaraja[i+3]= new Carta("trebol", "k");
            aux=2;
            break;      
          }
      }
     /* boolean si=false;
      for (int i = 0; i < vBaraja.length; i++) {
          if(vBaraja[i]==null){
              si=true;
          }
      }
      System.out.println(si);
      
      */
      return vBaraja;
  }

   
    
}
