package edu.ucsb.cs.cs184.meghshah.mshahxmlcolorswap;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        TextView tv = findViewById(R.id.ColorMessage);
        Random rand = new Random();
        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);

        int randomColor = Color.rgb(r,g,b);
        tv.setTextSize(25);
        tv.setText("COLOR: " +r+"r "+g+"g "+b+"b");
        tv.setTextColor(randomColor);

    }
}
