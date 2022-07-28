import java.util.*; public class CF995A {    static int columns = 0;     public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        int columnsNumber = scanner.nextInt();        int carsNumber = scanner.nextInt();        int[][] parkingArea = new int[4][columnsNumber];        for (int i = 0; i < 4; i++) {            scanner.nextLine();            for (int j = 0; j < columnsNumber; j++) {                parkingArea[i][j] = scanner.nextInt();            }        }        List<String> moves = parkThemAll(parkingArea, columnsNumber, carsNumber);         if (moves == null)            System.out.println(-1);        else {            System.out.println(moves.size());            for (String move : moves) {                System.out.println(move);            }        }    }     static List<String> parkThemAll(int[][] parkingArea, int columnsNumber, int carsNumber) {        CF995A.columns = columnsNumber;        int carsLeft = carsNumber;        ArrayList<String> moves = new ArrayList<>();        for (int j = 0; j < columnsNumber; j++) {            if (parkingArea[1][j] > 0 && parkingArea[1][j] == parkingArea[0][j]) {                carsLeft -= moveIfHome(parkingArea, 1, j, moves);                parkingArea[1][j] = 0;            }            if (parkingArea[2][j] > 0 && parkingArea[2][j] == parkingArea[3][j]) {                carsLeft -= moveIfHome(parkingArea, 2, j, moves);                parkingArea[2][j] = 0;            }        }        if (carsNumber == columnsNumber * 2 && moves.size() == 0) {            return null;        } else {            while (carsLeft > 0) {                carsLeft = move(parkingArea, findEmptySpace(parkingArea), carsLeft, moves);            }            return moves;        }    }     private static int[] findEmptySpace(int[][] parkingArea) {        int[] spot = new int[2];        for (int j = 0; j < columns; j++) {            if (parkingArea[1][j] == 0) {                spot[0] = 1;                spot[1] = j;                return spot;            }            if (parkingArea[2][j] == 0) {                spot[0] = 2;                spot[1] = j;                return spot;            }        }        return spot;    }     private static int move(int[][] parkingArea, int[] spot, int carsLeft, ArrayList<String> moves) {        if (spot[0] == 2) {            spot[0] = 1;            moves.add(parkingArea[1][spot[1]] + " 3 " + (spot[1] + 1));            parkingArea[2][spot[1]] = parkingArea[1][spot[1]];            parkingArea[1][spot[1]] = 0;            carsLeft -= moveIfHome(parkingArea, 2, spot[1], moves);        }        int value10 = parkingArea[1][0];        for (int i = spot[1]; i < columns - 1; i++) {            if (parkingArea[1][i + 1] != 0) {                moves.add(parkingArea[1][i + 1] + " 2 " + (i + 1));            }            parkingArea[1][i] = parkingArea[1][i + 1];            carsLeft -= moveIfHome(parkingArea, 1, i, moves);        }        if (parkingArea[2][columns - 1] != 0) {            moves.add(parkingArea[2][columns - 1] + " 2 " + columns);        }        parkingArea[1][columns - 1] = parkingArea[2][columns - 1];        carsLeft -= moveIfHome(parkingArea, 1, columns - 1, moves);        for (int i = parkingArea[2].length - 1; i > 0; i--) {            if (parkingArea[2][i - 1] != 0) {                moves.add(parkingArea[2][i - 1] + " 3 " + (i + 1));            }            parkingArea[2][i] = parkingArea[2][i - 1];            carsLeft -= moveIfHome(parkingArea, 2, i, moves);        }        if (value10 != 0) {            moves.add(value10 + " 3 1");        }        parkingArea[2][0] = value10;        carsLeft -= moveIfHome(parkingArea, 2, 0, moves);        for (int i = 0; i < spot[1] - 1; i++) {            if (parkingArea[1][i + 1] != 0) {                moves.add(parkingArea[1][i + 1] + " 2 " + (i + 1));            }            parkingArea[1][i] = parkingArea[1][i + 1];            carsLeft -= moveIfHome(parkingArea, 1, i, moves);        }        if (spot[1] > 0) parkingArea[1][spot[1] - 1] = 0;        return carsLeft;    }     private static int moveIfHome(int[][] parkingArea, int row, int column, ArrayList<String> moves) {        if (parkingArea[row][column] == 0) return 0;        if (row == 1 && parkingArea[row][column] == parkingArea[0][column]) {            moves.add(parkingArea[row][column] + " 1 " + (column + 1));            parkingArea[row][column] = 0;            return 1;        } else if (row == 2 && parkingArea[row][column] == parkingArea[3][column]) {            moves.add(parkingArea[row][column] + " 4 " + (column + 1));            parkingArea[row][column] = 0;            return 1;        } else return 0;    }}
