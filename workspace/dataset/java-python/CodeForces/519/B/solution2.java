import java.util.ArrayList;import java.util.List;import java.util.Scanner; public class Main {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        int num = scanner.nextInt();        List<Integer> list1 = new ArrayList<>();        List<Integer> list2 = new ArrayList<>();        List<Integer> list3 = new ArrayList<>();        for (int i = 0; i < num; i++) {            int n = scanner.nextInt();            list1.add(n);        }        for (int j = 0; j < num - 1; j++) {            int n = scanner.nextInt();            list2.add(n);        }        for (int j = 0; j < num - 2; j++) {            int n = scanner.nextInt();            list3.add(n);        }        System.out.println(compareList(list1, list2));        System.out.println(compareList(list2, list3));    }     private static int compareList(List<Integer> list1, List<Integer> list2) {        int result = 0;        for (int i = 0; i < list1.size(); i++) {            result = result ^ list1.get(i);        }        for (int j = 0; j < list2.size(); j++) {            result = result ^ list2.get(j);        }        return result;    } } 		   	   		 		 		 	 	 		 		   	