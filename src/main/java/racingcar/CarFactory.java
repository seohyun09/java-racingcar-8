package racingcar;

import java.util.Arrays;
import java.util.List;

public final class CarFactory {

    public static List<Car> createCars(String[] carNames) {
        return Arrays.stream(carNames)
                .map(Car::new)
                .toList();
    }
}
