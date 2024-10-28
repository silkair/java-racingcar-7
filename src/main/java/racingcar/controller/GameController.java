package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;

public class GameController {
    public void start() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carNamesInput = Console.readLine();
        String[] carNames = carNamesInput.split(",");

        System.out.println("시도할 횟수는 몇 회인가요?");
        int rounds = Integer.parseInt(Console.readLine());

        // 이후 로직: 자동차 생성 및 게임 진행
    }
}
