import java.util.Scanner; public class SymmetryPool {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);         int n = scanner.nextInt();         int[][] coo = new int[n][2];        for (int i = 0; i < n; i++) {            coo[i][0] = scanner.nextInt();            coo[i][1] = scanner.nextInt();        }         if(n == 1){            System.out.println(-1);        }else if(n == 2){            int side1 = Math.abs(coo[0][1] - coo[1][1]);            int side2 = Math.abs(coo[0][0] - coo[1][0]);            if(side1 == 0 || side2 == 0){                System.out.println(-1);            }else {                System.out.println(side1*side2);            }        }else {            int side1 = 0;            int side2 = 0;            for (int i = 0; i < 2; i++) {                if(coo[i][1] - coo[i+1][1] != 0) side2 = Math.abs(coo[i][1] - coo[i+1][1]);                if(coo[i][0] - coo[i+1][0] != 0) side1 = Math.abs(coo[i][0] - coo[i+1][0]);            }             System.out.println(side1*side2);        }    }}
