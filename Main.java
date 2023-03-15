import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    int a,b;
    System.out.println("Podaj liczbę a: ");
    Scanner liczba = new Scanner(System.in);
    a = liczba.nextInt();
    System.out.println("Podaj liczbę b: ");
    b = liczba.nextInt();
    int potega1=(int)Math.pow(a,b);
    int potega2=(int)Math.pow(b,a);
    int x=potega1+potega2;
    System.out.println(""+x);
  }
}