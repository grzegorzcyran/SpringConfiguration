package sda.grcy.app.annotationConfig.coreApp;

import org.springframework.stereotype.Component;

@Component
public class KetoDietService implements DietService {

    public String getDietDetails() {
        return "Ketogenic diet applied!";
    }
}
