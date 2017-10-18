package com.example.administrator.mosa.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 10/17/2017.
 */
//so tiet kiem
public class DBPassBooks extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="DB_BOSA";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_NAME="PASS_BOOKS";
    public static final String KEY_ID="Id";
    public static final String KEY_NAME="Name";
    public static final String KEY_MONEY_PASSBOK="Money_Passbook";
    public static final String KEY_NAME_BANK="Name_Bank";
    public static final String KEY_DATE_START="Date_Start";
    public static final String KEY_TERM="Term";
    public static final String KEY_INTEREST_RATE="Interest_Rate";
    public static final String KEY_CALL_RATE ="Call_Rate";
    public static final String KEY_INTEREST_RECEVAIBLE="Interest_Recevaible";
    public static final String KEY_NOTE="Note";
    public static final String KEY_ID_CURRENCY="Id_Currency";
    public static final String KEY_ID_ACCOUNT="Id_Account";

    public DBPassBooks(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table PASS_BOOKS"+
                "(Id text primary key, Name text, Money_Passbook money, Name_Bank text," +
                " Date_Start date, Term text, Interest_Rate text, Call_Rate text, " +
                "Interest_Recevaible money, Note text, Id_Currency text, Id_Account text )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists"+ TABLE_NAME);
        onCreate(db);
    }
}
