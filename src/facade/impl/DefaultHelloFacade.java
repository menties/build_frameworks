package facade.impl;

import facade.HelloFacade;
import org.springframework.stereotype.Component;

@Component
public class DefaultHelloFacade implements HelloFacade {

    private static final String MAKS_NAME = "Maks";

    public String getMaksName() {
        return MAKS_NAME;
    }
}
