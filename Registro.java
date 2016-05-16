import java.util.Scanner;

public class Registro {
    private static String user, password;
    private static int numero_registro;
    
    public static void imprimir(String a, String b, int c){
        System.out.println("\n\n\nDatos del usuario:\nUsuario: "+a+"\nPassword: "+b+"\nNumero de registro: "+c);
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Registro y = new Registro();
        System.out.print("Digite el usuario: ");
        y.user = x.nextLine();
        System.out.print("\nDigite la contraseña: ");
        y.password = x.nextLine();
        System.out.print("\nDigite el numero de registro: ");
        y.numero_registro = x.nextInt();
        y.imprimir(user, password, numero_registro);

    }
}
