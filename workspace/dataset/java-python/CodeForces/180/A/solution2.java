// Name: William James// Date: Feb 7, 2019// Description: import java.util.*;import java.io.*; public class Main {     public static void main(String[] args) throws Exception {        PrintWriter out = new PrintWriter(System.out);        in.init(System.in);        ArrayList<String> answers = new ArrayList<>();        int numClusters = in.nextInt();        int numFiles = in.nextInt();        int numClustersInRow, posInArray;        int[] arr = new int[numClusters];        for (int i = 0; i < numClusters; i++) {           arr[i] = -1;        }        int counter = 0;        for (int i = 0; i < numFiles; i++) {            numClustersInRow = in.nextInt();            for (int j = 0; j < numClustersInRow; j++) {                  arr[in.nextInt() - 1] = counter++;            }        }                for (int i = 0; i < arr.length; i++) {            if (arr[i] != i) {                if (arr[i] != -1) {                    for (int j = 0; j < arr.length; j++) {                        if (arr[j] == -1) {                            arr[j] = arr[i];                            answers.add((i + 1) + " " + (j + 1));                            break;                        }                    }                }                for (int j = i + 1; j < arr.length; j++) {                    if (arr[j] == i)                    {                        arr[i] = arr[j];                        arr[j] = -1;                        answers.add((j+1) + " " + (i + 1));                    }                }            }        }        System.out.println(answers.size());        for(String s : answers)        {            out.println(s);        } //        for (int i = 1; i < count + 1; i++) {//            System.out.printf("%d ", arr[i].getFileNum());//            System.out.printf("%d\n", arr[i].getPosNum());//        }        out.close();    }} class Cluster {     int fileNum, posNum;     public Cluster(int fileNum, int posNum) {        this.fileNum = fileNum;        this.posNum = posNum;    }    public Cluster()    {        this.fileNum = -1;        this.posNum = -1;    }     public int getFileNum() {        return fileNum;    }     public int getPosNum() {        return posNum;    } } /** * Class for buffered reading integer and double values */class in {     static BufferedReader reader;    static StringTokenizer tokenizer;     /**     * call this method to initialize reader for InputStream     */    static void init(InputStream input) {        reader = new BufferedReader(new InputStreamReader(input));        tokenizer = new StringTokenizer("");    }     /**     * get next word     */    static String next() throws IOException {        while (!tokenizer.hasMoreTokens()) {            //TODO add check for eof if necessary            tokenizer = new StringTokenizer(reader.readLine());        }        return tokenizer.nextToken();    }     static int nextInt() throws IOException {        return Integer.parseInt(next());    }     static double nextDouble() throws IOException {        return Double.parseDouble(next());    }}