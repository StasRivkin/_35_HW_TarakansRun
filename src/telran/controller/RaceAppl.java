package telran.controller;

import telran.infra.Race;

public class RaceAppl {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Wrong arguments! \nApplication started with default values.\n");
            Race.startRace(7, 10);
        } else {
            Race.startRace(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        }
    }
}
