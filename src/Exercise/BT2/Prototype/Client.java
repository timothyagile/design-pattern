package Exercise.BT2.Prototype;

public class Client {
    public static void operate() {
        Film film = new Film("Doraemon", "Anime", 130);
        TVShow tvShow = new TVShow("Detective Conan", "Detective", 30);
        MusicShow musicShow = new MusicShow("NTPMM", "Pop/Rap", 500);


        System.out.println("Prototype");
        film.ShowInfo();
        tvShow.ShowInfo();
        musicShow.ShowInfo();

        Film copiedFilm = (Film) film.clone();
        TVShow copiedTvShow = (TVShow) tvShow.clone();
        MusicShow copiedMusicShow = (MusicShow) musicShow.clone();

        System.out.println("Copy");

        copiedFilm.ShowInfo();
        copiedTvShow.ShowInfo();
        copiedMusicShow.ShowInfo();
    }
}
