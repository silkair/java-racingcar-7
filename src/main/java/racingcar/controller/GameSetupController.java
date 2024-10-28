package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.RandomMove;
import racingcar.view.InputView;

import java.util.ArrayList;
import java.util.List;

public class GameSetupController {
    public List<Car> initializeCars() {
        String[] carNames = InputView.getCarNames();
        List<Car> cars = new ArrayList<>();
        for (String name : carNames) {
            cars.add(new Car(name, new RandomMove())); // RandomMove 인스턴스 추가
        }
        return cars;
    }

    public int initializeRounds() {
        return InputView.getRounds();
    }
}
