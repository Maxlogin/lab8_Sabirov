import java.util.Objects;
public class Song {
    public final String title;
    public final String artist;
    public final String songwriter;

    public Song(String title, String artist, String songwriter) {
        this.title = title;
        this.artist = artist;
        this.songwriter = songwriter;
    }

    @Override
    public boolean equals(Object obj) {
        // Проверка на рефлексивность
        if (this == obj) return true;
        // Проверка на null и принадлежность к другому классу
        if (obj == null || getClass() != obj.getClass()) return false;
        // Приведение к типу Song
        Song song = (Song) obj;
        // Сравнение полей
        return Objects.equals(title, song.title) &&
                Objects.equals(artist, song.artist) &&
                Objects.equals(songwriter, song.songwriter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, songwriter);
    }
}
