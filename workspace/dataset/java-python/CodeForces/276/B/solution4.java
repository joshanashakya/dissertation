import java.util.*; public class Problem_276B {    public static void main(String[] args) {        Scanner s = new Scanner(System.in);        String str = s.next();         int[] freqOf = new int[26];        for(int i = 0; i < str.length(); i++)            freqOf[str.charAt(i) - 'a']++;         HashMap<Integer, Integer> oddFreqChars = new HashMap<Integer, Integer>();        for(int i = 0; i < 26; i++)            if(freqOf[i] % 2 == 1)                oddFreqChars.put(i, freqOf[i]);         int player = 0;        Iterator<Map.Entry<Integer, Integer>> it = oddFreqChars.entrySet().iterator();        while(it.hasNext()) {            if(oddFreqChars.size() == 1) break;            int oddFreq = it.next().getValue();            player = (player + oddFreq) % 2;            it.remove();        } //        for(Map.Entry<Integer, Integer> entry : oddFreqChars.entrySet()) {//            if(oddFreqChars.size() == 1) break;//            int oddFreq = entry.getValue();//            player = (player + oddFreq) % 2;//            oddFreqChars.remove(entry.getKey());//        }         if(player == 0)            System.out.println("First");        else            System.out.println("Second");     }}