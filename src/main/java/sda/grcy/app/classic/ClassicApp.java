package sda.grcy.app.classic;

import sda.grcy.app.Coach;
import sda.grcy.app.DietService;
import sda.grcy.app.FootballCoach;
import sda.grcy.app.KetoDietService;

public class ClassicApp {
    public static void main(String[] args) {
        DietService dietService = new KetoDietService();
        //tutaj mamy dependency injection za pomocą konstruktora
        Coach coach = new FootballCoach(dietService);

        System.out.println("Workout applied:");
        System.out.println(coach.getDailyWorkout());

        System.out.println("Diet applied:");
        System.out.println(coach.getWeeklyDiet());
    }
}
