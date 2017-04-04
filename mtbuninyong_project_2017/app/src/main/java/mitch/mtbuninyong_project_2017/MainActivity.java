package mitch.mtbuninyong_project_2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button goToSound = (Button) findViewById(R.id.go_to_sound);
        Button goToDragDrop = (Button) findViewById(R.id.go_to_dragdrop);



        goToSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, SoundActivity.class);
                startActivity(intent1);
            }
        });

        goToDragDrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, DragDropActivity.class);
                startActivity(intent2);
            }
        });

    }
}