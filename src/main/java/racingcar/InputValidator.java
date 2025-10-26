package racingcar;

public final class InputValidator {

    public static String validateCarNameLength(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5글자 이하이어야 합니다.");
        }
        return carName;
    }

    public static void validateInputChance(String inputChance) {
        if (inputChance == null || inputChance.isBlank()) {
            throw new IllegalArgumentException("한 글자 이상 입력해주세요");
        }
        if (!inputChance.matches("\\d+")) {
            throw new IllegalArgumentException("0 이상 정수를 입력해주세요");
        }
    }
}
