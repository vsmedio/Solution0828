import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is 5 month".
Используйте коллекции.


Требования:
1. Программа должна считывать одно значение с клавиатуры.
2. Программа должна выводить текст на экран.
3. Класс Solution должен содержать один метод.
4. Программа должна использовать коллекции.
5. Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.
*/


public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> months = new ArrayList<String>(Arrays.asList(new String[]{
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"}));

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int index = months.indexOf(s);
        if (index < 0)
            return;

        System.out.printf("%s is %d month\n", months.get(index), index + 1);
    }
}