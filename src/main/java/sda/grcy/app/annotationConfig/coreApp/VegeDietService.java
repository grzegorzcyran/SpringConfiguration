package sda.grcy.app.annotationConfig.coreApp;

import org.springframework.stereotype.Component;

@Component
public class VegeDietService implements DietService {
    public String getDietDetails() {
        return "Vegetarian diet suggested!";
    }
}
