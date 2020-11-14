package sda.grcy.app.javaConfig.coreApp;

import org.springframework.beans.factory.annotation.Value;

public class FootballCoach implements Coach {
    private DietService dietService;

    @Value("${team.name}")
    private String teamName;

    public FootballCoach(DietService dietService) {
        this.dietService = dietService;
    }

    public String getDailyWorkout() {
        return "Speed based workout!";
    }

    public String getWeeklyDiet() {
        return "This week for " + teamName + " from football coach: " + dietService.getDietDetails();
    }

}
