package racingcar.controller;

import racingcar.view.InputView;

import java.util.Arrays;
import java.util.List;

public class GameSetupController {
    public List<String> initializeCars() {
        String[] carNames = InputView.getCarNames();
        return Arrays.asList(carNames);
    }

    public int initializeRounds() {
        return InputView.getRounds();
    }
}
