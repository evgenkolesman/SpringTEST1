package testspring;

/*
 * Реализация тестового приложения с помощью Spring
 *
 * @author Kolesnikov Evgeniy (evgeniysanich@mail.ru)
 * @version 1.0
 */
public class ClassicalMusic implements Music{

    private ClassicalMusic() {}

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public String getSong() {
        return "Mendelssohn's Waltz";
    }

    public static ClassicalMusic doMyFactory() {
        return  new ClassicalMusic();}

    public void doMyDestroy() {
        System.out.println("Doing my destraction");
    }
}
