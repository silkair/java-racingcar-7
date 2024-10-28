package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.RaceWinner;
import racingcar.view.OutputView;

import java.util.List;

public class RaceResultController {
    private final RaceWinner racingGame;

    public RaceResultController(RaceWinner racingGame) {
        this.racingGame = racingGame;
    }

    public void printWinners() {
        List<Car> winners = racingGame.determineWinners();
        OutputView.printWinners(winners);
    }
}
