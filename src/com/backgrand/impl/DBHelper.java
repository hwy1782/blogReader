package com.backgrand.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 *@author hwy1782@gmail.com
 *@date 2013-1-18ÏÂÎç3:14:51
 **/
public class DBHelper extends SQLiteOpenHelper{
	
	private static String DB_NAME = "reader";
	private static int DB_VERSION = 1;
	
	private static String TABLE_NAME = "article";
	private static String A_ID = "id";
	private static String A_TITLE = "title";
	private static String A_PUB_TIME = "publist_time";
	private static String A_COMMONT_NUM = "commont_num";
	private static String A_READ_NUM = "read_num";
	private static String A_SUMMARY = "summary";
	private static String A_DETAIL_RUL = "detail_rul";
	private static String A_GMT_CREATE = "gmt_create";
	private static String A_SQUENCE = "squence";
	

	public DBHelper(Context context) {
		super(context, DB_NAME, null, DB_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		String sql = "create table "+TABLE_NAME+" ( "+ A_ID +" int primary key, "
						+A_TITLE+" text,"+A_PUB_TIME+" text,"
						+A_COMMONT_NUM+" text,"+A_READ_NUM+" text,"
						+A_SUMMARY+" text,"+A_DETAIL_RUL+" text,"
						+A_SQUENCE+" int,"
						+A_GMT_CREATE+" text )";
		
		db.execSQL(sql);
		
		Log.d("DBHelper", "onCreate=>"+sql);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
