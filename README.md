# 코딩 인터뷰

## 스트림(Stream) 

[📜 문제 링크 - 테스트 코드 참고](https://github.com/shirohoo/coding-interview/blob/master/src/test/java/me/coding/interview/stream/StreamTests.java)

✅ 풀이 - stream 브랜치 체크아웃 후 테스트코드 확인

```java
package me.coding.interview.stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StreamTests {
    final Trader raoul = Trader.of("Raoul", City.CAMBRIDGE);
    final Trader mario = Trader.of("Mario", City.MILAN);
    final Trader alan = Trader.of("Alan", City.CAMBRIDGE);
    final Trader brian = Trader.of("Brian", City.CAMBRIDGE);

    final List<Transaction> transactions = Arrays.asList(
        Transaction.of(brian, 2011, 300),
        Transaction.of(raoul, 2012, 1000),
        Transaction.of(raoul, 2011, 400),
        Transaction.of(mario, 2012, 710),
        Transaction.of(mario, 2012, 700),
        Transaction.of(alan, 2012, 950)
    );

    @Test
    @DisplayName("2011년에 일어난 모든 트랜잭션을 찾아 트랜잭션 값으로 오름차순 정렬하시오")
    void quiz1() {
        // ...given
        List<Transaction> result;

        // ...when
        result = null; // put in your codes

        // ...then
        assertThat(result).containsExactly(
            Transaction.of(brian, 2011, 300),
            Transaction.of(raoul, 2011, 400)
        );
    }

    @Test
    @DisplayName("거래자가 근무하는 모든 도시를 중복 없이 나열하시오")
    void quiz2() {
        // ...given
        List<City> result;

        // ...when
        result = null; // put in your codes

        // ...then
        assertThat(result).containsExactlyInAnyOrder(City.CAMBRIDGE, City.MILAN);
    }

    @Test
    @DisplayName("케임브리지에서 근무하는 모든 거래자를 찾아서 중복을 제거하고 거래자의 이름을 알파벳순으로 오름차순 정렬하시오")
    void quiz3() {
        // ...given
        List<Trader> result;

        // ...when
        result = null; // put in your codes

        // ...then
        assertThat(result).containsExactly(alan, brian, raoul);
    }

    @Test
    @DisplayName("모든 거래자의 중복을 제거하고 이름을 알파벳순으로 내림차순 정렬하시오")
    void quiz4() {
        // ...given
        List<String> result;

        // ...when
        result = null; // put in your codes

        // ...then
        assertThat(result).containsExactly("Alan", "Brian", "Mario", "Raoul");
    }

    @Test
    @DisplayName("밀라노에 거래자가 있는가?")
    void quiz5() {
        // ...given
        boolean result;

        // ...when
        result = false; // put in your codes

        // ...then
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오")
    void quiz6() {
        // ...given
        List<Transaction> result;

        // ...when
        result = null; // put in your codes

        // ...then
        assertThat(result).containsExactlyInAnyOrder(
            Transaction.of(brian, 2011, 300),
            Transaction.of(raoul, 2012, 1000),
            Transaction.of(raoul, 2011, 400),
            Transaction.of(alan, 2012, 950)
        );
    }

    @Test
    @DisplayName("전체 트랜잭션 중 최댓값은 얼마인가?")
    void quiz7() {
        // ...given
        int result;

        // ...when
        result = 0; // put in your codes

        // ...then
        assertThat(result).isEqualTo(1000);
    }

    @Test
    @DisplayName("전체 트랜잭션 중 최솟값은 얼마인가?")
    void quiz8() {
        // ...given
        int result;

        // ...when
        result = 0; // put in your codes

        // ...then
        assertThat(result).isEqualTo(300);
    }
}
```
