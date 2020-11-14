package sda.grcy.app.javaConfig.coreApp;

public class SwimmingCoach implements Coach {
    private DietService dietService;

    public String getDailyWorkout() {
        return "Swim 50 pools";
    }

    public String getWeeklyDiet() {
        return "Swimming coach suggestions: " + dietService.getDietDetails();
    }

    public void setDietService(DietService dietService) {
        this.dietService = dietService;
    }
}
