package be.intecbrussel;

public class MediaAdapter implements MediaPlayer{

    private AdvancedMediaPlayer advanceMusicPlayer;

    //Constructor
    public  MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advanceMusicPlayer = new VlcPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")){
            advanceMusicPlayer = new Mp4Player();
        }

    }



    //Method
    public void MediaAdapter(String audio){

    }


    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("Vlc")){
            advanceMusicPlayer.playVlc(filename);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advanceMusicPlayer.playMp4(filename);
        }

    }
}
