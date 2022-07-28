import java.util.HashMap;import java.util.Scanner; public class Problem_43B {    public static void main(String[] args) {        Scanner s = new Scanner(System.in);        char[] heading = s.nextLine().toCharArray();        char[] text = s.nextLine().toCharArray();         HashMap<Character, Integer> freqOf = new HashMap<>();        for(int i = 0; i < heading.length; i++) {            if(heading[i] == ' ') continue;             freqOf.computeIfPresent(heading[i], (K,V) -> V + 1);            freqOf.putIfAbsent(heading[i], 1);        } //        System.out.println(freqOf);         for(int i = 0; i < text.length; i++) {            if(text[i] == ' ') continue;            if(!freqOf.containsKey(text[i])) {                System.out.println("NO");                return;            } else if(freqOf.get(text[i]) <= 0) {                System.out.println("NO");                return;            } else {                freqOf.computeIfPresent(text[i], (K,V) -> V - 1);            }        }         System.out.println("YES");     }}
