import java.util.Scanner;
/**
 * programa 1 aritmetica
 * 
 * @author alejandro rodriguez mancera
 * @version agosto 2019
 */
public class aritmetica
{
    public static void main(String args[])
    {
       double a,b; //datos de entrada
       double A;   // dato de salida suma
       double B;   // dato de salida diferencia
       double C;   // dato de salida producto
       double D;   // dato de salida cociente
       double E;   // dato de salida residuo
       double F;   // dato de salida logaritmo
       int G;   // dato de salida exponencial
       Scanner teclado = new Scanner(System.in);
       System.out.println("programa aritmetica");
       System.out.println("Digite primer numero a calcular");
       a = teclado.nextDouble();
       System.out.println("Digite segundo numero a calcular");
       b = teclado.nextDouble();
       A = a + b ;
       B = a - b ;
       C = a * b ;
       D = a / b ;
       E = a % b ;
       F = a / b ;
       G = (int) Math.pow(a, b);
       System.out.println("la suma de los numeros es " + A);
       System.out.println("la diferencia de los numeros es " + B);
       System.out.println("el producto de los numeros es " + C);
       System.out.println("el cociente de los numeros es " + D);       
       System.out.println("el residuo de los numeros es " + E);
       System.out.println("el logaritmo de los numeros es " + F);
       System.out.println("la potencia los numeros es " + G);       
    }
}