package racingcar;

import racingcar.controller.GameController;
import racingcar.controller.GameSetupController;
import racingcar.controller.MoveController;
import racingcar.controller.RaceResultController;
import racingcar.model.Car;
import racingcar.model.RandomMove;
import racingcar.model.RaceWinner;

import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        GameSetupController setupController = new GameSetupController();
        List<Car> cars = setupController.initializeCars()
                .stream()
                .map(name -> new Car(name, new RandomMove()))
                .collect(Collectors.toList());
        int rounds = setupController.initializeRounds();

        RaceWinner raceWinner = new RaceWinner(cars);
        MoveController moveController = new MoveController(cars);
        RaceResultController resultController = new RaceResultController(raceWinner);

        GameController gameController = new GameController(cars, rounds, moveController, resultController);
        gameController.start();
    }
}