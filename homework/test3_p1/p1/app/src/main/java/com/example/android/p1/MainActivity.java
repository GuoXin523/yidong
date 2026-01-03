// MainActivity.java
package com.example.android.p1;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private static final String CHANNEL_ID = "animal_channel";
    private static final int NOTIFICATION_ID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 初始化 ListView
        ListView listView = findViewById(R.id.listView);

        // 数据准备
        List<Map<String, Object>> data = new ArrayList<>();
        String[] animals = {"Lion", "Tiger", "Monkey", "Dog", "Cat", "Elephant"};
        int[] images = {R.drawable.lion, R.drawable.tiger, R.drawable.monkey,
                        R.drawable.dog, R.drawable.cat, R.drawable.elephant};

        for (int i = 0; i < animals.length; i++) {
            Map<String, Object> item = new HashMap<>();
            item.put("name", animals[i]);
            item.put("image", images[i]);
            data.add(item);
        }

        // 设置 SimpleAdapter
        SimpleAdapter adapter = new SimpleAdapter(this, data,
                R.layout.list_item,
                new String[]{"name", "image"},
                new int[]{R.id.textView, R.id.imageView});

        listView.setAdapter(adapter);

        // 设置点击事件
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, android.view.View view, int position, long id) {
                Map<String, Object> item = (Map<String, Object>) parent.getItemAtPosition(position);
                String name = (String) item.get("name");

                // 显示 Toast
                Toast.makeText(MainActivity.this, "Selected: " + name, Toast.LENGTH_SHORT).show();

                // 发送通知
                sendNotification(name);
            }
        });

        // 创建通知通道（Android 8.0+）
        createNotificationChannel();
    }

    private void createNotificationChannel() {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(
                    CHANNEL_ID,
                    "Animal Selection",
                    NotificationManager.IMPORTANCE_DEFAULT
            );
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }
    }

    private void sendNotification(String title) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.mipmap.ic_launcher) // 使用应用图标
                .setContentTitle(title)
                .setContentText("You selected " + title + " from the list.")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
        notificationManager.notify(NOTIFICATION_ID, builder.build());
    }
}
