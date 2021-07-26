package testspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Реализация тестового приложения с помощью Spring
 * метод реализующий зависимости
 * @author Kolesnikov Evgeniy (evgeniysanich@mail.ru)
 * @version 1.0
 */
//@Component
public class MusicPlayer {
   List<Music> musicList = new ArrayList<Music>();
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

   // @Autowired
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }


    public String playMusic() {
        Random random = new Random();
        return "Playing: " + musicList.get(random.nextInt(musicList.size() -1)).getSong() ;
    }

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }
}
