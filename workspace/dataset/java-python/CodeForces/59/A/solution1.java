import java.util.Scanner;/** * * @author mehia */public class Main {     /**     * @param args the command line arguments     */    public static void main(String[] args) {        // TODO code application logic here        Scanner s= new Scanner(System.in);        int upper=0,lower=0;                                String ch,y ;               ch = s.next();        for (int i=0;i<ch.length();i++){            if(Character.isLowerCase(ch.charAt(i))){                lower++;            }else{                upper++;            }        }        if(lower>upper){            y=ch.toLowerCase();        }else if (lower==upper){            y=ch.toLowerCase();        }else{            y=ch.toUpperCase();        }             System.out.println(y);            }    }