import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String exp = scanner.nextLine();


        exp = exp.replace("\"", "").replace(" ", "");


        String[] data;
        char action;
        if (exp.contains("+")) {
            data = exp.split("\\+");
            action = '+';
        } else if (exp.contains("-")) {
            data = exp.split("-");
            action = '-';
        } else if (exp.contains("*")) {
            data = exp.split("\\*");
            action = '*';
        } else if (exp.contains("/")) {
            data = exp.split("/");
            action = '/';
        } else {
            throw new Exception("Некорректный знак действия");
        }


        if (action == '*' || action == '/') {
            try {
                Integer.parseInt(data[1]);
            } catch (NumberFormatException e) {
                throw new Exception("Строчку можно делить или умножать только на число");
            }

            if (data[1].equals("0")) {
                throw new Exception("Деление или умножение на ноль недопустимо");
            }
        }


        String result;
        if (action == '+') {
            result = data[0] + data[1];
        } else if (action == '-') {
            result = data[0].replace(data[1], " ");
        } else if (action == '*') {
            int count = Integer.parseInt(data[1]);
            if (count == 0) {
                result = "";
            } else {
                result = new String(new char[count]).replace("\0", data[0]);
            }
        } else if (action == '/') {
            int divisor = Integer.parseInt(data[1]);
            if (divisor == 0) {
                throw new Exception("Деление на ноль недопустимо");
            }
            int length = data[0].length() / divisor;
            result = data[0].substring(0, length);
        } else {
            throw new Exception("Некорректный знак действия");
        }


        if (result.length() > 40) {
            result = result.substring(0, 40) + "...";
        }


        System.out.println("\"" + result + "\"");
    }
}
