import java.util.*;    public class geek {            public static void main(String[] args) {        Scanner s=new Scanner(System.in);        try{            StringBuffer sb=new StringBuffer();              int n=s.nextInt();                int ans=0;                 for (int i = 1; i <= n; i++) {                    for (int j = i; j <= n; j++) {                         double sqrt = Math.sqrt((i * i) + (j * j));                        if (sqrt%1==0  && sqrt <= n) {                            ans++;                        }                    }                }                sb.append(ans + "\n");                               System.out.println(sb);                     //solve.show(a);            //  solve.show(b);             }catch (Exception e){            System.out.println(e.getMessage());        }     } }          