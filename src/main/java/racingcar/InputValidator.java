package racingcar;

public final class InputValidator {

    public static String validateCarNameLength(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5글자 이하이어야 합니다.");
        }
        return carName;
    }
}
