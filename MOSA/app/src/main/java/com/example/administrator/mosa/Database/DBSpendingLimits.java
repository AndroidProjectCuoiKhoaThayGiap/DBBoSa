package com.example.administrator.mosa.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 10/18/2017.
 */

public class DBSpendingLimits extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="DB_BOSA";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_NAME="SPENDING_LIMITS";
    public static final String KEY_ID="Id";
    public static final String KEY_NAME="Name";
    public static final String KEY_MONEY_SPENDING_LIMIT="Money_Spending_Limit";
    public static final String KEY_PERIOD="Period";
    public static final String KEY_DATE_START="Date_Start";
    public static final String KEY_DATE_FINISH="Date_Finish";
    public static final String KEY_ID_CATEGORY_EXPENSE="Id_Category_Expense";
    public static final String KEY_ID_ACCOUNT="Id_Account";
    public DBSpendingLimits(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table SPENDING_LIMITS"+"(Id text primary key, Name text, Money_Spending_Limit money, Period text," +
                "Date_Start date, Date_Finish date, Id_Category_Expense text, Id_Account text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists "+ TABLE_NAME);
        onCreate(db);
    }
    //them moi mot Spending Limits
}
