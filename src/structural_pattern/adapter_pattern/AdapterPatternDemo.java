package structural_pattern.adapter_pattern;


/**
 * <p>describe：适配器模式 （基本场景：在火锅店点火锅吃，同时点了一瓶该店没有的酒，这时需要店家出去去便利店采购）
 * <p>    note：
 * <p>    note：原有播放功能不能满足当前播放，引进新的播放代码，使用适配器模式提供给用户使用
 * <p>    note：功能扩充
 * <p>    note：
 * <p> @author：zwp on 2018/9/25 mail：1101558280@qq.com web: http://www.zwping.win </p>
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }

}
