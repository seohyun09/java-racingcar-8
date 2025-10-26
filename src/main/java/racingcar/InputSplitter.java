package racingcar;

import java.util.Arrays;

public final class InputSplitter {

    public static String[] splitInputCarNames(String inputCarNames) {
        return Arrays.stream(inputCarNames.split(","))
                .map(String::trim)
                .toArray(String[]::new);
    }
}
