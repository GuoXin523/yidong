package com.example.android.p4;

import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private CustomAdapter adapter;
    private List<String> items = new ArrayList<>();
    private ActionMode actionMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 初始化数据
        items.add("One");
        items.add("Two");
        items.add("Three");
        items.add("Four");
        items.add("Five");

        listView = findViewById(R.id.listView);
        adapter = new CustomAdapter(this, items);
        listView.setAdapter(adapter);

        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE_MODAL);
        listView.setMultiChoiceModeListener(new ListView.MultiChoiceModeListener() {
            @Override
            public void onItemCheckedStateChanged(ActionMode mode, int position, long id, boolean checked) {
                int selectedCount = listView.getCheckedItemCount();
                if (selectedCount == 0) {
                    mode.finish();
                } else {
                    mode.setTitle(selectedCount + " selected");
                }
            }

            @Override
            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                getMenuInflater().inflate(R.menu.context_menu, menu);
                actionMode = mode;
                return true;
            }

            @Override
            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                return false;
            }

            @Override
            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                // 把switch替换为if-else（解决Constant expression required报错）
                if (item.getItemId() == R.id.delete) {
                    // 先收集所有要删除的索引（避免遍历中列表长度变化）
                    List<Integer> deleteIndices = new ArrayList<>();
                    for (int i = listView.getCount() - 1; i >= 0; i--) {
                        if (listView.isItemChecked(i)) {
                            deleteIndices.add(i);
                        }
                    }
                    // 批量删除
                    for (int index : deleteIndices) {
                        items.remove(index);
                    }
                    // 只调用一次notifyDataSetChanged（避免重复刷新）
                    adapter.notifyDataSetChanged();
                    mode.finish();
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public void onDestroyActionMode(ActionMode mode) {
                actionMode = null;
            }
        });
    }

    // 自定义适配器
    private class CustomAdapter extends android.widget.BaseAdapter {
        private List<String> data;
        private android.content.Context context;

        public CustomAdapter(android.content.Context context, List<String> data) {
            this.context = context;
            this.data = data;
        }

        @Override
        public int getCount() {
            return data.size();
        }

        @Override
        public Object getItem(int position) {
            return data.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
            if (convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_item, parent, false);
            }

            TextView textView = convertView.findViewById(R.id.text);
            CheckBox checkBox = convertView.findViewById(R.id.checkBox);

            textView.setText(data.get(position));
            checkBox.setChecked(listView.isItemChecked(position));

            return convertView;
        }
    }
}