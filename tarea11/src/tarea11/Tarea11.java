/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea11;
import java.util.Scanner;
/*Scanner sc = new Scanner(System.in);*
 *
 * @author Carlos
 */

public class Tarea11 {


    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int number1,number2;
      // TODO code application logic here
        funcion1();
        System.out.print("Punto 2"+ "\n");
        System.out.print("Ingresa el primer número  "+ "\n");
        number1 = sc.nextInt();
         System.out.print("Ingresa el segundo número "+ "\n");
        number2 = sc.nextInt();
        
        funcion2(number1,number2);
        
        funcion3();
        System.out.print("Punto 4"+ "\n");
        funcion4();
      
        
      
    }
    
   public static void funcion1()
    
   {System.out.print("Punto 1"+ "\n");
    Scanner sc = new Scanner(System.in);
        
    int num;
    System.out.print("Ingresa número "+ "\n");
    num = sc.nextInt();
    
    if(num==1){
    System.out.print("Valor debe ser mayor a "+ num+ "\n");
    }
    else{
    System.out.print("Valor al cuadrado es : " + num * num + "\n");
    System.out.print("Valor al cubo  es : " + num * num* num + "\n");
    }
        
    }
   
   public  static void funcion2(int number1,int number2)
   { 
       if(number1>number2)
       {
           System.out.print("El numero " + number1 +" es mayor que" + number2 + "\n");
           
      }
       else
       {
           System.out.print("El numero "+number2 +" es mayor que" + number1+ "\n");
       }
   }
   
    
  public  static void funcion3()
{ System.out.print("Punto 3"+ "\n");
    System.out.print("\n");
        char I;

for(I=1;I<255;I++)
{

System.out.print(I);
}
}
   public  static void funcion4()
{System.out.print("Punto 4"+ "\n");
 System.out.print("\n");

for(int i=1;i<6;i++)
{
     char I;

for(I=65;I<(65+i);I++)
{

System.out.print(I);
}
  
System.out.print(i +  "\n");
}
}
  

}


    
    

