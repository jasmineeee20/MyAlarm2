import android.app.Activity;

/**
 * Created by Marika on 2017/06/15.
 */
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.format.Time;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.marika.myalarm2.R;

public class WakeupActivity extends Activity {
    private MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wakeup);

        Log.i("@@@", "Called WakeupActivity onCreate");

        Time t = new Time();
        t.setToNow();

        // アラームをループ再生
        player.setLooping(true);
        player.start();

        Button stop_btn = (Button)findViewById(R.id.stop_btn);
        stop_btn.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {
                // アラームを止める
                player.stop();

                Intent intent = new Intent(WakeupActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("@@@", "Called WakeupActivity onStop");

        player.stop();
        finish();
    }
}
