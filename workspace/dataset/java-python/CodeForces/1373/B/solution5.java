import java.util.ArrayList;import java.util.List;import java.util.Scanner; public class Game {     public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        String next = scanner.next();        List<String> inputs = new ArrayList<>();        for (int i = 0; i < Integer.parseInt(next); i++) {            inputs.add(scanner.next());        }         for (int i = 0; i < inputs.size(); i++) {            solve(inputs.get(i));        }    }     public static void solve(String str) {        int counter0 = 0;        int counter1 = 0;        for (int i = 0; i < str.length(); i++) {            if (str.charAt(i) == '0')                counter0++;            if (str.charAt(i) == '1')                counter1++;         }        if (counter0 == 1 && counter1 == 1)            System.out.println("DA");        else {             if (Math.min(counter0, counter1) % 2 == 1)                System.out.println("DA");            else                System.out.println("NET");        }     } }   