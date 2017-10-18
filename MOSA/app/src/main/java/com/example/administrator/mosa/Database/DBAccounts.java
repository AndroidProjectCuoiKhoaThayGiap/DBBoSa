package com.example.administrator.mosa.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Mai Huong on 10/14/2017.
 */
//tai khoan
public class DBAccounts extends SQLiteOpenHelper{
    public static final String DATABASE_NAME="DB_BOSA";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_NAME="ACCOUNTS";

    public static final String KEY_ID="Id";
    public static final String KEY_NAME="Name";
    public static final String KEY_MONEY_ACCOUNT ="Money_Account";
    public static final String KEY_ID_TYPE_ACCOUNT ="Id_Type_Account";
    public static final String KEY_ID_CURRENCY ="Id_Currency";
    public static final String KEY_NOTE="Note";

    public DBAccounts(Context context) {
        super(context, DATABASE_NAME, null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table ACCOUNTS"+
                "(Id text primary key, Name text, Money_Account money, Id_Type_Account text, Id_Currency text, Note text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists "+ TABLE_NAME);
        onCreate(db);
    }


}
