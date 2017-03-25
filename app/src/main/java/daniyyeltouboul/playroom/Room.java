package daniyyeltouboul.playroom;



/**
 * Created by Daniyyel on 28/02/2017.
 */

public class Room {

    private String profilePhoto;
    private String userName;
    private String joinTime;
    private String genres;
    private String songName;
    private String artistName;
    private String songNumber;
    private String userNumber;
    private String videoPhoto;

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

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(String joinTime) {
        this.joinTime = joinTime;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getSongNumber() {
        return songNumber;
    }

    public void setSongNumber(String songNumber) {
        this.songNumber = songNumber;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getVideoPhoto() {
        return videoPhoto;
    }

    public void setVideoPhoto(String videoPhoto) {
        this.videoPhoto = videoPhoto;
    }
}
