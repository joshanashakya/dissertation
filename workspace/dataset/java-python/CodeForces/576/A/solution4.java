import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader; /** * Place here class purpose. * * @author Kirill * @since 21.10.2020 */public class Task576A {    public static void main(String[] args) throws IOException {        Task576A task576A = new Task576A();        task576A.resolve();    }     private void resolve() throws IOException {        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));        int upperBorder = Integer.parseInt(bufferedReader.readLine());        boolean[] needNumbers = new boolean[upperBorder + 1];        needNumbers[0] = true;        needNumbers[1] = true;         for (int i = 2; i <= upperBorder; i++) {            for (int j = i + 1; j < upperBorder; j++) {                int nok = getNOK(i, j);                if (nok > upperBorder) {                    break;                }                 if (nok != j) {                    needNumbers[nok] = true;                }            }        }         int numberCount = 0;        StringBuilder result = new StringBuilder();        for (int i = 2; i < needNumbers.length; i++) {            if (!needNumbers[i]) {                result.append(i).append(" ");                numberCount++;            }        }         System.out.println(numberCount);        System.out.println(result);    }     private int getNOK(int num1, int num2) {        return num1 * num2 / getNOD(num1, num2);    }     private int getNOD(int num1, int num2) {        while (num2 > 0) {            int c = num1 % num2;            num1 = num2;            num2 = c;        }         return num1;    }}
