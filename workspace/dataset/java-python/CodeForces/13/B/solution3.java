import java.io.BufferedReader;import java.io.InputStreamReader;import java.util.StringTokenizer; public class Main {    public static void main(String[] args) throws Exception {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer(br.readLine());        int N = Integer.parseInt(st.nextToken());        for (int t = 1; t <= N; t++) {            int[][] lines = new int[3][4];            for (int i = 0; i < 3; i++) {                st = new StringTokenizer(br.readLine());                lines[i] = new int[]{                        Integer.parseInt(st.nextToken()),                        Integer.parseInt(st.nextToken()),                        Integer.parseInt(st.nextToken()),                        Integer.parseInt(st.nextToken())                };            }          /* if(t == 3806){                System.out.println(lines[0][0]+","+lines[0][1]+","+lines[0][2]+","+lines[0][3]+lines[1][0]+","+lines[1][1]+","+lines[1][2]+","+lines[1][3]+lines[2][0]+","+lines[2][1]+","+lines[2][2]+","+lines[2][3]);                continue;            }*/            int crossIdx1 = 0;            int crossIdx2 = 0;            int anoIdx = 0;            double[] crossPoint = new double[2];            boolean hasCommonPoint = false;            LOOP:            for (int i = 0; i < 3; i++) {                for (int j = 0; j < 3; j++) {                    if(i ==j){                        continue;                    }                    if (lines[i][0] == lines[j][0] && lines[i][1] == lines[j][1]) {                        crossIdx1 = i;                        crossIdx2 = j;                        crossPoint = new double[]{lines[i][0],lines[i][1]};                        hasCommonPoint = true;                        break LOOP;                    }                    if (lines[i][0] == lines[j][2] && lines[i][1] == lines[j][3]) {                        crossIdx1 = i;                        crossIdx2 = j;                        crossPoint = new double[]{lines[i][0],lines[i][1]};                        hasCommonPoint = true;                        break LOOP;                    }                    if (lines[i][2] == lines[j][0] && lines[i][3] == lines[j][1]) {                        crossIdx1 = i;                        crossIdx2 = j;                        crossPoint = new double[]{lines[i][2],lines[i][3]};                        hasCommonPoint = true;                        break LOOP;                    }                    if (lines[i][2] == lines[j][2] && lines[i][3] == lines[j][3]) {                        crossIdx1 = i;                        crossIdx2 = j;                        crossPoint = new double[]{lines[i][2],lines[i][3]};                        hasCommonPoint = true;                        break LOOP;                    }                }            }            if(!hasCommonPoint){                System.out.println("NO");                continue;            }            anoIdx = 3 - crossIdx1 - crossIdx2;              double[] A = new double[]{};            double[] B = new double[]{};            if(lines[crossIdx1][0] == crossPoint[0] &&lines[crossIdx1][1] == crossPoint[1]){                A = new double[]{lines[crossIdx1][2],lines[crossIdx1][3]};            }            else if(lines[crossIdx1][2] == crossPoint[0] &&lines[crossIdx1][3] == crossPoint[1]){                A = new double[]{lines[crossIdx1][0],lines[crossIdx1][1]};            }             if(lines[crossIdx2][0] == crossPoint[0] &&lines[crossIdx2][1] == crossPoint[1]){                B = new double[]{lines[crossIdx2][2],lines[crossIdx2][3]};            }            else if(lines[crossIdx2][2] == crossPoint[0] &&lines[crossIdx2][3] == crossPoint[1]){                B = new double[]{lines[crossIdx2][0],lines[crossIdx2][1]};            }            /* if(cosAns(A,B,crossPoint)<0||                    Math.pow(cosAns(A,B,crossPoint),2) == ((Math.pow(A[0]-crossPoint[0],2)+Math.pow(A[1]-crossPoint[1],2))*(Math.pow(B[0]-crossPoint[0],2)+Math.pow(B[1]-crossPoint[1],2)))){                System.out.println("NO");                continue;            }*/             if(cosAns(A,B,crossPoint)<0){                System.out.println("NO");                continue;            }             double devide11 = 0;            double devide12 = 0;            double devide21 = 0;            double devide22 = 0;            double devide1=Math.pow(lines[crossIdx1][2]-lines[crossIdx1][0],2)+Math.pow(lines[crossIdx1][3]-lines[crossIdx1][1],2);            double devide2=Math.pow(lines[crossIdx2][2]-lines[crossIdx2][0],2)+Math.pow(lines[crossIdx2][3]-lines[crossIdx2][1],2);            //idx1->cross0,1;idx2->cross2,3            if (ccw(new double[]{lines[crossIdx1][0], lines[crossIdx1][1]},                    new double[]{lines[crossIdx1][2], lines[crossIdx1][3]},                    new double[]{lines[anoIdx][0], lines[anoIdx][1]}) == 0 &&                    ccw(new double[]{lines[crossIdx2][0], lines[crossIdx2][1]},                            new double[]{lines[crossIdx2][2], lines[crossIdx2][3]},                            new double[]{lines[anoIdx][2], lines[anoIdx][3]}) == 0            ) {                 devide11 = Math.pow(lines[crossIdx1][0] - lines[anoIdx][0], 2) + Math.pow(lines[crossIdx1][1] - lines[anoIdx][1], 2);                devide12 = Math.pow(lines[crossIdx1][2] - lines[anoIdx][0], 2) + Math.pow(lines[crossIdx1][3] - lines[anoIdx][1], 2);                 devide21 = Math.pow(lines[crossIdx2][0] - lines[anoIdx][2], 2) + Math.pow(lines[crossIdx2][1] - lines[anoIdx][3], 2);                devide22 = Math.pow(lines[crossIdx2][2] - lines[anoIdx][2], 2) + Math.pow(lines[crossIdx2][3] - lines[anoIdx][3], 2);            }            //idx1->cross2,3;idx2->cross0,1            else if (ccw(new double[]{lines[crossIdx1][0], lines[crossIdx1][1]},                    new double[]{lines[crossIdx1][2], lines[crossIdx1][3]},                    new double[]{lines[anoIdx][2], lines[anoIdx][3]}) == 0 &&                    ccw(new double[]{lines[crossIdx2][0], lines[crossIdx2][1]},                            new double[]{lines[crossIdx2][2], lines[crossIdx2][3]},                            new double[]{lines[anoIdx][0], lines[anoIdx][1]}) == 0            ) {                devide11 = Math.pow(lines[crossIdx1][0] - lines[anoIdx][2], 2) + Math.pow(lines[crossIdx1][1] - lines[anoIdx][3], 2);                devide12 = Math.pow(lines[crossIdx1][2] - lines[anoIdx][2], 2) + Math.pow(lines[crossIdx1][3] - lines[anoIdx][3], 2);                 devide21 = Math.pow(lines[crossIdx2][0] - lines[anoIdx][0], 2) + Math.pow(lines[crossIdx2][1] - lines[anoIdx][1], 2);                devide22 = Math.pow(lines[crossIdx2][2] - lines[anoIdx][0], 2) + Math.pow(lines[crossIdx2][3] - lines[anoIdx][1], 2);            }             if(devide11 ==0 || devide12 ==0 || devide21 ==0 || devide22 ==0){                System.out.println("NO");                continue;            } /*            if(4*devide11*devide12 != Math.pow(devide1-devide11-devide12,2)||4*devide21*devide22 != Math.pow(devide2-devide21-devide22,2)){                System.out.println("NO");                continue;            }*//*            if(!((Double.compare(devide11,devide1)<0 && Double.compare(devide12,devide1)<0)                    || (Double.compare(devide21,devide2)<0 && Double.compare(devide22,devide2)<0))){                System.out.println("NO");                continue;            }             if(Double.compare(Math.sqrt(devide1),Math.sqrt(devide11)+Math.sqrt(devide12))!=0                    || Double.compare(Math.sqrt(devide2),Math.sqrt(devide21)+Math.sqrt(devide22))!=0){                System.out.println("NO");                continue;            }*/            if(Math.abs(Math.sqrt(devide1)-Math.sqrt(devide11)-Math.sqrt(devide12))>Math.pow(10,-7)                    || Math.abs(Math.sqrt(devide2)-Math.sqrt(devide21)-Math.sqrt(devide22))>Math.pow(10,-7)){                System.out.println("NO");                continue;            }            if (Double.compare(Math.max(devide11, devide12) , Math.min(devide11, devide12)*16) >0                    || Double.compare(Math.max(devide21, devide22) , Math.min(devide21, devide22)* 16) > 0) {                System.out.println("NO");                continue;            }/*            if (Math.sqrt(Math.min(devide11, devide12))*5 <Math.sqrt(devide1)                    || Math.sqrt(Math.min(devide21, devide22))*5 <Math.sqrt(devide2)) {                System.out.println("NO");                continue;            }*/            System.out.println("YES");        }     }     private static int ccw(double[] p1, double[] p2, double[] s) {        double[] vp12 = new double[]{p2[0] - p1[0], p2[1] - p1[1]};        double[] vp2s = new double[]{s[0] - p2[0], s[1] - p2[1]};        double ans = vp12[0] * vp2s[1] - vp2s[0] * vp12[1];        if(ans == 0){            return 0;        }        return Double.compare(ans, 0);    }     private static double cosAns(double[] p1, double[] p2, double[] o) {        double[] vo1 = new double[]{p1[0] - o[0], p1[1] - o[1]};        double[] vo2 = new double[]{p2[0] - o[0], p2[1] - o[1]};        return (vo1[0] * vo2[0] + vo1[1] * vo2[1]);    }}