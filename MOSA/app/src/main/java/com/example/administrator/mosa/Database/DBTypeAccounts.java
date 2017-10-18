package com.example.administrator.mosa.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 10/16/2017.
 */
//loai tai khoan
public class DBTypeAccounts extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="DB_BOSA";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_NAME="TYPE_ACCOUNTS";

    public static final String KEY_ID="Id";
    public static final String KEY_NAME="Name";
    public static final String KEY_IMAGE="Image";
    public static final String KEY_NOTE="Note";
    public DBTypeAccounts(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table TYPE_ACCOUNTS" + "(Id text primary key, Name text, Image blog, Note text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists" + TABLE_NAME);
        onCreate(db);
    }
    //Them moi mot Type Account
    public void addTypeAccount(){
        //mo ket noi de viet du lieu
        SQLiteDatabase db=this.getWritableDatabase();

        ContentValues values= new ContentValues();
       // values.put(KEY_ID,);
    }
}
