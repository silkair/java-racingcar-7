package racingcar.model;

import java.util.List;

public class GameRound {
    private final List<Car> cars;

    public GameRound(List<Car> cars) {
        this.cars = cars;
    }

    public void playRound() {
        for (Car car : cars) {
            car.move();
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
