import java.util.ArrayList;import java.util.List;import java.util.Scanner; public class QAQ {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        String line = scanner.nextLine();         List<Integer> qPos = new ArrayList<>();        List<Integer> aPos = new ArrayList<>();         for (int i = 0; i < line.length(); i++) {            if (line.charAt(i) == 'Q') {                qPos.add(i);            }            if (line.charAt(i) == 'A') {                aPos.add(i);            }        }         // qpos = 0,2,4        // apos = 1,3         int res = 0;        for (int i = 0; i < qPos.size(); i++) {            for (int j = 0; j < aPos.size(); j++) {                for (int k = 0; k < qPos.size(); k++) {                    if (qPos.get(i) < aPos.get(j) && aPos.get(j) < qPos.get(k)) {                        res++;                    }                }            }        }         System.out.println(res);    } }
