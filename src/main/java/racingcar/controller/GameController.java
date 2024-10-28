package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.RaceWinner;

import java.util.List;

public class GameController {
    private final MoveController moveController;
    private final RaceResultController resultController;
    private final List<Car> cars;
    private final int rounds;

    public GameController(List<Car> cars, int rounds, MoveController moveController, RaceResultController resultController) {
        this.cars = cars;
        this.rounds = rounds;
        this.moveController = moveController;
        this.resultController = resultController;
    }

    public void start() {
        RaceWinner racingGame = new RaceWinner(cars);

        moveController.executeRounds(rounds);
        resultController.printWinners();
    }
}
