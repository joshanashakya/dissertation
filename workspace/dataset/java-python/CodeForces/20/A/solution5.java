import java.util.Scanner; public class Code19 {    public static void main(String[] args) {        Scanner in=new Scanner(System.in);        String s=in.next();        String res="";        boolean ok=true;        for (int i = 0; i < s.length (); i++) {            if(s.charAt (i)!='/'){                ok=true;                res+=s.charAt (i);            }            else {                if(ok){                    res+="/";                }                ok=false;            }        }        if (res.charAt (res.length () - 1) == '/'&&res.length ()>1) {            res=res.substring (0, res.length () - 1);        }        System.out.println (res);    }}
