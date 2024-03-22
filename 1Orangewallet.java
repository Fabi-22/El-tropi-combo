import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    String nombre, apellido,tipodocumento, password, password2;
    String numdocumento;
    System.out.print("escribe tu nombre: ");
    nombre = sc.nextLine();
    System.out.print("escribe tu apellido: ");
      apellido= sc.nextLine();
     System.out.print("digita tu numero de documento: ");
    numdocumento= sc.nextLine();
    System.out.print("tipo de documento: ");
    tipodocumento=sc.nextLine();
    System.out.print("crea una contraseña: ");
    password= sc.nextLine();
   System.out.print("confirma tu contraseña por favor: ");
    password2= sc.nextLine();

    if (password2.equals(password)){
    System.out.print("Bienvenido a Orange wallet: ");
    }
    else {
    System.out.print("tus contraseñas no coinciden acegurate de que las ingresaste bien");
       
  }
         
}
}
