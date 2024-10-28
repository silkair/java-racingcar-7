package racingcar.model;

public class Car {
    private final String name;
    private int position;
    private final CarMove moveStrategy;

    public Car(String name, CarMove moveStrategy) {
        this.name = name;
        this.position = 0;
        this.moveStrategy = moveStrategy;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move(int randomValue) {
        if (moveStrategy.canMove()) {
            position++;
        }
    }
}
