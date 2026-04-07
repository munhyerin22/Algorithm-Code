public class Solution {
    /**
     * @param age 선생님의 나이 (0 < age ≤ 120)
     * @param baseYear 기준 연도 (기본값 2022, 테스트에 따라 2023 등 가변 적용 가능)
     * @return 선생님의 출생 연도
     */
    public int solution(int age, int baseYear) {
        // 1. 제한사항 예외 처리: 나이 범위를 벗어나면 예외 발생
        if (age <= 0 || age > 120) {
            throw new IllegalArgumentException("나이는 1~120세 사이여야 합니다.");
        }

        // 2. 한국식 나이 계산 로직 (태어난 해 1살 기준)
        // 공식: 기준 연도 - 나이 + 1
        return baseYear - age + 1;
    }

    // 만약 프로그래머스 기본 형식(매개변수 1개)이 필요하다면 아래 메서드를 사용하세요.
    public int solution(int age) {
        int defaultBaseYear = 2022; // 테스트 코드 요구사항이 2023이면 이 숫자만 수정!
        return solution(age, defaultBaseYear);
    }
}