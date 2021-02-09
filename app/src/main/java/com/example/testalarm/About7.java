package com.example.testalarm;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class About7 extends AppCompatActivity {

    String array[]={"المضاعفات\n" +
            "غالبًا ما ترتبط المضاعفات بالأضرار التي لحقت بقلبك أثناء النوبة القلبية، مما قد يؤدي إلى:\n",
    "نبض قلبي غير طبيعي (اضْطِراب النَّظْم) \n" +
            "(Arrhythmia)\n" +
            " يمكن أن تتطور \"دوائر كهربائية قصيرة\"، مما ينتج عنه نظم غير طبيعي للقلب، بعضها قد يكون خطيرًا أو قاتلًا.\n",
            "الفشل القلبي\n" +
                    " (Heart failure) \n" +
                    " قد تتسبب النوبة القلبية في تلف الكثير من أنسجة القلب بحيث لا تتمكن عضلة القلب المتبقية من ضخ ما يكفي من الدم خارج القلب. قد يكون فَشَلُ القَلْب مؤقتًا، أو يمكن أن يكون حالة مزمنة ناجمة عن ضرر كبير ودائم لقلبك.\n",
            "توقُّف القلب المفاجئ\n" +
                    " (Sudden cardiac arrest) \n" +
                    "دون سابق إنذار، قد يتوقف القلب بسبب الاضطراب الكهربائي الذي يسبب عدم انتظام ضربات القلب. تزيد النوبات القلبية من خطر توقف القلب المفاجئ، الذي يمكن أن يكون قاتلًا دون علاج فوري.\n"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about7);

        ListView tiplist = (ListView)findViewById(R.id.list7);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview_tips,
                R.id.textView, array);


        tiplist.setAdapter(arrayAdapter);
    }
}
