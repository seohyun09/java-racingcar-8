package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Application {

    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String inputCarNames = Console.readLine();
        String[] carNames = InputSplitter.splitInputCarNames(inputCarNames);
        List<Car> cars = CarFactory.createCars(carNames);

        System.out.println("시도할 횟수는 몇 회인가요?");
        String inputChance = Console.readLine();
        InputValidator.validateInputChance(inputChance);

        int chance = Integer.parseInt(inputChance);

        System.out.println("실행 결과");
        IntStream.range(0, chance)
                .forEach(i -> {
                    cars.forEach(car -> {
                        car.move(Randoms.pickNumberInRange(0, 9));
                        car.printResult();
                    });
                    System.out.println();
                });

        List<String> winners = WinnerFinder.findWinner(cars);
        System.out.println("최종 우승자 : " + String.join(", ", winners));

    }
}
