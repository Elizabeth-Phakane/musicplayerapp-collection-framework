package musicplayerapp;

import java.util.ArrayList;
import java.util.HashMap;

public class MusicPlayer {
    private String genre;
    private String inputSong;

    //Constructor to enter the song requested to be played
    public MusicPlayer(String inputSong) {
        this.inputSong = inputSong;
    }

    public String getInputSong() {
        return inputSong;
    }

    /*This method contains songs that belong to a particular album, it checks if the
     requested song exits in the list to play it. If it doesn't exist it sends out a message of non-existance.
     */
    public void playInputSong() {

        //Inserting a album that contains it's name and artist using hashmap
        genre = "Soul";
        HashMap<String, String> albumDetail = new HashMap<>();
        albumDetail.put("The miseducation of Lauryn Hill", "Lauryn Hill");

        //converting hashmap to arraylist and displaying the album names
        ArrayList<String> album = new ArrayList<>(albumDetail.keySet());
        for(String a : album){
            System.out.println(a+" " + albumDetail.values()+": "+genre);


        }

       //Inserting song titles containing it's name and album name
        HashMap<String, String> album1Song = new HashMap();
        album1Song .put("Can't Take My Eyes Off Of You", "The miseducation of Lauryn Hill");
        album1Song .put("Ex-Factor", "The miseducation of Lauryn Hill");
        album1Song .put("Sweetest Thing", "The miseducation of Lauryn Hill");

        //converting hashset to arraylist and displaying the song titles
        ArrayList<String> music = new ArrayList<>(album1Song .keySet());
        for (String m : music) {

            System.out.println(m);
        }


       //Checking if the requested song exists so it can be played, if not a non-existance message is displayed.
        if (music.contains(inputSong)) {

            System.out.println("Now playing: "+ inputSong);
        } else
            System.out.println("Song not found");
    }

}
