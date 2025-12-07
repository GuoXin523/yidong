package com.example.android.notepad;

import android.net.Uri;
import android.provider.BaseColumns;

public final class Categories implements BaseColumns {
    public static final String TABLE_NAME = "categories";
    public static final Uri CONTENT_URI = Uri.parse("content://" + NotePad.AUTHORITY + "/categories");
    public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.google.category";
    public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.google.category";
    public static final String COLUMN_NAME_NAME = "name";

    // 默认排序
    public static final String DEFAULT_SORT_ORDER = "name ASC";
}
