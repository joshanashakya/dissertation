import java.util.*; //_________________________________________________________________public class Main {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);//        int t=sc.nextInt();//        while (t-->=1){////        }        String s=sc.next(),t=sc.next();        StringBuilder sb = new StringBuilder();        int c=0;        boolean f=true;        for (int i=0;i<s.length();i++){            if (s.charAt(i)==t.charAt(i)){                sb.append(s.charAt(i));                            }            else{                if (c%2==0)sb.append(s.charAt(i));                else sb.append(t.charAt(i));                c++;            }        }        if (c%2==1){            System.out.println("impossible\n");        }        else System.out.println(sb.toString());       }}