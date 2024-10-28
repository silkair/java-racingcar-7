package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.Car;
import racingcar.model.RacingGame;
import java.util.ArrayList;
import java.util.List;

public class GameController {
    public void start() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carNamesInput = Console.readLine();
        String[] carNames = carNamesInput.split(",");

        System.out.println("시도할 횟수는 몇 회인가요?");
        int rounds = Integer.parseInt(Console.readLine());

        List<Car> cars = new ArrayList<>();
        for (String name : carNames) {
            cars.add(new Car(name));
        }

        RacingGame racingGame = new RacingGame(cars);

        for (int i = 0; i < rounds; i++) {
            racingGame.playRound();
            // 각 라운드 결과를 출력하거나 다른 로직 추가
        }

        // 우승자 결정 로직 추가
    }
}
