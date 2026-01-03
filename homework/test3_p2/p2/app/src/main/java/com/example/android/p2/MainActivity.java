package com.example.android.p2; // 替换为你的项目包名

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 获取按钮并设置点击事件
        Button btnShowDialog = findViewById(R.id.btnShowDialog);
        btnShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomLoginDialog(); // 调用显示对话框的方法
            }
        });
    }

    // 自定义方法：显示登录对话框
    private void showCustomLoginDialog() {
        // 1. 加载自定义布局
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_custom_login, null);

        // 2. 获取布局中的控件
        EditText etUsername = dialogView.findViewById(R.id.etUsername);
        EditText etPassword = dialogView.findViewById(R.id.etPassword);
        Button btnCancel = dialogView.findViewById(R.id.btnCancel);
        Button btnSignIn = dialogView.findViewById(R.id.btnSignIn);

        // 3. 创建AlertDialog
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setView(dialogView)
                .create();

        // 4. 给按钮设置点击事件
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss(); // 关闭对话框
            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 获取输入的用户名和密码
                String username = etUsername.getText().toString().trim();
                String password = etPassword.getText().toString().trim();
                // 这里可以添加登录逻辑（比如验证账号密码）
                dialog.dismiss(); // 关闭对话框
            }
        });

        // 5. 显示对话框
        dialog.show();
    }
}