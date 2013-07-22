package com.ambrosious.lifeball;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;


public class TaskHelper extends SQLiteOpenHelper
{
	public TaskHelper(Context context, String dbName,
	SQLiteDatabase.CursorFactory factory, int version)
	{
		super(context, dbName, factory, version);
	}
	@Override
	public void onCreate(SQLiteDatabase db)
	{
		String createString = 
		"CREATE TABLE IF NOT EXISTS taskTable " 
		+ " ( _id INTEGER PRIMARY KEY AUTOINCREMENT, "
		+ "task TEXT NOT NULL, "
		+ "completed TEXT NOT NULL);";
		db.execSQL(createString);
	}
	@Override
	public void onUpgrade(SQLiteDatabase db, int oV, int nV)
	{
		String dropString = "DROP TABLE IF EXISTS taskTable;";
		db.execSQL(dropString);
		onCreate(db);
	}

}
