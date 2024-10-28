package racingcar.model;

import java.util.List;

public class RaceWinner {
    private final List<Car> cars;

    public RaceWinner(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> determineWinners() {
        int maxPosition = cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);

        return cars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .toList();
    }

    public List<Car> getCars() {
        return cars;
    }
}
