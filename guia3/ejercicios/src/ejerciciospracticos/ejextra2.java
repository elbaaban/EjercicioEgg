/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

/**
 *
 * @author elbaj
 */
public class ejextra2 {
     //Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
// A continuación, realizar las instrucciones necesarias para que: 
//B tome el valor de C,
//C tome el valor de A,
//A tome el valor de D 
//y D tome el valor de B.
//Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
        public static void main(String[] args) {
        int A= 10, B = 2, C=3, D=9;
        System.out.println("Valores iniciales: A=" + A + ", B=" + B + ", C=" + C + ", D=" + D);
          {
            int aux = B;
            B = C;
            C = A;
            A = D;
            D = aux;
        } 
        
        System.out.println("Valores finales: A=" + A + ", B=" + B + ", C=" + C + ", D=" + D);
    }
}
//asigarne un valor por teclado
 // public static void main(String[] args) {
 //Scanner leer = new Scanner(System.in);        
 //  int A, B, C, D, aux;
        
   //     System.out.println("Ingresar 4 numeros: ");
     //   A = leer.nextInt();
       // B = leer.nextInt();
       // C = leer.nextInt();
     //   D = leer.nextInt();
        
      //  System.out.println("A: " + A + "\nB: " + B + "\nC: " + C + "\nD: " + D);
        
        //aux=B;
        //B=C;
        //C=A;
        //A=D;
       //D=aux;
        
        //System.out.println("Numeros cambiados: ");
        //System.out.println("A: " + A + "\nB: " + B + "\nC: " + C + "\nD: " + D);
   // }