package sda.grcy.app.xmlConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import sda.grcy.app.xmlConfig.coreApp.Coach;
import sda.grcy.app.xmlConfig.coreApp.DietService;

public class XmlConfigBaseApp {
    public static void main(String[] args) {

        //określamy że będziemy korzystać z beanów (obiektów) dostarczonych z contextu Springa
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        Coach coach = context.getBean("footballCoach", Coach.class);
        Coach secondFootballCoach = context.getBean("secondFootballCoach", Coach.class);
        Coach anotherCoach = context.getBean("swimCoach", Coach.class);
        DietService dietService = context.getBean("vegeDiet", DietService.class);

        System.out.println("XML init in action");
        System.out.println("First coach:");
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getWeeklyDiet());
        System.out.println("==========================");
        System.out.println("Swimming coach");
        System.out.println(anotherCoach.getDailyWorkout());
        System.out.println(anotherCoach.getWeeklyDiet());
        System.out.println("==========================");
        System.out.println("Second football coach");
        System.out.println(secondFootballCoach.getDailyWorkout());
        System.out.println(secondFootballCoach.getWeeklyDiet());
        System.out.println("==========================");

        System.out.println("Diet print");
        System.out.println(dietService.getDietDetails());
        context.close();
    }
}
