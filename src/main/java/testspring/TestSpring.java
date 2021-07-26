package testspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;

/*
 * Реализация тестового приложения с помощью Spring
 *
 * @author Kolesnikov Evgeniy (evgeniysanich@mail.ru)
 * @version 1.0
 */
public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);


        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //System.out.println(musicPlayer.playMusic());
        System.out.println(musicPlayer.getVolume() + " " + musicPlayer.getName());


        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);


        context.close();

// Music music = context.getBean("musicBean", Music.class); /* id, nameClass.class */
// MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        firstMusicPlayer.setVolume(10);
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//        System.out.println(comparison);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//        System.out.println(secondMusicPlayer.getVolume());
//        System.out.println(firstMusicPlayer.getVolume());

    }
}
