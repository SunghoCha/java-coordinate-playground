package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class InputView {

    private static final String PATTERN = "^(\\([0-9]{1,2}\\,[0-9]{1,2}\\)-){0,3}\\([0-9]{1,2}\\,[0-9]{1,2}\\)";

    public static List<String[]> getCoordinates() {
        Scanner sc = new Scanner(System.in);
        System.out.println("좌표를 입력하세요.");
        String string = sc.next();

        validate(string);
        return convert(string);
    }

    public static List<String[]> convert(String string) {
        List<String[]> pointStrings = Arrays.stream(string.split("-")).
                map(str -> str.replaceAll("[\\(\\)]", "").split(",")).
                collect(Collectors.toList());
        return pointStrings;
    }

    private static void validate(String string) {
        if (!Pattern.matches(PATTERN, string)) {
            throw new IllegalArgumentException("올바른 입력이 아닙니다.");
        }
    }
}
