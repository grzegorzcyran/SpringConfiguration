package sda.grcy.app.javaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sda.grcy.app.javaConfig.coreApp.Coach;
import sda.grcy.app.javaConfig.coreApp.DietService;

public class JavaConfigMainApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(
                        new Class[]{JavaConfigClass.class}
                        );

        Coach coach1 = context.getBean("footballCoach", Coach.class);
        Coach coach2 = context.getBean("poolCoach", Coach.class);

        DietService dietService = context.getBean("ketoDietService", DietService.class);

        System.out.println("=====================");
        System.out.println(coach1.getDailyWorkout());
        System.out.println(coach1.getWeeklyDiet());
        System.out.println("=====================");
        System.out.println(coach2.getDailyWorkout());
        System.out.println(coach2.getWeeklyDiet());
        System.out.println("=====================");
        System.out.println(dietService.getDietDetails());

    }
}
