import java.util.Scanner; public class RegularBracketSequence {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        String value = sc.next();        char[] chars = value.toCharArray();        int size = chars.length;        int counter =0;        for(int i=0; i<chars.length; i++){            if(chars[i] == '('){                counter++;            }else {                counter--;                if(counter < 0){                    size--;                    counter=0;                }            }        }        System.out.println(size - counter);    }}
