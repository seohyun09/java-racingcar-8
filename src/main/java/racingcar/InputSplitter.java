package racingcar;

import java.util.Arrays;

public final class InputSplitter {

    public static String[] splitInputCarNames(String inputCarNames) {
        return Arrays.stream(inputCarNames.split(","))
                .map(carName -> InputValidator.validateCarNameLength(carName.trim()))
                .toArray(String[]::new);
    }
}
