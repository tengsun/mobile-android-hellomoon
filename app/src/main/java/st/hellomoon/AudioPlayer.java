package st.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by tengsun on 2/19/16.
 */
public class AudioPlayer {

    private MediaPlayer player;

    public void play(Context contex) {
        stop();

        player = MediaPlayer.create(contex, R.raw.one_small_step);
        player.start();

        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stop();
            }
        });
    }

    public void stop() {
        if (player != null) {
            player.release();
            player = null;
        }
    }

}
