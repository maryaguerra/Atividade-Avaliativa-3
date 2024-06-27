import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite Numero");
    int numero = sc.nextInt();
    System.out.printf("Numero = %d", numero);
    if(numero % 2 == 0){
System.out.println(" é par");
 }
else if (numero % 1 ==0){
  System.out.println(" é ímpar");

    sc.close();
  }
  }
}