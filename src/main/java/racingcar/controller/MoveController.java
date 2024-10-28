package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.RacingGame;
import racingcar.view.OutputView;

import java.util.List;

public class MoveController {
    private final RacingGame racingGame;

    public MoveController(RacingGame racingGame) {
        this.racingGame = racingGame;
    }

    public void executeRounds(int rounds) {
        for (int i = 0; i < rounds; i++) {
            racingGame.playRound();
            OutputView.printRoundResult(racingGame.getCars());
        }
    }
}
