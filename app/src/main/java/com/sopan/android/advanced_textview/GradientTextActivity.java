package com.sopan.android.advanced_textview;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.widget.TextView;

public class GradientTextActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_gradient_text);

    TextView textView = (TextView) findViewById(R.id.text);
    Shader shader = new LinearGradient(0, 0, 0, textView.getTextSize(), Color.RED, Color.BLUE,
        Shader.TileMode.CLAMP);
    textView.getPaint().setShader(shader);
  }
}