
public class Conversiones {

    public static void main(String[] args) {
        System.out.println("\t\tconversiones\n");
        System.out.println("PRIMERA CONVERSION "+convertir(1));
        System.out.println("SEGUNDA CONVERSION "+convertir("2.0",2.0));
        System.out.println("TERCERA CONVERSION "+convertir("1",2));
        
    }

    public static String convertir(int numero_Int) {
        String a;
        a = Integer.toString(numero_Int);
        return a;
    }
    
    public static double convertir(String numero_String, double x) {
        double b;
        b = Double.parseDouble(numero_String); 
        return b+x;
    }

    public static int convertir(String numero_String, int y) {
        int c;
        c = Integer.parseInt(numero_String);
        return c+y;
    }
}
