package testspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Реализация тестового приложения с помощью Spring
 * выводим имя класса объекта
 *
 * @author Kolesnikov Evgeniy (evgeniysanich@mail.ru)
 * @version 1.0
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        TestBean testBean = context.getBean("testBean", TestBean.class); // id, nameClass.class
        System.out.println(testBean.getName());

        context.close();
    }
}
