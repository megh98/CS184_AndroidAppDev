package edu.ucsb.cs.cs184.meghshah.mshahprogcolorswap;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //Create a linear layout
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setHorizontalGravity(1);


        //Create text view
        final TextView textView = new TextView(this);
        textView.setTextSize(25);
        textView.setText("Tap to Change Color");
        textView.setLayoutParams(params);

        //Create a button
        Button button = new Button(this);
        button.setText("TAP ME!");
        button.setLayoutParams(params);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Random rand = new Random();
                int r = rand.nextInt(255);
                int g = rand.nextInt(255);
                int b = rand.nextInt(255);

                int randomColor = Color.rgb(r,g,b);
                textView.setText("COLOR: " +r+"r "+g+"g "+b+"b");
                textView.setTextColor(randomColor);
            }
        });

        //Add to linear layout
        linearLayout.addView(textView);
        linearLayout.addView(button);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ActionBar.LayoutParams.MATCH_PARENT,
                ActionBar.LayoutParams.MATCH_PARENT
        );
        this.addContentView(linearLayout, layoutParams);
        }


}

