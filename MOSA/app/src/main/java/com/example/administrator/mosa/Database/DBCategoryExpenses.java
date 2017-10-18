package com.example.administrator.mosa.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 10/18/2017.
 */
// hang muc chi
public class DBCategoryExpenses extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="DB_BOSA";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_NAME="CATEGORY_EXPENSES";
    public static final String KEY_ID="Id";
    public static final String KEY_NAME="Name";
    public static final String KEY_SUB_CATEGORY="Sub_Category";
    public static final String KEY_IMAGE="Image";
    public static final String KEY_NOTE="Note";

    public DBCategoryExpenses(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table CATEGORY_EXPENSES"+
                ("Id text primary key, Name text, Sub_Category text, Image blog, Note text"));
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists "+TABLE_NAME);
        onCreate(db);
    }
}
