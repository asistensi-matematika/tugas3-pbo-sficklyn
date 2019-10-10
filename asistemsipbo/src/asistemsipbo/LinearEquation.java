/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistemsipbo;
import java.util.Scanner;
/**
 *
 * @author Hellau
 */
public class LinearEquation {
    private double a, b, c, d, e, f;
    Scanner input = new Scanner(System.in);
    
    public LinearEquation(){
        a=0;
        b=0;
        c=0;
        d=0;
        e=0;
        f=0;
    }
    
    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a = input.nextDouble();
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b = input.nextDouble();
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c = input.nextDouble();
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d = input.nextDouble();
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e = input.nextDouble();
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f = input.nextDouble();
    }

    public void setF(double f) {
        this.f = f;
    }
    public void cekSolusi(){
        double solusi = (a*d)-(b*c);
        if(solusi != 0){
      
            double x = ((e*d)-(b*f))/((a*d)-(b*c));
            double y = ((a*f)-(e*c))/((a*d)-(b*c));
            System.out.println("");
            System.out.println("Hasilnya : ");
            if (x==-0){
                System.out.printf("X = 0.00 , "+"Y = %.2f",y);
                System.out.println("");
            }
            else if(y==-0){
                System.out.printf("X = %.2f , "+"Y = 0.00",x);
                System.out.println("");
            }
            else
                System.out.printf("X = %.2f , "+"Y = %.2f",x,y);
                System.out.println("");
                
        }
        else{
            System.out.println("");
            System.out.println("Hasilnya : ");
            System.out.println("Sistem Tidak Memiliki Penyelesaian");
        }
    }
    public void output(){
        System.out.println("");
        System.out.println("Output : ");
        System.out.println("Sistem Persamaannya : ");
        if(b < 0 && d < 0){
            System.out.println(a+"x - "+b*(-1)+"x = "+e);
            System.out.println(c+"x - "+d*(-1)+"x = "+f);
        }
        else if(b < 0){
            System.out.println(a+"x - "+b*(-1)+"x = "+e);
            System.out.println(c+"x + "+d+"x = "+f);       
        }
        else if(d < 0){
            System.out.println(a+"x + "+b+"x = "+e);
            System.out.println(c+"x - "+d*(-1)+"x = "+f);
        }
        else{    
            System.out.println(a+"x + "+b+"x = "+e);
            System.out.println(c+"x + "+d+"x = "+f);
        }
    }
}