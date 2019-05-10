package com.example.madhav.snakeandladder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button1);
        button.setText("AB");
    }

    int pos1 = 1;
    int pos2 = 1;
    int turn = 1;
    public void fun(View v) {
        turn++;
        int random = new Random().nextInt(6)+1;
        ImageView imageView = findViewById(R.id.imageView);

        String name = "d" + random;
        int resource = getResources().getIdentifier(name, "drawable", "com.example.madhav.snakeandladder");
        imageView.setImageResource(resource);


        if(turn%2 == 0) {
            String loc = "button" + pos1;
            if(pos1==1 && pos2==1) {
                resource = getResources().getIdentifier(loc, "id", "com.example.madhav.snakeandladder");
                Button button = findViewById(resource);
                button.setText("B");
            }
            else {
                resource = getResources().getIdentifier(loc, "id", "com.example.madhav.snakeandladder");
                Button button = findViewById(resource);
                button.setText("");
            }

            Button button;
            pos1 = pos1 + random;

            if(random == 1 || random == 6)
                turn--;
            if(pos2 == pos1 && pos1 != 1) {
                button = findViewById(R.id.button1);
                button.setText("B");
                Toast.makeText(this, "A cut B :(", Toast.LENGTH_SHORT).show();
                pos2 = 1;
            }


            if (pos1 == 2) {
                pos1 = 23;
                Toast.makeText(this,"A got a Ladder :)",Toast.LENGTH_SHORT).show();
            }
            else if (pos1 == 28) {
                pos1 = 47;
                Toast.makeText(this, "A got a Ladder :)", Toast.LENGTH_SHORT).show();
            }
            else if (pos1 == 37) {
                pos1 = 44;
                Toast.makeText(this, "A got a Ladder :)", Toast.LENGTH_SHORT).show();
            }
            else if (pos1 == 36) {
                pos1 = 14;
                Toast.makeText(this, "A got a Snake :(", Toast.LENGTH_SHORT).show();
            }
            else if (pos1 == 30) {
                pos1 = 8;
                Toast.makeText(this, "A got a Snake :(", Toast.LENGTH_SHORT).show();
            }
            else if (pos1 > 50)
                pos1 = pos1 - random;
            else if (pos1 == 50) {
                Intent intent = new Intent(this,Main22Activity.class);
                intent.putExtra("winner",1);
                startActivity(intent);
            }

            loc = "button" + pos1;
            resource = getResources().getIdentifier(loc, "id", "com.example.madhav.snakeandladder");
            button = findViewById(resource);
            button.setText("A");
        }
        else {
            String loc = "button" + pos2;
            resource = getResources().getIdentifier(loc, "id", "com.example.madhav.snakeandladder");
            Button button = findViewById(resource);
            button.setText("");

            pos2 = pos2 + random;

            if(random == 1 || random == 6)
                turn--;
            if(pos2 == pos1 && pos1 != 1) {
                button = findViewById(R.id.button1);
                button.setText("A");
                pos1 = 1;
                Toast.makeText(this, "B cut A :(", Toast.LENGTH_SHORT).show();
             }

            if (pos2 == 2) {
                pos2 = 23;
                Toast.makeText(this, "B got a Ladder :)", Toast.LENGTH_SHORT).show();
            }
            else if (pos2 == 28) {
                pos2 = 47;
                Toast.makeText(this, "B got a Ladder :)", Toast.LENGTH_SHORT).show();
            }
            else if (pos2 == 37) {
                pos2 = 44;
                Toast.makeText(this, "B got a Ladder :}", Toast.LENGTH_SHORT).show();
            }
            else if (pos2 == 36) {
                pos2 = 14;
                Toast.makeText(this, "B got a Snake :(", Toast.LENGTH_SHORT).show();
            }
            else if (pos2 == 30) {
                pos2 = 8;
                Toast.makeText(this, "B got a Snake :(", Toast.LENGTH_SHORT).show();
            }
            else if (pos2 > 50)
                pos2 = pos2 - random;
            else if (pos2 == 50) {
                Intent intent = new Intent(this,Main22Activity.class);
                intent.putExtra("winner",2);
                startActivity(intent);
            }

            loc = "button" + pos2;
            resource = getResources().getIdentifier(loc, "id", "com.example.madhav.snakeandladder");
            button = findViewById(resource);
            button.setText("B");
        }
    }
}
