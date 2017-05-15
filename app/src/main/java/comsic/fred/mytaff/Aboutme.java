package comsic.fred.mytaff;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Aboutme extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    int soundId = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutme);

        //Toast onclick
        ImageView clickImageView = (ImageView) findViewById(R.id.imvImageAboutme);
        clickImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hello! My name is FRED", Toast.LENGTH_SHORT).show();

                soundId = R.raw.s1;
                playSound(soundId);

            }
        });

        //Toast onLongclick
        ImageView longClickImageView = (ImageView) findViewById(R.id.imvImageAboutme);
        longClickImageView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(), "\t\t\t\t\tThanks Guy!\nHope you like the My First App", Toast.LENGTH_SHORT).show();

                soundId = R.raw.s2;
                playSound(soundId);


                return true;
            }
        });

        //Phone onclick
        TextView phoneTextView = (TextView) findViewById(R.id.txttle);
        phoneTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:0906473525"));
                startActivity(phoneIntent);
            }
        });

    }

    private void playSound(int soundId) {
        mediaPlayer = MediaPlayer.create(getApplicationContext(), soundId);
        mediaPlayer.start();






    }

    public void onfb (View view) {

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.facebook.com/aunfredforfun"));
        startActivity(intent);

    }
    public void  backmain (View view) {
        Intent intent = new Intent(Aboutme.this, MainActivity.class);
        startActivity(intent);
    }
    public void  ondetail (View view) {
        Intent intent = new Intent(Aboutme.this,Detail.class);
        startActivity(intent);
    }



}
