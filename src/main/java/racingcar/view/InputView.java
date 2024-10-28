package racingcar.view;

import racingcar.exception.InvalidInputException;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String[] getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)로 구분)");
        String input = scanner.nextLine();

        if (input == null || input.trim().isEmpty()) {
            throw new InvalidInputException("자동차 이름을 입력해야 합니다.");
        }

        String[] carNames = input.split(",");
        for (String name : carNames) {
            if (name.trim().isEmpty()) {
                throw new InvalidInputException("자동차 이름은 공백일 수 없습니다.");
            }
        }
        return carNames;
    }

    public static int getRounds() {
        System.out.println("시도할 횟수는 몇회인가요?");
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            throw new InvalidInputException("시도 횟수는 숫자로 입력해야 합니다.");
        }
    }
}
