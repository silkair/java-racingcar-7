package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        try {
            List<String> carNames = inputCarNames();
            // 추가 구현 내용
        } catch (IllegalArgumentException e) {
            System.out.println("에러: " + e.getMessage());
            throw e; //재전파 -> 프로그램 종료
        }
    }

    private static List<String> inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        String[] names = input.split(",");

        List<String> carNames = new ArrayList<>();
        for (String name : names) {
            validateCarName(name);  //이름 조건에 부합한가?
            carNames.add(name);
        }
        return carNames;
    }

    private static void validateCarName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다: " + name);
        }
    }
}
