package testspring;

import java.util.ArrayList;
import java.util.List;

/*
 * Реализация тестового приложения с помощью Spring
 * метод реализующий зависимости
 * @author Kolesnikov Evgeniy (evgeniysanich@mail.ru)
 * @version 1.0
 */
public class MusicPlayer {
    private List<Music> music  = new ArrayList<Music>();
    private String name;
    private int volume;

    //Invertion of control
    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public MusicPlayer() {}

    public void setMusic(List<Music> music) {
        this.music = music;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic() {
        for (Music a : music) {
        System.out.println("Playing " + a.getSong());
        }
    }
}
