package com.thegreatapi.demolibrary.stringpadder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringPadderImplTest {

    private final StringPadderImpl stringPadder = new StringPadderImpl();

    @Test
    void padLeft() {
        assertThat(stringPadder.padLeft("thegreatapi.com", 20))
                .isEqualTo("     thegreatapi.com");
    }

    @Test
    void padLeftWithZeros() {
        assertThat(stringPadder.padLeft("thegreatapi.com", 20, '0'))
                .isEqualTo("00000thegreatapi.com");
    }

    @Test
    void padRight() {
        assertThat(stringPadder.padRight("thegreatapi.com", 20))
                .isEqualTo("thegreatapi.com     ");
    }

    @Test
    void padRightWithZeros() {
        assertThat(stringPadder.padRight("thegreatapi.com", 20, '0'))
                .isEqualTo("thegreatapi.com00000");
    }

    @Test
    void padLeftWithInvalidTotalLength() {
        assertThat(stringPadder.padLeft("thegreatapi.com", 3))
                .isEqualTo("thegreatapi.com");
    }

    @Test
    void padLeftWithZerosInvalidTotalLength() {
        assertThat(stringPadder.padLeft("thegreatapi.com", 3, '0'))
                .isEqualTo("thegreatapi.com");
    }

    @Test
    void padRightInvalidTotalLength() {
        assertThat(stringPadder.padRight("thegreatapi.com", 3))
                .isEqualTo("thegreatapi.com");
    }

    @Test
    void padRightWithZerosInvalidTotalLength() {
        assertThat(stringPadder.padRight("thegreatapi.com", 3, '0'))
                .isEqualTo("thegreatapi.com");
    }

}