import java.util.*; public class Main {    public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int n = in.nextInt();         Map<Integer, Stack<Integer>> students = new HashMap<>();        students.put(1, new Stack<>());        students.put(2, new Stack<>());        students.put(3, new Stack<>());         for (int i = 0; i < n; i++) {            students.get(in.nextInt()).push(i + 1);        }        int max = n;        for (Integer i : students.keySet()) {            if(students.get(i).size() < max)                max = students.get(i).size();        }        System.out.println(max);        Stack<Integer> programmers = students.get(1);        Stack<Integer> mathematicians = students.get(2);        Stack<Integer> physicians = students.get(3);          for (int i = 0; i < max; i++) {            System.out.print(programmers.pop() + " ");            System.out.print(mathematicians.pop() + " ");            System.out.println(physicians.pop());        }    }  }
