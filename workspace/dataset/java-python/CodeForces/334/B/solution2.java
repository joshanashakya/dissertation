import java.util.*; public class Bai8 {    static final int MAX = (int) 1e6 + 6;      public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        ArrayList<Vector> array = new ArrayList<>();        int[] freqX = new int[MAX], freqY = new int[MAX];        int distinctX = 0, distinctY = 0;        int[] xDis = new int[3], yDis = new int[3];          for (int i = 0; i < 8; i++) {            int x = sc.nextInt();            int y = sc.nextInt();            freqX[x]++;             if (freqX[x] == 1) {                if (distinctX > 2) {                    System.out.println("ugly");                    return;                }                xDis[distinctX] = x;                distinctX++;             }            freqY[y]++;            if (freqY[y] == 1) {                if (distinctY > 2) {                    System.out.println("ugly");                    return;                }                yDis[distinctY] = y;                distinctY++;             }            array.add(new Vector(x, y, i));        }        if (distinctX != 3 && distinctY != 3) {            System.out.println("ugly");        } else {            Collections.sort(array);            Arrays.sort(xDis);            Arrays.sort(yDis);             if (array.get(0).x == xDis[0] && array.get(0).y == yDis[0] &&                    array.get(1).x == xDis[0] && array.get(1).y == yDis[1] &&                    array.get(2).x == xDis[0] && array.get(2).y == yDis[2] &&                    array.get(3).x == xDis[1] && array.get(3).y == yDis[0] &&                    array.get(4).x == xDis[1] && array.get(4).y == yDis[2] &&                    array.get(5).x == xDis[2] && array.get(5).y == yDis[0] &&                    array.get(6).x == xDis[2] && array.get(6).y == yDis[1] &&                    array.get(7).x == xDis[2] && array.get(7).y == yDis[2]) {                System.out.println("respectable");            } else System.out.println("ugly");         }    }     public static class Vector implements Comparable<Vector> {        public Integer x;        public Integer y;        public Integer index;         Vector(int x, int y, int index) {            this.x = x;            this.y = y;            this.index = index;        }         @Override        public String toString() {            return x + " " + y + "\n";        }          @Override        public int compareTo(Vector o) {            if (!o.x.equals(this.x))                return this.x.compareTo(o.x);             return this.y.compareTo(o.y);        }    }} 
