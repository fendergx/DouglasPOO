

public class Metodos {

     public int suma(int a, int b){
         return a+b;
        
    }
     
      public int suma(int a, int b, int c){
        return a+b+c;
    }
      
       public int suma(int a, int b, int c, int d){
        return a+b+c+d;
    }
       
       public int suma(int a, int b, int c, int d, int e){
        return a+b+c+d+e;
    }

    public static void main(String[] args) {
        Metodos uno = new Metodos();
        Metodos dos = new Metodos();
        Metodos tres = new Metodos();
        System.out.println("los procesos seran automaticos con datos ya implantados\n*************************\n");
        System.out.println("\t\tprimer objeto");
        System.out.println("suma de 2 numeros "+uno.suma(1, 2));
        System.out.println("suma de 3 numeros "+uno.suma(1, 2, 3));
        System.out.println("suma de 4 numeros "+uno.suma(1, 2, 3, 4));
        System.out.println("suma de 5 numeros "+uno.suma(1, 2, 3, 4, 5));
        
                System.out.println("\n\t\tsegundo objeto");
        System.out.println("suma de 2 numeros "+uno.suma(2, 3));
        System.out.println("suma de 3 numeros "+uno.suma(2, 3, 4));
        System.out.println("suma de 4 numeros "+uno.suma(2, 3, 4, 5));
        System.out.println("suma de 5 numeros "+uno.suma(2, 3, 4, 5, 6));
        
                System.out.println("\n\t\ttercer objeto");
        System.out.println("suma de 2 numeros "+uno.suma(10, 20));
        System.out.println("suma de 3 numeros "+uno.suma(14, 22, 33));
        System.out.println("suma de 4 numeros "+uno.suma(11, 23, 34, 41));
        System.out.println("suma de 5 numeros "+uno.suma(18, 27, 34, 45, 51));
        
    }
    
}
