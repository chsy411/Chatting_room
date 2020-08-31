package com.example.chatting_room;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
            ListView m_ListView;
            CustomAdapter m_Adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catting_room_main);

        m_Adapter = new CustomAdapter();

        m_ListView = findViewById(R.id.listView1);

    }
}