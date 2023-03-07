package telran.model;

import telran.infra.Race;

import java.util.Random;

public class Racer extends Tarakan implements Runnable {
    int distance;
    public Racer(int id, int distance) {
        super(id);
        this.distance = distance;
    }

    @Override
    public void run() {
        for (int i = 1; i <= distance; i++) {
            int sleepTime = new Random().nextInt(4) + 2;
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            setSteps(getSteps()+1);
            System.out.println("Racer#" + getId() + " made " + getSteps() + " steps");
        }
        Race.setWinner(this);
    }
}
