import java.util.Scanner;public class  Main{    public static void main(String [] args){        Scanner s = new Scanner(System.in);        String ch;        do{            ch=s.next();        }while((ch.length() < 1) && (ch.length() > 100));        if(ch.equals(ch.toUpperCase())){            System.out.println(ch.toLowerCase());        }        else if(Character.isLowerCase(ch.charAt(0)) && (ch.substring(1)).equals((ch.substring(1)).toUpperCase())){            System.out.println(Character.toUpperCase(ch.charAt(0)) + (ch.substring(1)).toLowerCase());        }        else{            System.out.println(ch);        }    }}
