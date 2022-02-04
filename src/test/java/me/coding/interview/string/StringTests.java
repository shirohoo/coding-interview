package me.coding.interview.string;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("모든 테스트에 대해 효율성은 고려하지 않습니다")
class StringTests {
    @Test
    @DisplayName("문자열을 거꾸로 뒤집으시오")
    void quiz1() {
        // ...given
        String s = "Hello World";

        // ...when
        // put in your codes

        // ...then
        assertThat(s).isEqualTo("dlroW olleH");
    }

    @MethodSource
    @ParameterizedTest
    @DisplayName("문자열이 숫자로만 이뤄져있는지를 판별하시오")
    void quiz2(String s, boolean expected) {
        // ...given
        boolean actual = false;

        // ...when
        // put in your codes

        // ...then
        assertThat(actual).isEqualTo(expected);
    }

    static Stream<Arguments> quiz2() {
        return Stream.of(
            Arguments.of("12581759815", true),
            Arguments.of("sakfjfsf19821fjasf", false),
            Arguments.of("43906756212587105", true),
            Arguments.of("sdklgj12``115891aklf", false)
        );
    }

    @Test
    @DisplayName("문자열을 공백 기준으로 분리하고 소문자는 대문자로, 대문자는 소문자로 변환하시오. 마지막으로 문자 o(대소문자 구분x)를 x(소문자)로 변경하시오")
    void quiz3() {
        // ...given
        String s = "hello WORLD";
        String[] actual = null;

        // ...when
        // put in your codes

        // ...then
        assertThat(actual[0]).isEqualTo("HELLx");
        assertThat(actual[1]).isEqualTo("wxrld");
    }
}
