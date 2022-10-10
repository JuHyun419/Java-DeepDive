package com.example.java.deepdive.string;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

class StringExTest {

    @Test
    void compareString() {
        final String str1 = "JuHyun";
        final String str2 = "JuHyun";
        final String str3 = new String("JuHyun");

        SoftAssertions.assertSoftly(softly -> {
            softly.assertThat(str1 == str2).isTrue();
            softly.assertThat(str1 == str3).isFalse();
            softly.assertThat(str2 == str3).isFalse();
            softly.assertThat(str1.equals(str2)).isTrue();
            softly.assertThat(str1.equals(str2)).isTrue();
            softly.assertThat(str1.equals(str2)).isTrue();
        });
    }

    @Test
    void testStringInternMethod() {
        final String expected = "JuHyun";
        final String str2 = new String("JuHyun");

        final String actual = str2.intern();

        SoftAssertions.assertSoftly(softly -> {
            softly.assertThat(actual.equals(expected)).isTrue();
            softly.assertThat(actual == expected).isTrue();
        });
    }

}