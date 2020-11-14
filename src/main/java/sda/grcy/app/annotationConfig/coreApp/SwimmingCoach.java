package sda.grcy.app.annotationConfig.coreApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("poolCoach")
public class SwimmingCoach implements Coach {
    private DietService dietService;

    public String getDailyWorkout() {
        return "Swim 50 pools";
    }

    public String getWeeklyDiet() {
        return "Swimming coach suggestions: " + dietService.getDietDetails();
    }

    @Autowired
    @Qualifier("vegeDietService")
    public void setDietService(DietService dietService) {
        this.dietService = dietService;
    }
}
