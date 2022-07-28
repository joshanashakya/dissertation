import java.util.ArrayList;import java.util.HashMap;import java.util.HashSet;import java.util.List;import java.util.Map;import java.util.Scanner;import java.util.Set; public class Main {  public static void main(String[] args) {    Scanner sc = new Scanner(System.in);    String[] str = sc.nextLine().split(" ");    int n = Integer.parseInt(str[0]);    int m = Integer.parseInt(str[1]);    Map<String, Integer> candidateIndexMap = new HashMap<>();    Map<Integer, Set<Integer>> unCompatibilityMap = new HashMap<>();    str = new String[n];    for (int i = 0; i < n; i++) {      str[i] = sc.nextLine();      candidateIndexMap.put(str[i], i);    }     String[][] notCompatible = new String[m][2];    for (int i = 0; i < m; i++) {      notCompatible[i] = sc.nextLine().split(" ");      Set<Integer> orDefault =          unCompatibilityMap.getOrDefault(              candidateIndexMap.get(notCompatible[i][0]), new HashSet<>());      orDefault.add(candidateIndexMap.get(notCompatible[i][1]));      unCompatibilityMap.put(candidateIndexMap.get(notCompatible[i][0]), orDefault);       orDefault =          unCompatibilityMap.getOrDefault(              candidateIndexMap.get(notCompatible[i][1]), new HashSet<>());      orDefault.add(candidateIndexMap.get(notCompatible[i][0]));      unCompatibilityMap.put(candidateIndexMap.get(notCompatible[i][1]), orDefault);    }    solve(str, unCompatibilityMap);    sc.close();  }   private static void solve(String[] str, Map<Integer, Set<Integer>> unCompatibilityMap) {    List<String> finalAns = new ArrayList<>();    for (int i = 0; i < (1 << str.length); i++) {      List<String> a = new ArrayList<>();      for (int j = 0; j < str.length; j++) {        if ((i & (1 << j)) != 0) { // j th bit is set in i, then non zero          boolean canBeAdded = true;          if (unCompatibilityMap.containsKey(j)) {            for (Integer uc : unCompatibilityMap.get(j)) {              if ((i & (1 << uc)) != 0) {                canBeAdded = false;                break;              }            }          }          if (canBeAdded) {            a.add(str[j]);          }        }      }       if (!a.isEmpty()) {        if (a.size() > finalAns.size()) {          finalAns = a;        }      }    }     finalAns.sort(String::compareTo);    System.out.println(finalAns.size());    for (String s : finalAns) {      System.out.println(s);    }  }}