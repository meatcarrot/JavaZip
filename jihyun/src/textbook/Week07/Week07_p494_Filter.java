package textbook.Week07;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Week07_p494_Filter {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;
        // Predicate<> : 함수형 인터페이스

        List<Integer> numbers = Arrays.asList(5, -10, -22, 0, 43, 7);
        // Arrays는 배열 관련 유틸리티 클래스
        // asList는 배열 -> 리스트로 변환
        // Arrays.asList(...) : 크기가 고정되어 있는 배열을 리스트로 바꿔주는 함수

        Stream<Integer> s = numbers.stream().filter(isPositive);
        // stream() : 리스트를 스트림으로 바꿔주는 메서드
        // stream은 데이터를 하나씩 순서대로 흘려보내면서 처리
        // filter() : 스트림에서 원하는 조건만 골라내는 메서드 (중간 연산)

        s.forEach(n -> System.out.println(n));
        // forEach() : 남은 값을 하나씩 꺼내서 어떤 행동을 하게 함
    }
}
