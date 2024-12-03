import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите ваше выражение в формате \"слово\" + \"слово/цифра\"");
        Scanner in = new Scanner(System.in);
        String text = in.nextLine().trim();
        text = FirstNumb.firstNumb(text);
        String[] str = text.split(" \\W ");
        String word1 = str[0];
        String[] oper = text.split("\"");
        String operator = oper[2].replaceAll("\\d","").replaceAll(" ","");
        String word3 = str[1];

    }
}


public class Sum {
    public static String sum() throws Exception {
        switch (operator){
            case "+":
                word1 = word1 + word3;
                return TruncateString.truncateString(word1).replaceAll("\"","");           
            default:
                throw new Exception("Неподдерживаемая операция.");
            }
 }
}

public class Mines {
    public static String mines(String word1, String word3, String text){
        String[] commonWords = text.split("\"");
        String comw = commonWords[1];
        String comw3 = commonWords[3];
        StringBuilder res = new StringBuilder();
        if (comw.contains(comw3)) {
            word1 = comw.replaceAll(comw3, "");
    
        }else {
                word1 = word1;
        }
    
        return TruncateString.truncateString(word1).toString();
        }
    
}

public class Multiplication {
    public static String multiplication(String word1, int numb) {
        StringBuilder res = new StringBuilder();
        res.append(String.valueOf(word1).repeat(Math.max(0, numb)));
        return TruncateString.truncateString(res.toString());
    }
}

public class Division {
    public static String division(String word1, int numb) throws Exception {
        if(numb < 0){
            throw new Exception("Делитель должен быть больше нуля.");
        }
        char[] chars = word1.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < chars.length / numb; i++) {
            res.append(chars[i]);
        }
        return TruncateString.truncateString(res.toString());
    }
}

public class Numb {
    public static int numb(String word3) throws Exception {
        int number = 0;
        
        
        if (word3.matches("\\d+")) {
            number = Integer.parseInt(word3);
        } else {
            throw new Exception("Строка не является числом.");
        }
        
        
        if (number < 1 || number > 10) {
            throw new Exception("Число должно быть от 1 до 10.");
        }

        return number;
    }
{



try {
    int result = Numb.numb("i");
    return result; 
} catch (Exception e) {
    System.out.println("Ошибка: " + e.getMessage());
}
}
}
