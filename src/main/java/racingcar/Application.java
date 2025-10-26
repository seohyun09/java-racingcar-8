package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.stream.IntStream;

public class Application {

    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String inputCarNames = Console.readLine();
        String[] carNames = InputSplitter.splitInputCarNames(inputCarNames);

        System.out.println("시도할 횟수는 몇 회인가요?");
        String inputChance = Console.readLine();
        InputValidator.validateInputChance(inputChance);

        int chance = Integer.parseInt(inputChance);
        System.out.println("chance = " + chance);

        int[] randomNumbers = IntStream.range(0, chance)
                .map(num -> Randoms.pickNumberInRange(0, 9))
                .toArray();
    }
}
