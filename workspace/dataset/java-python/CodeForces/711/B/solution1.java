import java.util.Scanner; public class B {    public static void main(String args[]) {        Scanner cin = new Scanner(System.in);        int n = Integer.parseInt(cin.nextLine());        int zr=-1, zc=-1;        int m[][] = new int[n][n];        for(int i=0; i<n; i++)            for(int j=0; j<n; j++) {                m[i][j] = cin.nextInt();                if(m[i][j] == 0) {                    zr = i; zc = j;                }            }        System.out.println(solve(m, n, zr, zc));    }        private static long solve(int[][] m, int n, int zr, int zc) {        long cm = 0, sol = -1;         if(n==1)            return n;         // check rows and init magic number        for(int i=0; i<n; i++) {            if(i!=zr) {                long row_value = sum_row(m, i);                if(cm==0) cm = row_value;                else if(cm!=row_value) {                    //System.out.println("row: " + i + " (cm: " + cm + ", val: " + row_value + ")");                    return -1;                }            }        }        // check cols        for(int i=0; i<n; i++) {            if(i!=zc) {                if(cm!=sum_col(m, i)) {                    //System.out.println("col: " + i + " (cm: " + cm + ", val: " + sum_col(m,i) + ")");                    return -1;                }            }        }        // check diags        if(zr!=zc) {            if(cm!=sum_diag_down(m)){                //System.out.println("diag_dw (cm: " + cm + ", val: " + sum_diag_down(m) + ")");                return -1;            }        }        if((zr+zc)!=(n-1)) {            if(cm!=sum_diag_up(m)) {                //System.out.println("diag_up (cm: " + cm + ", val: " + sum_diag_up(m) + ")");                return -1;            }        }         // find value        long zr_value, zc_value, zdw_value, zup_value;        zr_value = cm - sum_row(m, zr);        sol = zr_value;        zc_value = cm - sum_col(m, zc);        if(sol!=zc_value)            return -1;        if(zr==zc) {            zdw_value = cm - sum_diag_down(m);            if(sol!=zdw_value)                return -1;        }        if((zr+zc)==(n-1)) {            zup_value = cm - sum_diag_up(m);            if(sol!=zup_value)                return -1;        }         return (sol>0?sol:-1);    }     private static long sum_row(int m[][], int r) {        long sum = 0;        for(int k=0; k<m.length; k++)            sum += m[r][k];        return sum;    }     private static long sum_col(int m[][], int c) {        long sum = 0;        for(int k=0; k<m.length; k++)            sum += m[k][c];        return sum;    }     private static long sum_diag_down(int m[][]) {        long sum=0;        for(int k=0; k<m.length; k++)            sum += m[k][k];        return sum;    }     private static long sum_diag_up(int m[][]) {        long sum=0;        int n = m.length;        for(int k=n-1; k>=0; k--)            sum += m[k][n-k-1];        return sum;    }    }
