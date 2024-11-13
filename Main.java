import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String input2 = scanner.nextLine();

        System.out.println(conculator(input, input2));
    }

    public static String conculator(String inputStr, String inputStr2) {
        StringBuilder result = new StringBuilder();

        if (inputStr.length() > 10 || inputStr2.length() > 10) {
            throw new RuntimeException("недопустимая длина строки (строка не должна быть длиннее 10 символов)");
        }

        if (Character.isDigit(inputStr.charAt(0)) || Character.isDigit(inputStr2.charAt(0))) {
            throw new RuntimeException("число не должно быть первым");
        }

        String sum = inputStr + inputStr2;
        result.append("Concatenation: ").append(sum).append("\n");

        String subtract = inputStr.replace(inputStr2, "");
        result.append("Subtraction (removal): ").append(subtract).append("\n");

        int times = 3;
        StringBuilder multiplicationResult = new StringBuilder();
        for (int i = 0; i < times; i++) {
            multiplicationResult.append(inputStr);
        }
        result.append("Multiplication (repetition): ").append(multiplicationResult).append("\n");

        if (multiplicationResult.length() > 40) {
            result.append("...");
        }

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        for (int number : numbers) {
            if (number <= 0 || number > 10) {
                throw new RuntimeException("UnexpectedNumberError: " + Arrays.toString(numbers));
            }
        }

        return result.toString();
    }
}
            
