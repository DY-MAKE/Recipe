package edu.data.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

public class MainActivity extends AppCompatActivity implements OnEditorActionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private EditText searchBar = findViewById(R.id.searchBar);
    private Button subBtn = findViewById(R.id.btn);

    subBtn.OnClickListener(
            new Button.OnClickListener() {
                @Override
                public void onClick(View view){

            }
    });

    //    searchBar.setOnEditorActionListener(new TextView.OnEditorActionListener() { // 외않됨? ㅆㅂ
//        @Override
//    });

}