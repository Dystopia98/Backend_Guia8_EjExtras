package Servicios;

import Entidad.Raiz;
import java.util.Scanner;

public class RaizServicio {
    Scanner leer = new Scanner(System.in);
    public Raiz Numeros(){
        Raiz X = new Raiz();
        System.out.print("a = ");
        X.setA(leer.nextInt());
        System.out.print("b = ");
        X.setB(leer.nextInt());
        System.out.print("c = ");
        X.setC(leer.nextInt());
        return new Raiz(X.getA(),X.getB(),X.getC());
    }
    public double getDiscriminante(Raiz n){
        return ((Math.pow(n.getB(), 2))-4*n.getA()*n.getC());
    }
    public boolean tieneRaices(Raiz n){
        return (getDiscriminante(n) > 0);
    }
    public boolean tieneRaiz(Raiz n){
        return (getDiscriminante(n) == 0);
    }
    public void obtenerRaices(Raiz n){
        if (getDiscriminante(n)>0){
            System.out.print("(-"+(n.getB())+"±√("+(n.getB())+"^2)-(4*"+(n.getA())+"*"+(n.getC())+"))");
            System.out.println("/(2*"+(n.getA())+")");
            System.out.println("     =     ");
            System.out.print(((-n.getB())+Math.sqrt((Math.pow(n.getB(), 2)-(4*n.getA()*n.getC()))))/(2*n.getA()));
            System.out.println("     /     "+(((-n.getB())-(Math.sqrt((Math.pow(n.getB(), 2)-(4*n.getA()*n.getC())))))/(2*n.getA())));
        }
    }
    public void obtenerRaiz(Raiz n){
        if (tieneRaiz(n)){
            System.out.println("Unico resultado de ");
            System.out.print("(-"+(n.getB())+"±√("+(n.getB())+"^2)-(4*"+(n.getA())+"*"+(n.getC())+"))");
            System.out.println("/(2*"+(n.getA())+")");
            System.out.println(((-n.getB())+Math.sqrt((Math.pow(n.getB(), 2)-(4*n.getA()*n.getC()))))/(2*n.getA()));
        }
    }
    public void calcular(Raiz n){
        System.out.println("Calcular :");
        System.out.println("¿Tiene raiz ? : "+tieneRaiz(n));
        if(tieneRaiz(n)){
            obtenerRaiz(n);
        } else {
            System.out.println(" - No existe 1 sola solución - ");
        }
        System.out.println("----------*----------");
        System.out.println("¿Tiene raices? : "+tieneRaices(n));
        if(tieneRaices(n)){
            obtenerRaices(n);
        }else{
            System.out.println(" - No existen 2 soluciones - ");
        }
        
    }
}
