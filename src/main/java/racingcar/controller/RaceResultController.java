package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.RacingGame;
import racingcar.view.OutputView;

import java.util.List;

public class RaceResultController {
    private final RacingGame racingGame;

    public RaceResultController(RacingGame racingGame) {
        this.racingGame = racingGame;
    }

    public void printWinners() {
        List<Car> winners = racingGame.determineWinners();
        OutputView.printWinners(winners);
    }
}
