package com.yash.employeepayrollsystem.Data.db;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;


class Databasehandler extends SQLiteOpenHelper
{

       private static final int DATABASE_VERSION = 1;
       private static final String DATABSE_NAME = "EmployeePayrollSystem";

       public Databasehandler(Context context)
       {
           super(context , DATABSE_NAME , null ,DATABASE_VERSION);
       }

       //CREATE TABLE
    public void onCreate(SQLiteDatabase db)
    {
        String CREATE_USER_TABLE = "CREATE TABLE" + "" ;
    }



}
