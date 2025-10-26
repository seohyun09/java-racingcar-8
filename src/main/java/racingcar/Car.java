package racingcar;

public class Car {

    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public void move(int randomNumber) {
        if (randomNumber < 4) {
            return;
        }
        position += 1;
    }

    public void printResult() {
        System.out.println(this.name + " : " + "-".repeat(position));
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }
}
