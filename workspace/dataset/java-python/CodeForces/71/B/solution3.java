import java.util.Scanner; public class LongWords {     public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);         int n = scanner.nextInt();        int t = scanner.nextInt();        int k = scanner.nextInt();         int completed = n*t*k/100;         int number_of_completed = completed/t;         boolean isremaining = true;         for(int i=0;i<n ;i++){             if(i<number_of_completed){                System.out.print(t+" ");                completed = completed -t;            }else if(completed<t && isremaining){                 System.out.print(completed+" ");                isremaining = false;             }else {                System.out.print("0"+" ");            }        }      }  }