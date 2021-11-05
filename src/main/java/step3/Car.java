package step3;

public class Car {

    private final MoveStrategy moveStrategy;
    private Position position;

    private Car(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
        this.position = Position.withDefaultPosition();
    }

    public static Car create(MoveStrategy moveStrategy) {
        return new Car(moveStrategy);
    }

    public Position getPosition() {
        return position;
    }

    public void moveOrStop() {
        if (moveStrategy.test()) {
            this.position = this.position.move();
        }
    }

}