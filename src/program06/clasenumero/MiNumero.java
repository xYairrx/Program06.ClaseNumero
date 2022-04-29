/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program06.clasenumero;

import java.math.BigInteger;

/**
 *
 * @author Yair
 */
public class MiNumero {

    private int numero;

    public MiNumero(int numero) {
        this.numero = numero;
    }

    public MiNumero() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void cambiaNumero(int num) {
        numero = num;
    }

    public void sumaNumero(int num) {
        numero = numero + num;
    }

    public void restaNumero(int num) {
        numero = numero + num;
    }

    public int getDoble() {
        return numero * 2;
    }

    public int getTriple() {
        return numero * 3;
    }

    public int getCuadruple() {
        return numero * 4;
    }

    public int getCuadrado() {
        return numero ^ 2;
    }

    public int getCubo() {
        return numero ^ 3;
    }
    
    public int getFactorial(int num){
        for( int i = 1; i <= numero; i++ ) {
         num *= i;
      }
 
      return num;
    }
}
    

