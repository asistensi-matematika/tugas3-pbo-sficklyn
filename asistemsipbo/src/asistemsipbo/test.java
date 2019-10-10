/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistemsipbo;

/**
 *
 * @author Hellau
 */
public class test {
    public static void main(String[] args) {
        LinearEquation run = new LinearEquation();
        System.out.print("Input : ");
        run.getA();
        run.getB();
        run.getC();
        run.getD();
        run.getE();
        run.getF();
        run.output();
        run.cekSolusi();
    }
}
