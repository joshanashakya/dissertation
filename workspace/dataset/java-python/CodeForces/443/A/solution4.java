import java.util.Arrays;import java.util.HashSet;import java.util.Scanner;import java.util.Set; public class Main {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        String str = scanner.nextLine();        String s = str.substring(1, str.length() - 1);         String arrOfStr[] = s.split(", ");                Set<String> hashSet = new HashSet<>();         hashSet.addAll(Arrays.asList(arrOfStr));         if(str.equals("{}")){            System.out.println(0);        }else {            System.out.println(hashSet.size());        }    }}
