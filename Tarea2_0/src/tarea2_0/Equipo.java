/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2_0;

/**
 *
 * @author Carlos
 */
public class Equipo {
      public int partidos_Ganados;
    public int Puntos_a_Favor;
    public int Puntos_En_Contra;
    
    public Equipo( int pg, int pf, int pc ){
        this.partidos_Ganados = pg;
        this.Puntos_a_Favor = pf;
        this.Puntos_En_Contra = pc;
    }
}
