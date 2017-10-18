package com.example.administrator.mosa.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 10/18/2017.
 */

public class DBIncomes extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="DB_BOSA";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_NAME="INCOMES";
    public static final String KEY_ID="Id";
    public static final String KEY_MONEY_INCOME="Money_Income";
    public static final String KEY_DATE_INCOME="Date_Income";
    public static final String KEY_ID_CATEGORY_INCOME="Id_Category_Income";
    public static final String KEY_ID_ACCOUNT="Id_Account";
    public static final String KEY_Note="Note";
    public DBIncomes(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table INCOMES"+ "(Id text primary key, Money_Income money," +
                " Date_Income date, Id_Category_Income text, Id_Account text, Note text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists"+ TABLE_NAME);
        onCreate(db);
    }
}
