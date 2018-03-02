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
             vBaraja[i]= new Carta("pica", ""+aux+"",aux);
             aux++;
          }else if ((vBaraja[i]==null)&&(aux>10)){
            
            vBaraja[i+1]= new Carta("pica", "j",aux+1);
            vBaraja[i+2]= new Carta("pica", "q",aux+2);
            vBaraja[i+3]= new Carta("pica", "k",aux+3);
            vBaraja[i]= new Carta("pica", "a",aux+4);
            aux=2;
            break;      
          }
      }
      for (int i = 0; i < vBaraja.length; i++) {
          if((vBaraja[i]==null)&&(aux<11)){
             vBaraja[i]= new Carta("diamante", ""+aux+"",aux);
             aux++;
          }else if ((vBaraja[i]==null)&&(aux>10)){

            vBaraja[i+1]= new Carta("diamante", "j",aux+1);
            vBaraja[i+2]= new Carta("diamante", "q",aux+2);
            vBaraja[i+3]= new Carta("diamante", "k",aux+3);
            vBaraja[i]= new Carta("diamante", "a",aux+4);
            aux=2;
            break;      
          }
      }
      for (int i = 0; i < vBaraja.length; i++) {
          if((vBaraja[i]==null)&&(aux<11)){
             vBaraja[i]= new Carta("corazon", ""+aux+"",aux);
             aux++;
          }else if ((vBaraja[i]==null)&&(aux>10)){

            vBaraja[i+1]= new Carta("corazon", "j",aux+1);
            vBaraja[i+2]= new Carta("corazon", "q",aux+2);
            vBaraja[i+3]= new Carta("corazon", "k",aux+3);
           vBaraja[i]= new Carta("corazon", "a",aux+4);
            aux=2;
            break;      
          }
      }
      for (int i = 0; i < vBaraja.length; i++) {
          if((vBaraja[i]==null)&&(aux<11)){
             vBaraja[i]= new Carta("trebol", ""+aux+"",aux);
             aux++;
          }else if ((vBaraja[i]==null)&&(aux>10)){
  
            vBaraja[i+1]= new Carta("trebol", "j",aux+1);
            vBaraja[i+2]= new Carta("trebol", "q",aux+2);
            vBaraja[i+3]= new Carta("trebol", "k",aux+3);
           vBaraja[i]= new Carta("trebol", "a",aux+4);
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

public static void comparar(Player p1 , Player p2){
    if(p1.puntuacion()[0]==p2.puntuacion()[0]){
       if(p1.puntuacion()[0]!=2){
           if(p1.puntuacion()[1]>p2.puntuacion()[1]){
               System.out.println(p1.getnUsuario() + " ha ganado la ronda por carta alta");
           }else if(p1.puntuacion()[1]<p2.puntuacion()[1]){
                System.out.println(p2.getnUsuario() + " ha ganado la ronda por carta alta");
           }else{
               System.out.println("empate en todo");
           }
       }else{
           if(p1.puntuacion()[1]==p2.puntuacion()[1]){
               if(p1.puntuacion()[2]>p2.puntuacion()[2]){
               System.out.println(p1.getnUsuario() + " ha ganado la ronda por carta alta");
           }else{
                System.out.println(p2.getnUsuario() + " ha ganado la ronda por carta alta");
           }
           }else if(p1.puntuacion()[1]>p2.puntuacion()[1]){
                System.out.println(p1.getnUsuario() + " ha ganado la ronda por carta alta");
           }else if(p1.puntuacion()[1]<p2.puntuacion()[1]){
               System.out.println(p2.getnUsuario() + " ha ganado la ronda por carta alta");
           }else{
               System.out.println("empate en todo");
           }
       }
    }else if(p1.puntuacion()[0]>p2.puntuacion()[0]){
        System.out.println(p1.getnUsuario() + " ha ganado la ronda");
    }else{
        System.out.println(p2.getnUsuario() + " ha ganado la ronda");
    }
    
}
   
    
}
