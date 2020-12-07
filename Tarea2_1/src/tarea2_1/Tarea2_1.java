/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2_1;
import java.util.*;

/**
 *
 * @author Carlos
 */
public class Tarea2_1 {
public  static ArrayList<Venta> Sell = new ArrayList<Venta>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        
        ArrayList<Vehiculo> v = new ArrayList<Vehiculo>();
        Scanner sc = new Scanner(System.in);
        
        Vehiculo mob  = new Vehiculo(1,"Camioneta",2020,"toyota",0);
        v.add(mob);
        
        mob = new Vehiculo(2,"Sedan",2015,"Nissan",150999);
        v.add(mob);
        
        mob = new Vehiculo(3,"Motocicleta",2020,"Kofai",0);
        v.add(mob);
        
        mob = new Vehiculo(4,"Camioneta",2019,"toyota",10000);
        v.add(mob);
        
        mob = new Vehiculo(5,"Sedan",2020,"KIA",5000);
        v.add(mob);       
       ListaVehiculos(v); 
       
       Vnt();      
    }
     static void ListaVehiculos(ArrayList<Vehiculo> Lv){
         System.out.println("Lista de Vehiculos existentes");       
         for(Vehiculo l:Lv){           
         System.out.println("Codigo:"+l.Cod+" "+"Modelo:"+l.Modelo+" "+"Kilomtros: "+l.kilometros+" "+" Marca:"+" "+l.Patente+" "+"Tipo:"+" "+l.Tipo);
         System.out.println("-------------------------------------------------------------------|");
         }         
     }
      public static void Vnt(){
       Scanner sc = new Scanner(System.in);
       int a, b;
       String c,d;
       
       
       
       int e;
       System.out.print("Desea realizar una venta? 1= para continuar/2=para cancelar "+ "\n");
       e = sc.nextInt();
          
       while(e==1)
       {
            System.out.print("Monto venta "+ "\n");
       a = sc.nextInt();
       System.out.print("VehiculoVend "+ "\n");
       b = sc.nextInt();
       System.out.print("Nombre "+ "\n");
       c =sc.next();
       System.out.print("Ced "+ "\n");
       d= sc.next();
       
       Venta Vt = new Venta(a,b,c,d);
       Sell.add(Vt);
       
       System.out.print( "\n");
       Imp();
           System.out.print( "\n");
           System.out.println("-------------------------------------------------------------------|");
           System.out.print("Desea realizar una venta? 1= para continuar/2=para cancelar "+ "\n");
       e = sc.nextInt();
      
       }
              
               
     }
       
      public static void Imp(){
          for(int x = 0; x<Sell.size();x++)
          {
          System.out.print(" Monto de Venta: "+Sell.get(x).MontoVenta+"Vehiculo Vendido: "+Sell.get(x).VehiculoVend+" Nombre: "+Sell.get(x).Nombre+" Cedula: "+Sell.get(x).Ced+"\n");
          
          }
      }
      }
      
      
    

