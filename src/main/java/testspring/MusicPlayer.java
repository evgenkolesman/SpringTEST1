package testspring;

/*
 * Реализация тестового приложения с помощью Spring
 * метод реализующий зависимости
 * @author Kolesnikov Evgeniy (evgeniysanich@mail.ru)
 * @version 1.0
 */
public class MusicPlayer {
    private Music music;

    //Invertion of control
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }
}
