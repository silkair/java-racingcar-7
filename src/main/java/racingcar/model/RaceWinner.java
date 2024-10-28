package racingcar.model;

import java.util.List;

public class RaceWinner {
    private final List<Car> cars;

    public RaceWinner(List<Car> cars) {
        this.cars = cars;
    }

    public void playRounds(int rounds) {
        for (int i = 0; i < rounds; i++) {
            GameRound round = new GameRound(cars);
            round.playRound();
        }
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
