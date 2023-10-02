package service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.InputView;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class CoordinateServiceTest {

    @Test
    @DisplayName("라인에게 거리를 구하라고 메시지를 보내는 함수")
    void calculate() {

        List<String[]> strings = InputView.convert("(1,2)-(4,5)");
        CoordinateService coordinateService = new CoordinateService(strings);
        assertThat(coordinateService.calculate()).isEqualTo(4.2426,offset(0.00099));
    }
}
