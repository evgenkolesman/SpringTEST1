package testspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Реализация тестового приложения с помощью Spring
 *
 * @author Kolesnikov Evgeniy (evgeniysanich@mail.ru)
 * @version 1.0
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

       //Music music = context.getBean("musicBean", Music.class); /* id, nameClass.class */
        // MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        context.close();
    }
}
