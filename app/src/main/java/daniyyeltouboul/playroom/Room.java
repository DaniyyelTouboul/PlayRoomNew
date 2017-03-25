package daniyyeltouboul.playroom;



/**
 * Created by Daniyyel on 28/02/2017.
 */

public class Room {

    String profilePhoto;
    String userName;
    String joinTime;
    String genres;
    String songName;
    String artistName;
    String songNumber;
    String userNumber;
    String videoPhoto;

    public Room(String profilePhoto, String userName, String joinTime, String genres, String songName, String artistName, String songNumber, String userNumber, String videoPhoto) {
        this.profilePhoto = profilePhoto;
        this.userName = userName;
        this.joinTime = joinTime;
        this.genres = genres;
        this.songName = songName;
        this.artistName = artistName;
        this.songNumber = songNumber;
        this.userNumber = userNumber;
        this.videoPhoto = videoPhoto;
    }

    public Room() {
    }
}