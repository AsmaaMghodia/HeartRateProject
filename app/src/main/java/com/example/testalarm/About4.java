package com.example.testalarm;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class About4 extends AppCompatActivity {
    String array [] = {"ماذا تفعل إذا رأيت شخصًا مصابًا بنوبة قلبية؟\n" +
            "إذا قابلت شخصًا فاقدًا الوعي وتعتقد أنه أُصيب بنوبة قلبية، فلتقم أولًا بطلب المساعدة الطبية الطارئة. ثم افحصه لترى إذا كان يتنفس ولديه نبض. إذا لم يكن هناك تنفس أو نبض، عندها فقط ابدأ بإجراء الإنعاش القلبي الرئوي للحفاظ على تدفق الدم.\n" +
            "اضغط بقوة وبسرعة على صدر الشخص بضربات منتظمة وسريعة نسبيًّا حوالي 100 إلى 120 ضغطة في الدقيقة..\n" +
            "يُوصي الأطباء بالضغط على الصدر فقط إذا لم تتلقَ تدريبًا على الإنعاش القلبي الرئوي. وإذا تلقيت تدريبًا على الإنعاش القلبي الرئوي، يمكنك فتح مجرى الهواء وتزويده بأنفاس الإنقاذ.\n" +
            "\n" +
            "\n",


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about4);

        ListView tiplist = (ListView)findViewById(R.id.list4);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview_tips,
                R.id.textView, array);


        tiplist.setAdapter(arrayAdapter);
    }
}
