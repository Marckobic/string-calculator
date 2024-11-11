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
            int[] numbers = new int[10];
            int i = 0;

            int times = 3;


            String sum = inputStr + inputStr2;
            result.append("Concatenation: ").append(sum).append("\n");

            String subtract = inputStr.replace(inputStr2, "");
            result.append("Subtraction (removal): ").append(subtract).append("\n");

            StringBuilder multiplicationResult = new StringBuilder();
            for (i = 0; i < times; i++) {
                multiplicationResult.append(inputStr);
                result.append("Multiplication (repetition): ").append(multiplicationResult).append("\n");

                if (multiplicationResult.length() > 40)
                    result.append("...");
            }


            result.append(inputStr.repeat(numbers.length));

            for (i = 0; i < numbers.length; i++) {
                numbers[i] = i + 1;
                for (int number : numbers)
                    if (numbers[i] <= 0 && numbers[i] > 10) {
                        throw new RuntimeException("UnexpectedNumberError: " + Arrays.toString(numbers));
                    }
            }
            char a = 0;
            if (Character.isDigit(a)) {
                throw new RuntimeException("число не должно быть первым");

            }

            return result.toString();
        }

    }