package be.intecbrussel;

public class AudioPlayer implements MediaPlayer{

  private MediaAdapter mediaAdapter;


    @Override
    public void play(String audioType, String filename) {
      if(audioType.equalsIgnoreCase("mp3")){
        System.out.println("Playing mp3 file. Name: "+filename);
      }else if(audioType.equalsIgnoreCase("Vlc") || audioType.equalsIgnoreCase("mp4")){
        mediaAdapter = new MediaAdapter(audioType);
        mediaAdapter.play(audioType,filename);
      }else {
        System.out.println("no mdeia. "+audioType+"not good");
      }

    }
}
