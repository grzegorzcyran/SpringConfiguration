package sda.grcy.app.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import sda.grcy.app.javaConfig.coreApp.*;

@Configuration
@ComponentScan({"sda.grcy.app.javaConfig.coreApp"})
@PropertySource({"classpath:xmlApp.properties"})
public class JavaConfigClass {

    @Bean
    public DietService ketoDietService() {
        return new KetoDietService();
    }

    @Bean
    public DietService vegeDietService(){
        return new VegeDietService();
    }

    @Bean
    public Coach footballCoach() {
        return new FootballCoach(vegeDietService());
    }

    @Bean Coach poolCoach() {
        SwimmingCoach coach = new SwimmingCoach();
        coach.setDietService(ketoDietService());
        return coach;
    }
}
