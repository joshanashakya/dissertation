import java.io.*;import java.util.HashMap;import java.util.HashSet;import java.util.Objects; public class Solution {    public static void main(String[] args) {        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))        ){            String[] nmk = reader.readLine().split(" ");            int n = Integer.parseInt(nmk[0]), m = Integer.parseInt(nmk[1]), k = Integer.parseInt(nmk[2]);            HashMap<Integer, HashSet<Pair>> cities = new HashMap<>();            for (int i = 0; i < m; i++) {                String[] uvl = reader.readLine().split(" ");                int u = Integer.parseInt(uvl[0]), v = Integer.parseInt(uvl[1]), l = Integer.parseInt(uvl[2]);                if (!cities.containsKey(u)) {                    cities.put(u, new HashSet<>());                }                cities.get(u).add(new Pair(v, l));                if (!cities.containsKey(v)) {                    cities.put(v, new HashSet<>());                }                cities.get(v).add(new Pair(u, l));            }            HashSet<Integer> storages = new HashSet<>();            if (k != 0) {                String[] ks = reader.readLine().split(" ");                for (String s : ks) {                    storages.add(Integer.parseInt(s));                }            }            int min = Integer.MAX_VALUE;            for (int u : storages) {                if (cities.containsKey(u)) {                    for (Pair v : cities.get(u)) {                        if (!storages.contains(v.getV())) {                            if (min > v.getLen()) {                                min = v.getLen();                            }                        }                    }                }            }            if (min == Integer.MAX_VALUE) {                writer.write("-1\n");            } else {                writer.write(min + "\n");            }        } catch (IOException e) {         }    }    private  static class Pair {        private int v;        private int len;         public Pair(int v, int len) {            this.v = v;            this.len = len;        }         public int getLen() {            return len;        }         public int getV() {            return v;        }         @Override        public boolean equals(Object o) {            if (this == o) return true;            if (!(o instanceof Pair)) return false;            Pair pair = (Pair) o;            return v == pair.v && len == pair.len;        }         @Override        public int hashCode() {            return Objects.hash(v, len);        }    } }