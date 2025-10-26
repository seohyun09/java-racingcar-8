package racingcar;

import java.util.List;
import java.util.stream.Collectors;

public final class WinnerFinder {

    public static List<String> findWinner(List<Car> cars) {
        int maxValue = cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);

        return cars.stream()
                .filter(car -> car.getPosition() == maxValue)
                .map(Car::getName)
                .collect(Collectors.toList());
    }
}
