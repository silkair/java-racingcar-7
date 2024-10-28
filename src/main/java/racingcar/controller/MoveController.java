package racingcar.controller;

import racingcar.model.RaceWinner;
import racingcar.view.OutputView;

public class MoveController {
    private final RaceWinner racingGame;

    public MoveController(RaceWinner racingGame) {
        this.racingGame = racingGame;
    }

    public void executeRounds(int rounds) {
        for (int i = 0; i < rounds; i++) {
            racingGame.playRound();
            OutputView.printRoundResult(racingGame.getCars());
        }
    }
}
