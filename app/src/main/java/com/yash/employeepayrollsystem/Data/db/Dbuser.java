package com.yash.employeepayrollsystem.Data.db;

import android.content.Context;

import java.sql.Statement;

class Dbuser {

     static final String Table_user = "tbluser";
     static final String Emp_id ="_id";
     static final String Name = "empname";
     static final String Vehicle = "vehicle";
     static final String Emp_type ="FULL TIME , Intern , Part-time";
     private Databasehandler databasehandler;

     private final Context context ;

     public Dbuser(Context context)
     {
         this.context = context;
     }

     //new user

    public long insertUser( User user)
    {
        databasehandler = new Databasehandler(context);
        SQLiteDatabase db = databaseHandler.getWritableDatabase();

        ContentValues values = getContentValuesObject(user);
    }


}
