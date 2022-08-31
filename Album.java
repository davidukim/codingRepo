import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private List<Song> songs;

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        List<Song> songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        if (findSong(title) == null){
            songs.add(new Song(title, duration));
            return true;
        } else{
            System.out.println("Failed to add a song. Song already exists");
            return false;
        }
    }

    public Song findSong(String title){
        Iterator songsIterator = songs.iterator();
        if (songs.size() == 0){
            return null;
        }

        while (songsIterator.hasNext()){
            int i = 0;
            if ( songs.get(i).title == title ){
                return songs.get(i);
            }
        }
        return null; // returns null if song was not found
    }

}
