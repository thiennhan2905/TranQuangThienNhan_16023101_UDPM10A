package com.example.administrator.tqtn_cau1;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    CheckBox ckbSaveInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ckbSaveInfo = (CheckBox) findViewById(R.id.ckb_SaveInfo);
    }

    public void Login(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Thông báo");
        if (ckbSaveInfo.isChecked()){
          builder.setMessage("Chào mừng bạn đã đăng nhập vào hệ thống, thông tin của bạn đã được lưu");
          builder.setPositiveButton("Đóng", new DialogInterface.OnClickListener() {
              @Override
              public void onClick(DialogInterface dialog, int which) {
                  dialog.dismiss();
              }
          });
        }
        else {
            builder.setMessage("Chào mừng bạn đã đăng nhập vào hệ thống, thông tin của bạn không được lưu");
            builder.setPositiveButton("Đóng", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
        }
        AlertDialog alert = builder.create();
        alert.show();

    }
}
