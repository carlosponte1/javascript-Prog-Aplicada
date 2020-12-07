/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2_1;

/**
 *
 * @author Carlos
 */
public class Venta {
    public int MontoVenta;
    public int VehiculoVend;
    public String Nombre;
    public String Ced;
    
    public Venta(int MontoVenta,int VehiculoVend,String Nombre, String Ced){
      this.Ced =Ced;
      this.MontoVenta=MontoVenta;
      this.Nombre=Nombre;
      this.VehiculoVend=VehiculoVend;
    }
}

