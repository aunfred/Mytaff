package comsic.fred.mytaff;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class TestLayout extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    int soundId = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_layout);

        //Toast onclick
        ImageView clickImageView = (ImageView) findViewById(R.id.imageView3);
        clickImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hello! My name is FRED", Toast.LENGTH_SHORT).show();

                soundId = R.raw.s1;
                playSound(soundId);

            }
        });

        //Toast onLongclick
        ImageView longClickImageView = (ImageView) findViewById(R.id.imageView3);
        longClickImageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(), "\t\t\t\t\tThanks Guy!\nHope you like the My First App", Toast.LENGTH_SHORT).show();

                soundId = R.raw.s2;
                playSound(soundId);

                return true;
            }
        });


    }

    private void playSound(int soundId) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), soundId);
        mediaPlayer.start();


    }
}
