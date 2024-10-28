package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.RacingGame;
import racingcar.view.InputView;
import racingcar.view.OutputView;
import java.util.ArrayList;
import java.util.List;

public class GameController {
    public void start() {
        String[] carNames = InputView.getCarNames();
        int rounds = InputView.getRounds();

        List<Car> cars = new ArrayList<>();
        for (String name : carNames) {
            cars.add(new Car(name));
        }

        RacingGame racingGame = new RacingGame(cars);

        for (int i = 0; i < rounds; i++) {
            racingGame.playRound();
            OutputView.printRoundResult(racingGame.getCars());
        }

        //우승자 출력
        List<Car> winners = racingGame.determineWinners();
        OutputView.printWinners(winners);
    }
}
