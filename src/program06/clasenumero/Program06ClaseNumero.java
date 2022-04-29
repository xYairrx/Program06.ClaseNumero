/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program06.clasenumero;

/**
 *
 * @author Yair
 */
public class Program06ClaseNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Escribir en Java una clase llamada MiNumero que calcule el doble, el triple y el cuádruple de un número y permita sumarlo
        // y restarlo con otros números.

        MiNumero numero1 = new MiNumero(10);
        MiNumero numero2 = new MiNumero();

        numero1.cambiaNumero(100);
        numero1.sumaNumero(100);
        numero1.restaNumero(50);
        numero1.getCuadruple();
        numero1.getCuadrado();
        numero1.getCubo();

        System.out.println(numero1.getNumero());
        System.out.println(numero1.getCubo());
        System.out.println(numero1.getCuadrado());
        System.out.println(numero1.getFactorial(5));

    }
}
