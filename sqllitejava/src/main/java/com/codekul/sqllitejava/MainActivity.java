package com.codekul.sqllitejava;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private DBhelper helper;
    public static final String TAG = MainActivity.class.getCanonicalName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helper = new DBhelper(this,Db.DB_NAME,null,Db.DB_VERSION);
    }

    public void insert(View view) {
        SampleInsert();
    }

    public void query(View view) {
        selectOne();
    }

    private  void selectOne(){
        SQLiteDatabase sqdb = helper.getReadableDatabase();
        String table = Db.TabMyInfo.TAB_NAME;
        String[] columns = {Db.TabMyInfo.COL_NAME};
        String selection =Db.TabMyInfo.COL_CARD_NUM + "= ? ";
        String[] selectionArgs ={((EditText)findViewById(R.id.edtNumber)).getText().toString()};
        String groupBy = null;
        String having = null;
        String orderBy = null;
        Cursor cursor= sqdb.query(table,columns,selection,selectionArgs,groupBy
                ,having,orderBy);
        if (cursor.moveToNext()){
            String name = cursor.getString(cursor.getColumnIndex(Db.TabMyInfo.COL_NAME));
            ((EditText)findViewById(R.id.edtName)).setText(name);
            Log.i(TAG,"name"+name);
        }
        sqdb.close();
    }
    public void selectAll(){
        SQLiteDatabase sqdb = helper.getReadableDatabase();
        String table = Db.TabMyInfo.TAB_NAME;
        String[] columns = null;
        String selection =null;
        String[] selectionArgs =null;
        String groupBy = null;
        String having = null;
        String orderBy = null;
        Cursor cursor= sqdb.query(table,columns,selection,selectionArgs,groupBy
                ,having,orderBy);
        while (cursor.moveToNext()){
            String name = cursor.getString(0);
            String cardNum = cursor.getString(cursor.getColumnIndex(Db.TabMyInfo.COL_NAME));
            Log.i(TAG,"name"+name+ "Card NUmber"+cardNum);
        }
        sqdb.close();
    }

    public void delete(View view) {
        String table = Db.TabMyInfo.TAB_NAME;
        String whereClause = Db.TabMyInfo.COL_CARD_NUM + " = ?";
        String[] whereArgs ={((EditText)findViewById(R.id.edtNumber)).getText().toString()};
        SQLiteDatabase sqDb = helper.getWritableDatabase();
        sqDb.delete(table,whereClause,whereArgs );
        sqDb.close();
    }

    public void update(View view) {
        String table = Db.TabMyInfo.TAB_NAME;
        ContentValues values = new ContentValues();
        values.put(Db.TabMyInfo.COL_NAME,((EditText)findViewById(R.id.edtName)).getText().toString());
       String whereClause = Db.TabMyInfo.COL_CARD_NUM + " = ?";
       String[] whereArgs = {((EditText)findViewById(R.id.edtNumber)).getText().toString()};

       SQLiteDatabase sqDb = helper.getWritableDatabase();
       int affected = sqDb.update(table,values,whereClause,whereArgs);
       sqDb.close();

    }

    private void SampleInsert(){
        SQLiteDatabase sqdb = helper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Db.TabMyInfo.COL_NAME,((EditText)findViewById(R.id.edtName)).getText().toString());
        values.put(Db.TabMyInfo.COL_CARD_NUM,((EditText)findViewById(R.id.edtNumber)).getText().toString());
        long rowID= sqdb.insert(Db.TabMyInfo.TAB_NAME,null, values);
        Log.i(TAG,"RowID = "+rowID);
        sqdb.close();
    }

    private void rawInsert(){
        SQLiteDatabase sqDb = helper.getWritableDatabase();
        sqDb.execSQL("insert into "+Db.TabMyInfo.TAB_NAME + " values ('Apple','11')");
        sqDb.close();
    }



}
