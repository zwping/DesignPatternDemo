package structural_pattern.adapter_pattern;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("播放Vlc" + fileName);
    }

    @Override
    public void playMp4(String fileName) {
    }
}
