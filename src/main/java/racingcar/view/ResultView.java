package racingcar.view;

import racingcar.entity.RacingCar;

import java.util.List;

public class ResultView {
    public static void printWinners(String[] winners) {
        int i;
        for (i = 0; i < winners.length - 1; i++) {
            System.out.print(winners[i] + ", ");
        }
        System.out.print(winners[i]);
        System.out.println("가 최종 우승했습니다.");
    }

    public void printRacingCarsPosition(List<RacingCar> racingCars) {
        for (RacingCar racingCar: racingCars) {
            printName(racingCar.getName());
            printPosition(racingCar.getPosition());
        }
        System.out.println();
    }

    private void printName(String name) {
        System.out.print(name + " : ");
    }

    private void printPosition(int position) {
        for (int i = 0; i < position; i++) {
            System.out.print('-');
        }
        System.out.println();
    }

    public void printResultFirstLine() {
        System.out.println();
        System.out.println("실행 결과");
    }
}