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

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());



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


        //musicPlayer.playMusic();
        /*System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());*/
        context.close();
    }
}
