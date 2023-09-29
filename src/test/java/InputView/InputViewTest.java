package InputView;

import domain.Point;
import domain.Shape;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;

public class InputViewTest {

    @Test
    public void 정규식패턴_테스트() {

        String pattern = "^(\\(([0-9]{1,2}),([0-9]{1,2})\\)-){0,3}(\\(([0-9]{1,2}),([0-9]{1,2})\\))";
        assertThat(Pattern.matches(pattern, "(1,2)")).isTrue();
        assertThat(Pattern.matches(pattern, "(1,2)-(3,4)")).isTrue();
        assertThat(Pattern.matches(pattern, "(10,20)-(3,4)-(5,6)")).isTrue();
        assertThat(Pattern.matches(pattern, "(1,2)-(3,4)-(5,6)-(70,80)")).isTrue();
        assertThat(Pattern.matches(pattern, "(1,2)-(3,4)-(5,6)-(7,8)-(9,10)")).isFalse();
        assertThat(Pattern.matches(pattern, "(-1,2)")).isFalse();
        assertThat(Pattern.matches(pattern, "(0,0)")).isFalse();
    }

    @Test
    void 필터() {
        String strings = "(10,20)-(3,4)-(5,6)";

        String[] values = strings.split("-");

        List<String[]> collect = Arrays.stream(values).
                map(value -> value.replaceAll("[\\(\\)]", "").
                split(",")).
                collect(Collectors.toList());
        for (String[] strings1 : collect) {
            strings1.
        }

    }

    @Test
    void 필터2() {
        //input
        String strings = "(10,20)-(3,4)-(5,6)";

        String[] values = strings.split("-");

        List<String> collect = Arrays.stream(values).
                map(value -> value.replaceAll("[\\(\\)]", "")).
                collect(Collectors.toList());
        collect.stream().
        if (collect.size() != values.length) {
            throw new IllegalArgumentException("중복 좌표 입력");
        }
        List<Point> points = new ArrayList<>();
        for (String s : collect) {
            List<Integer> collect1 = Arrays.stream(s.split(",")).map(Integer::parseInt).collect(Collectors.toList());
            points.add(new Point(collect1.get(0),collect1.get(1)));
        }
    }

    @Test
    void df() {
        String strings = "(10,20)";
        String s = strings.replaceAll("[\\(\\)]", "");
        System.out.println("s = " + s);

    }




}
