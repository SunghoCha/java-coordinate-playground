package view;

import domain.Point;
import org.junit.jupiter.api.Test;
import view.InputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;

public class InputViewTest {

    @Test
    void 정규식_패턴확인() {
        String string = "(10,20)";
        String string1 = "(10,20)-(1,2)";
        String string2 = "(10,20)-(1,2)-(3,4)";
        String string3 = "(10,20)-(1,2)-(3,4)-(31,41)";
        String string4 = "(10,20)-(1,2)-(3,4)-(31,41)-(32,42)";
        String pattern = "^(\\([0-9]{1,2}\\,[0-9]{1,2}\\)-){0,3}\\([0-9]{1,2}\\,[0-9]{1,2}\\)";
        assertThat(Pattern.matches(pattern, string)).isTrue();
        assertThat(Pattern.matches(pattern, string1)).isTrue();
        assertThat(Pattern.matches(pattern, string2)).isTrue();
        assertThat(Pattern.matches(pattern, string4)).isFalse();
    }

    @Test
    void 괄호제거함수() {
        String string = "(10,20)";
        String str = string.replaceAll("[\\(\\)]", "");
        assertThat(str).isEqualTo("10,20");
    }
}
