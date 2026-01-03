package com.example.android.p3;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {

    private TextView tvTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. 绑定并设置Toolbar（替代ActionBar，菜单会显示在Toolbar上）
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // 2. 强制显示菜单按钮（解决部分设备因物理Menu键不显示三点图标的问题）
        forceShowOverflowMenu();

        // 3. 绑定测试文本
        tvTest = findViewById(R.id.tv_test);
    }

    // 反射强制显示溢出菜单（三点按钮）
    private void forceShowOverflowMenu() {
        try {
            ViewConfiguration config = ViewConfiguration.get(this);
            Field menuKeyField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
            if (menuKeyField != null) {
                menuKeyField.setAccessible(true);
                menuKeyField.setBoolean(config, false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 加载菜单
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    // 菜单点击事件
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.font_small) {
            tvTest.setTextSize(10);
            Toast.makeText(this, "字体已设为小", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.font_medium) {
            tvTest.setTextSize(16);
            Toast.makeText(this, "字体已设为中", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.font_large) {
            tvTest.setTextSize(20);
            Toast.makeText(this, "字体已设为大", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.menu_normal) {
            Toast.makeText(this, "点击了普通菜单项", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.color_red) {
            tvTest.setTextColor(Color.RED);
            Toast.makeText(this, "字体已设为红色", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.color_black) {
            tvTest.setTextColor(Color.BLACK);
            Toast.makeText(this, "字体已设为黑色", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}