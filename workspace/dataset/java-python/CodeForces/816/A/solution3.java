import java.util.Scanner;  public class Code {     private static  boolean isPalindrom(String s){        for(int i = 0 ; i < s.length(); i ++){            if(s.charAt(i) != s.charAt(s.length()- 1 - i)){                    return false;            }        }        return true;    }     public static void main(String[] args) {        Scanner cin = new Scanner(System.in);        String s = cin.next();        int cnt = 0;        while(true){            if(isPalindrom(s)){                break;            }           int last = Integer.parseInt(s.substring(3));           if(last != 59){               last++;               s = s.substring(0,3) + (last <= 9 ? "0" + last : last);           }else{               int begin = Integer.parseInt(s.substring(0,2));               if(begin == 23){                   cnt ++;                   break;               }               begin ++;               s = (begin <= 9 ? "0" + begin : begin) + ":00";           }            cnt++;        }        System.out.println(cnt);     }}
