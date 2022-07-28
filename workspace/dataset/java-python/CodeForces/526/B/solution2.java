import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader; public class CodeForces {     private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));     public static void main(String[] args) throws IOException {         int levels = Integer.parseInt(in.readLine().trim());         String[] lampCounts = in.readLine().trim().split(" ");         Node[] nodeList = new Node[(int) (Math.pow(2, levels + 1) - 1)];         nodeList[0] = new Node(0);        for (int i = 1; i < nodeList.length; i++) {            nodeList[i] = new Node(Integer.parseInt(lampCounts[i - 1]));        }         for (int i = 1; i < Math.pow(2, levels); i++) {            nodeList[i - 1].setLeft(nodeList[2 * i - 1]);            nodeList[i - 1].setRight(nodeList[2 * i]);        }         int newLights = 0;        for (int i = (int) (Math.pow(2, levels) - 2); i >= 0; i--) {            Node main = nodeList[i], left = main.getLeft(), right = main.getRight();            int difference = Math.abs((left.getLeftSum() + left.getValue()) - (right.getLeftSum() + right.getValue()));            newLights += difference;             if (left.getValue() + left.getLeftSum() < right.getValue() + right.getLeftSum()) {                left.addValue(difference);            } else if (left.getValue() + left.getLeftSum() < right.getValue() + right.getLeftSum()) {                right.addValue(difference);            }        }         System.out.println(newLights);    }     private static class Node {         Node left, right;         int value;         public Node(int value) {            this.value = value;        }         public Node getLeft() {            return left;        }         public Node getRight() {            return right;        }         public int getValue() {            return value;        }         public int getLeftSum() {            int sum = 0;             if (left != null) {                sum += left.getLeftSum() + left.getValue();            }             return sum;        }         public int getSum() {            int sum = 0;             if (left != null) {                sum += left.getSum() + left.getValue();            }            if (right != null) {                sum += right.getSum() + right.getValue();            }             return sum;        }         public void setLeft(Node left) {            this.left = left;        }         public void setRight(Node right) {            this.right = right;        }         public void addValue(int delta) {            this.value += delta;        }    } }
