import java.util.Scanner; public class Main {    public static void main(String[] args) {        Scanner capt = new Scanner(System.in);        int n = capt.nextInt();        String x = capt.next();        System.out.println(solution(x));        }     static int solution(String x){        int count = 0;        if(x.charAt(0) == '<'){            int a = x.indexOf('>');            if(a == -1){                return x.length();            }else count+= x.indexOf('>');         }        if(x.charAt(x.length()-1) == '>'){            for(int i=x.length()-1;i>=0;i--){                if(x.charAt(i) == '<')break;                else count++;            }        }        return count;     }  }