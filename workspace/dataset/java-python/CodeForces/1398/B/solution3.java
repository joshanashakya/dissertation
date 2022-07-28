import java.util.*;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while (t-->0) {

            char[] s = input.next().toCharArray();
            LinkedList<Integer> list = new LinkedList<>();

            for (int i = 0; i < s.length; i++) {

                int counter = 0;
                while (i <= s.length-1 && s[i] == '1') {
                    counter++;
                    i++;
                }
                if (counter > 0) 
                    list.add(counter);
            }           
            Collections.sort(list, new Reverse());
            int result = 0;
            for (int i = 0; i < list.size(); i+=2) {
                result += list.get(i);
            }
            System.out.println(result);
        }
    }
    static class Reverse implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            if (a < b) return 1;
            else if (a > b) return -1;
            return 0;   
        }
    }
}
