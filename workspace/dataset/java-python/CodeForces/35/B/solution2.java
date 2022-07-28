import java.io.*;import java.util.*;import java.util.regex.Matcher;import java.util.regex.Pattern;import java.util.stream.Collectors; public class CodeForces {    public static void main(String[] args) throws FileNotFoundException {        FastIO io = new FastIO();         int shelves = io.nextInt();        int sections = io.nextInt();         TreeSet<Integer> encodedSlots = new TreeSet<>();         for (int i = 1; i <= shelves; i++) {            for (int j = 1; j <= sections; j++) {                encodedSlots.add(new Slot(i, j).encode(sections));            }        }         int queries = io.nextInt();         Map<String, Integer> slotById = new HashMap<>();         for (int q = 0; q < queries; q++) {            int type = io.nextInt();            if (type == 1) {                Slot slot = new Slot(io.nextInt(), io.nextInt());                 String id = io.nextToken();                 Integer freeSlot = encodedSlots.ceiling(slot.encode(sections));                 if (freeSlot != null) {                    encodedSlots.remove(freeSlot);                    slotById.put(id, freeSlot);                }            } else {                String id = io.nextToken();                 Integer encodedSlot = slotById.get(id);                if (encodedSlot != null) {                    encodedSlots.add(encodedSlot);                    slotById.remove(id);                     Slot slot = Slot.decode(encodedSlot, sections);                    io.println(slot.shelf + " " + slot.section);                } else {                    io.println("-1 -1");                }            }        }         io.close();    }     static class Slot {        int shelf;        int section;         public Slot(int shelf, int section) {            this.shelf = shelf;            this.section = section;        }         public int encode(int sectionSize) {            return shelf * (sectionSize + 1) + section;        }         public static Slot decode(int encoded, int sectionSize) {            return new Slot(encoded / (sectionSize + 1), encoded % (sectionSize + 1));        }    }     static class FastIO extends PrintWriter {        BufferedReader br;        StringTokenizer st;         public FastIO() throws FileNotFoundException {            super(new BufferedOutputStream(new FileOutputStream("output.txt")));            br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));        }         String next() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         long nextLong() {            return Long.parseLong(next());        }         double nextDouble() {            return Double.parseDouble(next());        }         String nextToken() {            while (st == null || !st.hasMoreElements()) {                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            }            return st.nextToken();        }         String nextLine() {            try {                return br.readLine();            } catch (IOException e) {                e.printStackTrace();            }            return "";        }    }}
