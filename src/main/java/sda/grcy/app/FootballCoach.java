package sda.grcy.app;

public class FootballCoach implements Coach {
    private DietService dietService;
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

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
