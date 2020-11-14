package sda.grcy.app.annotationConfig.coreApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
    private DietService dietService;

    @Value("Malaga")
    private String teamName;

    @Autowired
    public FootballCoach(@Qualifier("ketoDietService") DietService dietService) {
        this.dietService = dietService;
    }

    public String getDailyWorkout() {
        return "Speed based workout!";
    }

    public String getWeeklyDiet() {
        return "This week for " + teamName + " from football coach: " + dietService.getDietDetails();
    }

}
