import java.util.Scanner; public class BigO {     public static void main(String[] args) {        int a, b, n;        int minCapacity = 0;        int du = 0;        int peopleAtStop = 0;        Scanner sc = new Scanner(System.in);        n = sc.nextInt();        for(int i = 0; i < n; i++){           a = sc.nextInt();           b = sc.nextInt();                      peopleAtStop = b - a + du;           du = peopleAtStop;           if(peopleAtStop > minCapacity){               minCapacity = peopleAtStop;           }       }        System.out.println(minCapacity);     } }