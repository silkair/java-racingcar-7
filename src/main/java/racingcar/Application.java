package racingcar;

import racingcar.controller.GameController;
import racingcar.controller.GameSetupController;
import racingcar.controller.MoveController;
import racingcar.controller.RaceResultController;
import racingcar.model.Car;
import racingcar.model.CarMove;
import racingcar.model.RandomMove;
import racingcar.model.RaceWinner;

import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        GameSetupController setupController = new GameSetupController();
        List<Car> cars = setupController.initializeCars()
                .stream()
                .map(name -> new Car(name, new RandomMove()))
                .collect(Collectors.toList());
        int rounds = setupController.initializeRounds();

        // 게임 모델 및 컨트롤러 설정
        RaceWinner raceWinner = new RaceWinner(cars);
        MoveController moveController = new MoveController(cars);
        RaceResultController resultController = new RaceResultController(raceWinner);

        // GameController에 필요한 의존성 주입 후 실행
        GameController gameController = new GameController(cars, rounds, moveController, resultController);
        gameController.start();
    }
}