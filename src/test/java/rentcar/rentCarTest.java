package rentcar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

public class rentCarTest {

    @Test
    void getTripDistance() {
        Car k5 = new K5(261);
        Car sonata = new Sonata(151);
        Car avante = new Avante(301);

        assertThat(k5.getTripDistance()).isEqualTo(261);
        assertThat(sonata.getTripDistance()).isEqualTo(151);
        assertThat(avante.getTripDistance()).isEqualTo(301);
    }

    @Test
    void getName() {
        Car k5 = new K5(261);
        Car sonata = new Sonata(151);
        Car avante = new Avante(301);

        assertThat(k5.getName()).isEqualTo("K5");
        assertThat(sonata.getName()).isEqualTo("Sonata");
        assertThat(avante.getName()).isEqualTo("Avante");
    }

    @Test
    void getDistancePerLiter() {
        Car k5 = new K5(261);
        Car sonata = new Sonata(151);
        Car avante = new Avante(301);

        assertThat(k5.getDistancePerLiter()).isEqualTo(13);
        assertThat(sonata.getDistancePerLiter()).isEqualTo(10);
        assertThat(avante.getDistancePerLiter()).isEqualTo(15);
    }

    @Test
    void getChargeQuantity() {
        Car k5 = new K5(261);
        Car sonata = new Sonata(151);
        Car avante = new Avante(301);

        assertThat(k5.getChargeQuantity()).isEqualTo((double) 261/13);
        assertThat(sonata.getChargeQuantity()).isEqualTo((double) 151/10);
        assertThat(avante.getChargeQuantity()).isEqualTo((double) 301/15);
    }


}
