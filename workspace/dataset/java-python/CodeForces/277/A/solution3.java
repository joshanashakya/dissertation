import java.util.*;import java.io.*; public class CF277A {	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));    static int[] groups;    static int n, m;    static ArrayList<ArrayList<Integer>> langList = new ArrayList<ArrayList<Integer>>();;    static ArrayList<ArrayList<Integer>> empList = new ArrayList<ArrayList<Integer>>();; 	public static void main(String[] args) throws IOException {		String[] stringArr = br.readLine().split(" "); 		n = Integer.parseInt(stringArr[0]);        m = Integer.parseInt(stringArr[1]);         for(int i = 0; i < m; i++) {            langList.add(new ArrayList<Integer>());        }         for(int i = 0; i < n; i++) {            empList.add(new ArrayList<Integer>());        }         groups = new int[n];        Arrays.fill(groups, -1);        boolean isAllZero = true;                for(int i = 0; i < n; i++) {            stringArr = br.readLine().split(" ");            int langCount = Integer.parseInt(stringArr[0]);            if(langCount != 0) isAllZero = false;                        for(int j = 1; j < stringArr.length; j++) {                int curr = Integer.parseInt(stringArr[j]) - 1;                langList.get(curr).add(i);                empList.get(i).add(curr);            }        }         if(isAllZero) {            bw.write(n + "\n");        }        else {            int assignment = 0;            for(int i = 0; i < n; i++) {                if(groups[i] == -1) {                    dfs(i, assignment);                    assignment++;                }            }                        bw.write((assignment-1) + "\n");        } 		bw.close();	}     static void dfs(int index, int assignment) {        if(groups[index] == -1) {            groups[index] = assignment;             for(Integer currLang : empList.get(index)) {                for(Integer currNext : langList.get(currLang) ) {                    dfs(currNext, assignment);                }            }        }    }}