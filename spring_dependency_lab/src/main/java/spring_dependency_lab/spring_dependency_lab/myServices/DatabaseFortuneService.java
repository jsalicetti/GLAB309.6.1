package spring_dependency_lab.spring_dependency_lab.myServices;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneServices {

    @Override
    public String getFortune() {
        // TODO Auto-generated method stub
        return "Database connection";
    }
}
