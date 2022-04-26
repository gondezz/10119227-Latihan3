package com.programmer.a10119227_latihan3;
// Nama                 : Naufal Hafizh Widiathalla
// NIM                  : 10119227
// Kelas                : IF-6
// Tanggal Pengerjaan   : 26-April-2022

import static com.programmer.a10119227_latihan3.DoneActivity.ID_EXTRA_MSG_EXIT;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        if (getIntent().getBooleanExtra(ID_EXTRA_MSG_EXIT, false)) {
            finish();
        }
    }


    @OnClick(R.id.btnWalkthroughStart)
    void mulai() {
        Intent intent = new Intent(this, LoginCodeActivity.class);
        startActivity(intent);
    }
}