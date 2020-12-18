package com.example.catproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Dictionary;

public class MainActivity extends AppCompatActivity {
    private TextView obj_text_view_1, obj_text_view_2, obj_json_1, obj_json_2;
    private View obj_view_1, obj_view_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Поулчить ссылки на элементы дизайна
        obj_text_view_1 = findViewById(R.id.textView2);
        obj_text_view_2 = findViewById(R.id.textView8);
        obj_json_1 = findViewById(R.id.textView4);
        obj_json_2 = findViewById(R.id.textView6);
        obj_view_1 = findViewById(R.id.view1);
        obj_view_2 = findViewById(R.id.view2);

        Gson gson = new Gson();

        Cat murzik = new Cat("Мурзик", 7, Color.BLACK);

        obj_text_view_1.setText(String.format("Кот: %s, %d лет, цвет: ", murzik.getName(), murzik.getAge()));
        obj_view_1.setBackgroundColor(murzik.getColor());
        obj_json_1.setText(gson.toJson(murzik));

        String new_json_cat = "{'age':8,'color':-256,'name':'Барсик'}";
        Cat barsik = gson.fromJson(new_json_cat, Cat.class);

        obj_json_2.setText(new_json_cat);
        obj_text_view_2.setText(String.format("Кот: %s, %d лет, цвет: ", barsik.getName(), barsik.getAge()));
        obj_view_2.setBackgroundColor(barsik.getColor());
    }
}