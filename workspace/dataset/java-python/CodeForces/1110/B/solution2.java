import java.util.Arrays;import java.util.Scanner; public class Tapes {  public static void main(String[] args) {    Scanner sc = new Scanner(System.in);    int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt(); sc.nextLine();    int[] diferencias = new int[n-1];    int anterior = sc.nextInt();    for (int i = 0; i < diferencias.length; i++) {      int actual = sc.nextInt();      diferencias[i] = actual - anterior;      anterior = actual;    }    sc.nextLine();    Arrays.sort(diferencias);    long resultado = k;    for (int i = 0; i < n-k; i++)      resultado += diferencias[i];    System.out.println(resultado);  }}	 	  	 		 			 	  			 	  	  	