 import java.util.Scanner; public class expreession {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int a = sc.nextInt();        int b = sc.nextInt();        int c = sc.nextInt();        if(a==1 && b==1 && c!=1){            System.out.println((a+b)*c);        }        else if(a==1 && b!=1 && c!=1){            System.out.println((a+b)*c);        }       else if(a==1 && b==1 && c==1){            System.out.println(a+b+c);        }       else if(a==1 && b !=1 &&c ==1){            System.out.println(a+b+c);        }       else if(a!=1 && b==1 && c==1){            System.out.println(a*(b+c));        }       else if(a!=1 && b==1 && c!=1){           if(a>c){               System.out.println(a*(b+c));           }           else {               System.out.println((a+b)*c);           }        }       else if(a!=1 && b!=1 &&c==1){            System.out.println(a*(b+c));        }        else{            System.out.println(a*b*c);        }    }}
