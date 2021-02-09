package com.example.testalarm;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ImageList extends AppCompatActivity {

    String arrData[][];
    Intent redata;
    Bitmap im;
   static Bitmap [] bitimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_list);
       // Intent intent =getIntent();
//           im=(Bitmap) intent.getExtras().get("data");
           CameraActivity cam= new CameraActivity();


        final Imagehelper myDb = new Imagehelper(this,"imgdata.sqlite",null,1);



        // listView1
        final ListView lView1 = (ListView)findViewById(R.id.listView1);

        String[][] arrData = myDb.SelectAllData();
        bitimg =myDb.SelectAllimg();
        lView1.setAdapter(new ImageAdapter(this,arrData));

/*
        // OnClick
        lView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {




                Toast.makeText(getApplicationContext(),
                        "Your selected : ", + bitimg[position], Toast.LENGTH_SHORT).show();

            }
        });*/

    }



    public static class ImageAdapter extends BaseAdapter
    {
        private Context context;
        private String[][] lis;

        public ImageAdapter(ImageList c, String[][] li)
        {
            // TODO Auto-generated method stub
            context = c;
            lis = li;
        }

        public int getCount() {
            // TODO Auto-generated method stub
            return lis.length;
        }

        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub


            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            if (convertView == null) {
                convertView = inflater.inflate(R.layout.imge_items, null);
            }
            Bitmap theImage = bitimg[position];

            ImageView imgPhoto = (ImageView) convertView.findViewById(R.id.ColPhoto);
            TextView text = (TextView) convertView.findViewById(R.id.ColName);
            text.setText(lis[position][0]);
            imgPhoto.setImageBitmap(theImage);




return convertView;

        }

 }




}
