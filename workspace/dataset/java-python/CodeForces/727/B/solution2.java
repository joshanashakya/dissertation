import java.util.Scanner; public class Main {     public static void main(String[] args) {         String input = new Scanner(System.in).nextLine();        String[] costs = input.split("[a-z]{1,10}");         double sum = 0;        for (String cost : costs) {            if (cost.isEmpty())                continue;            if (cost.matches("([1-9][0-9]{0,2}|0)(\\.[0-9]{3})*(\\.[0-9]{2})?")) {                if (cost.length() > 3 && cost.charAt(cost.length() - 3) == '.')                    cost = cost.substring(0, cost.length() - 3) + "#" + cost.substring(cost.length() - 2);                cost = cost.replace(".", "");                cost = cost.replace("#", ".");                sum += Double.parseDouble(cost);            } else {                System.out.println("Invalid Input");                return;            }        }         String output = Long.toString(Math.round(sum * 100) / 100) + "." + String.format( "%02d", (Math.round(sum * 100) % 100));        while (output.indexOf('.') > 3)            output = output.substring(0, output.indexOf('.') - 3) + "." + output.substring(output.indexOf('.') - 3);        if (output.endsWith(".00"))            output = output.substring(0, output.length() - 3);        System.out.println(output);    }}
