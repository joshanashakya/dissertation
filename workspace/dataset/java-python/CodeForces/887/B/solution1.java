import java.util.Collections;import java.util.HashSet;import java.util.Scanner;import java.util.Set; public class B887 {     public static void main(String[] args) {        Scanner in = new Scanner(System.in);        int N = in.nextInt();        int[][] cubes = new int[N][6];        for (int cubeNo = 0; cubeNo < N; cubeNo++) {            for (int i = 0; i < 6; i++) {                cubes[cubeNo][i] = in.nextInt();            }        }        Set<Integer> set = new HashSet<>();        for (int cubeIdx1 = 0; cubeIdx1 < N; cubeIdx1++) {            for (int sideIdx1 = 0; sideIdx1 < 6; sideIdx1++) {                int side1 = cubes[cubeIdx1][sideIdx1];                set.add(side1);                for (int cubeIdx2 = 0; cubeIdx2 < N; cubeIdx2++) {                    if (cubeIdx1 == cubeIdx2) {                        continue;                    }                    for (int sideIdx2 = 0; sideIdx2 < 6; sideIdx2++) {                        int side2 = cubes[cubeIdx2][sideIdx2];                        set.add(10*side1+side2);                        set.add(10*side2+side1);                        for (int cubeIdx3 = 0; cubeIdx3 < N; cubeIdx3++) {                            if (cubeIdx3 == cubeIdx1 || cubeIdx3 == cubeIdx2) {                                continue;                            }                            for (int sideIdx3 = 0; sideIdx3 < 6; sideIdx3++) {                                int side3 = cubes[cubeIdx3][sideIdx3];                                set.add(100*side1+10*side2+side3);                                set.add(100*side1+10*side3+side2);                                set.add(100*side2+10*side1+side3);                                set.add(100*side2+10*side3+side1);                                set.add(100*side3+10*side1+side2);                                set.add(100*side3+10*side2+side1);                            }                        }                    }                }            }        }        int max = 1;        while (set.contains(max)) {            max++;        }        System.out.println(max - 1);    } }