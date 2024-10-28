package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.GameRound;
import racingcar.view.OutputView;

import java.util.List;

public class MoveController {
    private final List<Car> cars;

    public MoveController(List<Car> cars) {
        this.cars = cars;
    }

    public void executeRounds(int rounds) {
        for (int i = 0; i < rounds; i++) {
            GameRound round = new GameRound(cars); // 각 라운드에 대해 GameRound 생성
            round.playRound(); // GameRound에서 playRound 실행
            OutputView.printRoundResult(cars);
        }
    }
}
