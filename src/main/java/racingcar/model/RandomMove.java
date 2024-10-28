package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomMove implements CarMove {
    @Override
    public boolean canMove() {
        int randomValue = Randoms.pickNumberInRange(0, 9);
        return randomValue >= 4;
    }
}
