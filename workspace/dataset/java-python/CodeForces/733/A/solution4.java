 import java.util.Scanner; public class CF4 {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        String str = sc.nextLine();        int max = Integer.MIN_VALUE;        int index = 0;        str = 'A'+str+'A';        for (int i = 0; i <str.length() ; i++) {           if (isVowel(str.charAt(i))){               max = Math.max(max, i-index);               index = i;            }        }         System.out.println(max);        sc.close();    }     static  boolean isVowel(char ch){        return  ch == 'A' ||  ch == 'I' ||  ch == 'O' ||  ch == 'Y' ||  ch == 'E' ||  ch == 'U';    }}
