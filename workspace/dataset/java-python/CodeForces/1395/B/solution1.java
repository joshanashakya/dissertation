import java.util.Scanner;

public class B1395 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int R = in.nextInt();
        int C = in.nextInt();
        int SR = in.nextInt();
        int SC = in.nextInt();
        StringBuilder output = new StringBuilder();
        output.append(SR).append(' ').append(SC).append('\n');
        for (int c=1; c<=C; c++) {
            if (c != SC) {
                output.append(SR).append(' ').append(c).append('\n');
            }
        }
        int lastC = C;
        for (int r=1; r<=R; r++) {
            if (r != SR) {
                if (lastC == 1) {
                    for (int c=1; c<=C; c++) {
                        output.append(r).append(' ').append(c).append('\n');        
                    }
                    lastC = C;
                } else {
                    for (int c=C; c>=1; c--) {
                        output.append(r).append(' ').append(c).append('\n');        
                    }
                    lastC = 1;
                }
            }
        }
        System.out.print(output);
    }

}

