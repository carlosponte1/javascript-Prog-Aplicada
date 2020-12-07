/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2_0;
import java.util.ArrayList;
/**
 *
 * @author Carlos
 */
public class Tarea2_0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Equipo> lep = new ArrayList<Equipo>();
        
        //equipo 1
        Equipo ep = new Equipo(3, 30, 6);
        lep.add(ep);
        
        //equipo 2
        ep = new Equipo(3, 30, 2);
        lep.add(ep);
        
        //equipo 3
        ep = new Equipo(7, 20, 7);
        lep.add(ep);
        
        //equipo 4
        ep = new Equipo(8, 23, 8);
        lep.add(ep);
        
        //equipo 5
        ep = new Equipo(10, 30, 2);
        lep.add(ep);
        
        // llama funcion
        ordSelDesc( lep );
        
     }
     
     /**
     * Este método ordena en forma descendente el arreglo pasado como argumento usando el
     * algoritmo de selección.
     * 
     * @param arreglo el arreglo que sera ordenado.
     */
    static void ordSelDesc(ArrayList<Equipo> arreglo) {
        
        System.out.println( "### Recibido ###" );
        for (Equipo e : arreglo) {
            System.out.println( " Ganados " + e.partidos_Ganados + " | Favor " + e.Puntos_a_Favor + " | Contra " + e.Puntos_En_Contra );
        }
        
        //iteramos sobre los elementos del arreglo
        for (int i = 0 ; i < arreglo.size() - 1 ; i++) {
            int max = i;
 
            //buscamos el mayor número
            for (int j = i + 1 ; j < arreglo.size() ; j++) {
                if (arreglo.get(j).partidos_Ganados > arreglo.get(max).partidos_Ganados) {
                    max = j;    //encontramos el mayor número
                }
                else if (arreglo.get(j).partidos_Ganados == arreglo.get(max).partidos_Ganados) {
                    if (arreglo.get(j).Puntos_a_Favor > arreglo.get(max).Puntos_a_Favor) {
                        max = j;    //encontramos el mayor número
                    }
                    else if (arreglo.get(j).Puntos_En_Contra < arreglo.get(max).Puntos_En_Contra) {
                        max = j;    //encontramos el mayor número
                    }
                }
            }
 
            if (i != max) {
                //permutamos los valores
                Equipo aux = arreglo.get(i);
                arreglo.set(i, arreglo.get(max));
                arreglo.set(max, aux);
            }
        }
        
        System.out.println( "============================================" );
        System.out.println( "### Procesado ###" );
        
        for (Equipo e : arreglo) {
            System.out.println( " Ganados " + e.partidos_Ganados + " | Favor " + e.Puntos_a_Favor + " | Contra " + e.Puntos_En_Contra );
        }
    }
    }
    

