import java.util.*; public class App {    public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        int s = sc.nextInt();        if (s > 0 && n > 0) {            TreeMap<Integer, Integer> buy = new TreeMap<>();            TreeMap<Integer, Integer> sell = new TreeMap<>();            sc.nextLine();            for (int i = 0; i < n; i++) {                String[] tokens = sc.nextLine().split(" ");                char type = tokens[0].charAt(0);                int price = Integer.parseInt(tokens[1]);                int quantity = Integer.parseInt(tokens[2]);                switch (type) {                    case 'B':                        if (buy.containsKey(price)) {                            buy.put(price, quantity + buy.get(price));                            break;                        }                        buy.put(price, quantity);                        break;                    case 'S':                        if (sell.containsKey(price)) {                            sell.put(price, quantity + sell.get(price));                            break;                        }                        if (sell.size() == s){                            if (sell.lastKey() > price){                                sell.remove(sell.lastKey());                                sell.put(price, quantity);                            }                            break;                        }                        sell.put(price, quantity);                        break;                    default: break;                }            }             if (sell.size() > 0){                NavigableSet<Integer> sellKeys = sell.descendingKeySet();                int upperBound = 0;                for (Integer sellKey : sellKeys) {                    System.out.println("S " + sellKey + " " + sell.get(sellKey));                    upperBound = sellKey;                }                if (buy.size() > 0){                    SortedSet<Integer> buyKeys = buy.descendingKeySet().tailSet(upperBound);                    Iterator<Integer> buyIt = buyKeys.iterator();                    int counter = 0;                    while (counter < s && buyIt.hasNext()) {                        int price = buyIt.next();                        if (price < upperBound) {                            System.out.println("B " + price + " " + buy.get(price));                            counter++;                        }                    }                }            }            else {                if (buy.size() > 0){                    SortedSet<Integer> buyKeys = buy.descendingKeySet();                    Iterator<Integer> buyIt = buyKeys.iterator();                    int counter = 0;                    while (counter < s && buyIt.hasNext()) {                        int price = buyIt.next();                        System.out.println("B " + price + " " + buy.get(price));                        counter++;                    }                }            }        }    }} 