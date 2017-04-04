package mitch.mtbuninyong_project_2017;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SoundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_sound);

        final MediaPlayer catSoundMediaPlayer = MediaPlayer.create(this, R.raw.cat);

        final Button playCatMeow = (Button) this.findViewById(R.id.sound_button);

        playCatMeow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catSoundMediaPlayer.start();
            }
        });

    }


}
