package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondScreen extends AppCompatActivity {

    //khai báo
    TextView tvName, tvNumber, tvSingle;
    String name;
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        //ánh xạ view
        tvName = findViewById(R.id.tvName);
        tvNumber = findViewById(R.id.tvNumber);
        tvSingle = findViewById(R.id.tvSingle);

        //khai báo biến nhận dữ liệu
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        //biến lưu trữ dữ liệu


        if (bundle != null) {
            name = bundle.getString("name");
            number = bundle.getInt("number");
            boolean single = bundle.getBoolean("single");
            tvName.setText(name);
            tvNumber.setText(number+""); //textview sẽ nhận giá trị là chuỗi (String) nên phải + với 1 chuỗi rỗng

            if (single){
                tvSingle.setText("độc thân");
            } else {
                tvSingle.setText("có người yêu");
            }

        }
        //gán dữ liệu hiển thị cho textview

    }

    public void back(View view) {
        //1 kiểu khai báo khác của intent
        startActivity(new Intent(this, FirstScreen.class));
    }
}