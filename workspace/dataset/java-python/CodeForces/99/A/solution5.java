import java.math.BigInteger;
import java.util.Scanner;
public class prob2 {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        String ch = input.nextLine();
        if(ch.contains(".")){
            String ch1 = "";
             int l = ch.indexOf(".");
             char sign  = ch.charAt(l+1);
             char sign1 = ch.charAt(l-1);
             for(int i=0;i<l;++i){
                ch1 += ch.charAt(i)+"";
             }
             if(sign=='5'||sign=='6'||sign=='7'||sign=='8'||sign=='9'||sign1=='9'){
                if(sign1=='9'){
                    System.out.println("GOTO Vasilisa.");
                }else{
                   BigInteger num = new BigInteger(ch1);
                   num = num.add(BigInteger.ONE);
                   System.out.println(num);
                }
             }else{
               System.out.println(ch1);
             }
        }else{
            System.out.println(ch);
        }
    }
}
