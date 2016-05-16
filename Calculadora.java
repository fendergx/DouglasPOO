import java.util.Scanner;
public class Calculadora {
    
    public static void main(String[] args) {
        double uno, dos;
        Scanner crazy = new Scanner(System.in);
        Calculadora x = new Calculadora();
        System.out.println("Digite el primer numero");
        uno = crazy.nextDouble();
        System.out.println("Digite el segundo numero");
        dos = crazy.nextDouble();
        System.out.println("La suma: "+x.suma(uno, dos));
        System.out.println("La resta: "+x.resta(uno, dos));
        System.out.println("La multiplicacion: "+x.multi(uno, dos));
        System.out.println("La division: "+x.div(uno, dos));
        
    }
    public double suma(double a, double b){
        return a+b;
    }
    
    public double resta(double a, double b){
        return a-b;
    }
    
    public double multi(double a, double b){
        return a*b;
    }
    
    public double div(double a, double b){
        if(b==0){
            System.out.println("Division entre cero, no existe");
            return 0.0;
        }
        else{
            return a/b;
        }     
    }   
}
