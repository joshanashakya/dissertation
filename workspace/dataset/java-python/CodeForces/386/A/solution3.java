import java.util.*; public class Solution {    public static void main(String[] args) {        Scanner scan = new Scanner(System.in);        int n = scan.nextInt();        Map<Integer, Integer> prices = new HashMap<>();        for(int i = 0; i<n; i++) {            prices.put(scan.nextInt(), i+1);        }        List<Integer> pList = new ArrayList<>(prices.keySet());        Collections.sort(pList);        int participantN = prices.get(pList.get(n-1));        int sum = pList.get(n-2);        System.out.println(participantN + " " + sum);    }}