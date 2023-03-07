package telran.infra;

import telran.model.Racer;
import telran.model.Tarakan;

public class Race {
    private static Tarakan winner = null;
    public static void startRace(int racersAmount, int distance) throws InterruptedException {
        Racer racers[] = new Racer[racersAmount];
        Thread threads[] = new Thread[racersAmount];
        for (int i = 0; i < racersAmount; i++) {
            racers[i] = new Racer(i + 1, distance);
            threads[i] = new Thread(racers[i]);
        }
        System.out.println("Let the race begins !!!");
        for (int i = 0; i < racersAmount; i++) {
            threads[i].start();
        }
        for (int i = 0; i < racersAmount; i++) {
            threads[i].join();
        }
        System.out.println("Tarakan#" + winner.getId() + " finished first!");
    }

    public static void setWinner(Tarakan tarakan) {
        if (winner == null) {
            winner = tarakan;
        }
    }
}
