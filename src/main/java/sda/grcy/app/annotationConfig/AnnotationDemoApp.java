package sda.grcy.app.annotationConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import sda.grcy.app.annotationConfig.coreApp.Coach;
import sda.grcy.app.annotationConfig.coreApp.DietService;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-application-context.xml");

        Coach footballCoach = context.getBean("footballCoach", Coach.class);
        Coach poolCoach = context.getBean("poolCoach", Coach.class);

        DietService dietService = context.getBean("vegeDietService", DietService.class);

        System.out.println("=========================");
        System.out.println("Football coach");
        System.out.println("Workout instructions: " + footballCoach.getDailyWorkout());
        System.out.println("Diet instructions: " + footballCoach.getWeeklyDiet());

        System.out.println("=========================");
        System.out.println("Swimming coach");
        System.out.println("Workout instructions: " + poolCoach.getDailyWorkout());
        System.out.println("Diet instructions: " + poolCoach.getWeeklyDiet());

        System.out.println("=========================");
        System.out.println("Diet separated: " + dietService.getDietDetails());

        context.close();

    }
}
