package be.jooones.pipeline.simple;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ComputationTest {

    @Test
    public void plusInputOneAndTwoReturnsThree() throws Exception {
        assertThat(new Computation().plus(1, 2)).isEqualTo(3);
    }

    @Test
    public void minusInputThreeAndTwoReturnsOne() throws Exception {
        assertThat(new Computation().minus(3, 2)).isEqualTo(1);
    }

}