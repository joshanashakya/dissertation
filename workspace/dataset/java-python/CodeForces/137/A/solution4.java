import java.util.Scanner; public class PostCardPhotos {    public static void main(String[] args) {        Scanner scan = new Scanner(System.in);         String s = scan.nextLine();        int closet = 1;        int count = 1;        char prev = s.charAt(0);         for (int i=1;i<s.length();i++){            if(prev == s.charAt(i)){                if(count == 5){                    count = 0;                    closet++;                }                count++;            }else {                count = 1;                closet++;                if(count == 5){                    count = 0;                }            }            prev = s.charAt(i);        }        System.out.println(closet);    }}