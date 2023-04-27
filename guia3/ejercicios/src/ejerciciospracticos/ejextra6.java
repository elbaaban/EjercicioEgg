/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos;

import java.util.Scanner;

/**
 *
 * @author elbaj
 */
public class ejextra6 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos números enteros positivos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        String opcion;
        do {
            System.out.println("Seleccione una opción"
                    + "\n1. Sumar"
                    + "\n2. Restar"
                    + "\n3. Multiplicar"
                    + "\n4. Dividir"
                    + "\n5. Salir"
                    + "\nElija opción");
            opcion = leer.next();
            switch (opcion) {
                case "1":
                    System.out.println("La suma de " + num1 + " con " + num2 + " es de: " + (num1 + num2));
                    break;
                case "2":
                    System.out.println("La resta de " + num1 + " con " + num2 + " es de: " + (num1 - num2));
                    break;
                case "3":
                    System.out.println("La multiplicacion de " + num1 + " con " + num2 + " es de: " + (num1 * num2));
                    break;

                case "4":
                    System.out.println("La división de " + num1 + " con " + num2 + " es de: " + (num1 / num2));
                    break;
                case "5":
                    System.out.println("Seguro desea salir?");
                    opcion = leer.next();
            }
        } while (!"S".equalsIgnoreCase(opcion));
    }
    
}
//Scanner leer = new Scanner(System.in);

// //      int opcion;
//    //   String confir = "N";
//       int num1;
//       int num2;
//       double resultado = 0;
//       String S = "S";
//
//       System.out.println("Ingrese un numero");
//       num1 = leer.nextInt();
//
//       System.out.println("Ingrese el segundo numero");
//       num2 = leer.nextInt();
//
//       do{
//           System.out.println("MENU");
//           System.out.println("1 - Sumar.");
//           System.out.println("2 - Restar.");
//           System.out.println("3 - Multiplicar.");
//           System.out.println("4 - Dividir.");
//           System.out.println("5 - Salir.");
//           System.out.println("Elija una opción.");
//           opcion = leer.nextInt();
//           switch(opcion)
//           {
//               case 1:
//                    resultado = num1 + num2;
//                    System.out.println("El resultado de la suma es " + resultado);
//                    break;
//               case 2:
//                   resultado = num1 - num2;
//                   System.out.println("El resultado de la resta es " + resultado);
//                   break;
//               case 3:
//                   resultado = num1 * num2;
//                   System.out.println("El resultado de la multiplicacion es " + resultado);
//                   break;
//               case 4:
//                   resultado = num1/num2;
//                   System.out.println("El resultado de la division es " + resultado);
//                   break;
//
//               case 5:
//                   System.out.println("¿Está seguro que desea salir del programa (S/N)?");
//                   confir = leer.next();
//                   break;
//               default:
//                   System.out.println("la opción es incorrecta");
//                   break;
//
//           }
//
//       }while(!confir.substring(0, 1).equalsIgnoreCase("S"));