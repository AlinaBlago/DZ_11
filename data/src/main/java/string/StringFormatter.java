package string;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class StringFormatter {
    public static int format(List<String> string){
        AtomicInteger number = new AtomicInteger();
        string.stream().forEach(currentStr -> {
            currentStr.chars().
                    filter(charCanBeDigit -> Character.isDigit(charCanBeDigit)).forEach((str)->{
                number.updateAndGet(v -> v * 10);
                number.updateAndGet(v -> v + Integer.parseInt(Character.toString(str)));
            });
        });

        System.out.println("Введенная строка: " + string + "\nПолученная строка цифр: " + number.get());

        return number.get();

    }
}
