package userdatabase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import userdatabase.tables.userTables;

public class myDatabaseHelper extend SQLiteOpenHelper {

    public static final int DB_VERSION = 1;
    public static final String DB_NAME = "user.db";

    public MyDatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public onCreate(SQLiteDatabase db){
        db.execSQL(userTables.CMD_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
