package com.example.testalarm;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;


class Imagehelper extends SQLiteOpenHelper {
    // Table Name
    private static final String TABLE_CONTACT = "imgedata";

    public Imagehelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public void queryData(String sql){
        SQLiteDatabase database = getWritableDatabase();
        database.execSQL(sql);
    }

    public void insertData(String name, byte[] image){
        SQLiteDatabase database = getWritableDatabase();
        String sql = "INSERT INTO imgdata VALUES (NULL, ?, ?)";

        SQLiteStatement statement = database.compileStatement(sql);
        statement.clearBindings();

        statement.bindString(1, name);
        statement.bindBlob(2, image);

        statement.executeInsert();
    }

    public void updateData(String name, byte[] image, int id) {
        SQLiteDatabase database = getWritableDatabase();

        String sql = "UPDATE imgdata SET name = ?,image = ? WHERE id = ?";
        SQLiteStatement statement = database.compileStatement(sql);

        statement.bindString(1, name);

        statement.bindBlob(2, image);
        statement.bindDouble(3, (double)id);

        statement.execute();
        database.close();
    }

    public  void deleteData(int id) {
        SQLiteDatabase database = getWritableDatabase();

        String sql = "DELETE FROM imgdata WHERE id = ?";
        SQLiteStatement statement = database.compileStatement(sql);
        statement.clearBindings();
        statement.bindDouble(1, (double)id);

        statement.execute();
        database.close();
    }

    public Cursor getData(String sql){
        SQLiteDatabase database = getReadableDatabase();
        return database.rawQuery(sql, null);
    }


    // Select All Data
    public String[][] SelectAllData() {
        // TODO Auto-generated method stub

        try {
            String arrData[][] = null;
            SQLiteDatabase db;
            db = this.getReadableDatabase(); // Read Data

            String strSQL = "SELECT  * FROM  imgdata" ;
            Cursor cursor = db.rawQuery(strSQL, null);
            if(cursor != null)
            {
                if (cursor.moveToFirst()) {


                    arrData = new String[cursor.getCount()][cursor.getColumnCount()];

                         Log.v("cur",  String.valueOf(arrData.length));


                    /***
                     *  [x][0] = ContactID
                     *  [x][1] = Name
                     *  [x][2] = Email
                     *  [x][3] = Photo
                     */
                    int i= 0;
                    do {
                        //Log.v("arrw",  cursor.getString(1));

                        String s = new String(cursor.getBlob(2));
                        //Log.v("arrc", s );
                       arrData[i][0] = cursor.getString(1);
                      arrData[i][1] = s;
                        i++;
                        //Log.v("iiii",  String.valueOf(i));


                    } while (cursor.moveToNext());

                }

            }
            cursor.close();

            return arrData;

        } catch (Exception e) {
            return null;
        }

    }

    // Select All Data
    public Bitmap[] SelectAllimg() {
        // TODO Auto-generated method stub

        try {
            Bitmap arrDataimg[] = null;
            SQLiteDatabase db;
            db = this.getReadableDatabase(); // Read Data

            String strSQL = "SELECT  * FROM  imgdata" ;
            Cursor cursor = db.rawQuery(strSQL, null);
            if(cursor != null)
            {
                if (cursor.moveToFirst()) {


                    arrDataimg = new Bitmap[cursor.getCount()];

                    Log.v("cur",  String.valueOf(arrDataimg.length));


                    /***
                     *  [x][0] = ContactID
                     *  [x][1] = Name
                     *  [x][2] = Email
                     *  [x][3] = Photo
                     */
                    int i= 0;
                    do {
                        //Log.v("arrw",  cursor.getString(1));
                        //String s = new String(cursor.getBlob(2));

                        byte[] blo= cursor.getBlob(2);
                        arrDataimg[i] = BitmapFactory.decodeByteArray(blo,0,blo.length);
                        i++;
                        //Log.v("iiii",  String.valueOf(i));


                    } while (cursor.moveToNext());

                }

            }
            cursor.close();

            return arrDataimg;

        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}