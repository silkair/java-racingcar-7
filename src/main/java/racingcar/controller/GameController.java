package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.RacingGame;

import java.util.List;

public class GameController {
    private final GameSetupController setupController;
    private final MoveController moveController;
    private final RaceResultController resultController;

    public GameController(GameSetupController setupController, MoveController moveController, RaceResultController resultController) {
        this.setupController = setupController;
        this.moveController = moveController;
        this.resultController = resultController;
    }

    public void start() {
        List<Car> cars = setupController.initializeCars();
        int rounds = setupController.initializeRounds();

        RacingGame racingGame = new RacingGame(cars);

        moveController.executeRounds(rounds);
        resultController.printWinners();
    }
}
