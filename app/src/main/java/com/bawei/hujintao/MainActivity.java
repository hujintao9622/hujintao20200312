package com.bawei.hujintao;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //头
        builder.setTitle("版本更新");
        //消息
        builder.setMessage("是滴,我们又发现新版本来了");
        //图标
        builder.setIcon(R.mipmap.ic_launcher);
        //确定按钮
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.out.println("确定更新");
            }
        });
        //取消按钮
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.out.println("取消更新");
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
