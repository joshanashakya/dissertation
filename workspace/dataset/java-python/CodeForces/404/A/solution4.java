import java.util.Scanner; public class JavaApplication1 {     public static void main(String[] args) {       Scanner input =new Scanner(System.in);       int n=input.nextInt();       String [] str=new String[n];       boolean flag=true;        for (int i = 0; i < n; i++) {            str[i]=input.next();        }        char diagonalLetter=str[0].charAt(0);        char secondLetter=str[0].charAt(1);        if(diagonalLetter==secondLetter)            flag=false;        else{            for (int i = 0; i < n; i++) {                for (int j = 0; j < n; j++) {                    if (i == j || j==n-i-1){                        if(str[i].charAt(j) != diagonalLetter){                            flag=false;                            break;                        }                    }                    else{                        if(str[i].charAt(j) != secondLetter){                            flag=false;                            break;                        }                    }                }                if (!flag)  break;            }        }        if(flag)            System.out.println("YES");        else            System.out.println("NO");       input.close();    }}