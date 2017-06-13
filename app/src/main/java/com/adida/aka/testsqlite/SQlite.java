package com.adida.aka.testsqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Aka on 6/14/2017.
 */

public class SQlite extends SQLiteOpenHelper {
    public SQlite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    public void deleteData(String sql){
        SQLiteDatabase database = getWritableDatabase();
        database.execSQL("DELETE FROM ");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
