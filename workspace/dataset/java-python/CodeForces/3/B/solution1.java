import java.util.ArrayList;import java.util.Comparator;import java.util.List;import java.util.Scanner; public class T3B {     static Scanner in = new Scanner(System.in);     static int n;    static int v;     static List<Ship> baidarkas = new ArrayList<>();    static List<Ship> katamarans = new ArrayList<>();     static int indexLastBaidarka;    static int indexLastKatamaran;     public static void main(String[] args) {         init(); //считываем данные        sort(); //сортировка по удельному весу        initLastIndex();         while(true) {            if (!step()) {                break;            }        }         System.out.println(calculateCapcity());        print();    }     static void init() {        n = in.nextInt();        v = in.nextInt();         for (int i = 0; i < n; i++) {            int type = in.nextInt();            int capacity = in.nextInt();             if (type == 1) {                baidarkas.add(new Baidarka(i + 1, capacity));            } else {                katamarans.add(new Katamaran(i + 1, capacity));            }        }    }     static void sort() {        Comparator<Ship> comparator = new Comparator<Ship>() {            @Override            public int compare(Ship o1, Ship o2) {                if (o1.k > o2.k) {                    return -1;                } else if (o1.k == o2.k) {                    return 0;                } else {                    return 1;                }            }        };        baidarkas.sort(comparator);        katamarans.sort(comparator);    }     static void initLastIndex() {        int maxSizeKatamarans = v / 2;        if (katamarans.size() >= maxSizeKatamarans) {            indexLastKatamaran = maxSizeKatamarans - 1; //-1, т. к. индекс в списке        } else {            indexLastKatamaran = katamarans.size() - 1;        }         int maxSizeBaidarkasAmongRamaingPlaces = v - (indexLastKatamaran + 1) * 2;        if (baidarkas.size() >= maxSizeBaidarkasAmongRamaingPlaces ) {            indexLastBaidarka = maxSizeBaidarkasAmongRamaingPlaces - 1;        } else {            indexLastBaidarka = baidarkas.size() - 1;        }    }     static boolean step() {        if (indexLastKatamaran == -1) {            return false;        }         int indexNextBaidarka = indexLastBaidarka + 1;        if (indexNextBaidarka < baidarkas.size()) {            int newP = baidarkas.get(indexNextBaidarka).p;            int currentP = katamarans.get(indexLastKatamaran).p;             int indexNextNextBaidarka = indexLastBaidarka + 2;            if (indexNextNextBaidarka < baidarkas.size()) {                newP += baidarkas.get(indexNextNextBaidarka).p;                 if (newP > currentP) {                    indexLastBaidarka++;                    indexLastBaidarka++;                     indexLastKatamaran--;                    return true;                } else {                    return false;                }            } else {                if (newP > currentP) {                    indexLastBaidarka++;                    indexLastKatamaran--;                }                return false;            }        } else {            return false;        }    }     static int calculateCapcity() {        int capacity = 0;         for (int i = 0; i <= indexLastKatamaran; i++) {            capacity += katamarans.get(i).p;        }         for (int i = 0; i <= indexLastBaidarka; i++) {            capacity += baidarkas.get(i).p;        }         return capacity;    }     static void print() {        for (int i = 0; i <= indexLastKatamaran; i++) {            System.out.print(katamarans.get(i).index + " ");        }         for (int i = 0; i <= indexLastBaidarka; i++) {            System.out.print(baidarkas.get(i).index + " ");        }    }} class Ship {    int index;    int p; //грузоподъёмность    double k;     public Ship(int index, int p, double v) {        this.index = index;        this.p = p;         k = p / v;    }} class Baidarka extends Ship{    public Baidarka(int index, int p) {        super(index, p, 1.0);    }} class Katamaran extends Ship {    public Katamaran(int index, int p) {        super(index, p, 2.0);    }}
