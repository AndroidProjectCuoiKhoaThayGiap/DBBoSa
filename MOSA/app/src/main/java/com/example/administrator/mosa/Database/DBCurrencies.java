package com.example.administrator.mosa.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.security.PublicKey;

/**
 * Created by Administrator on 10/17/2017.
 */
//tien te
public class DBCurrencies extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="DB_BOSA";
    public static final int DATABASE_VERSION = 1;
    public  static final String TABLE_NAME= "CURRENCIES";

    public static final String KEY_ID="Id";
    public static final String KEY_NAME="Name";
    public static final String KEY_SYMBOL="Symbol";
    public static final String KEY_IMAGE="Image";
    public DBCurrencies(Context context) {
        super(context,DATABASE_NAME,null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table CURRENCIES"+ "(Id text primary key, Name text, Symbol text, Image blog)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists"+ TABLE_NAME);
        onCreate(db);
    }
}
