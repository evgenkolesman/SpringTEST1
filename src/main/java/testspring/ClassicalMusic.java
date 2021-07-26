package testspring;

/*
 * Реализация тестового приложения с помощью Spring
 *
 * @author Kolesnikov Evgeniy (evgeniysanich@mail.ru)
 * @version 1.0
 */

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;

import java.util.List;
import java.util.Random;

//@Component
public class ClassicalMusic implements Music{

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destroy");
    }

    public String getSong() {
        return "Mendelssohn's Waltz";
    }
}
