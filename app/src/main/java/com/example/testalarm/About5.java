package com.example.testalarm;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class About5 extends AppCompatActivity {
    String array [] ={"/t الأسباب",

    "وتحدث النوبة القلبية عندما يُسد واحد أو أكثر من الشرايين التاجية. وبمرور الوقت، يُمكن أن يَضيق الشريان التاجي بسبب تراكم المواد المختلفة، بما في ذلك الكوليسترول تصلب الشرايين (Arthrosclerosis).\n" +
            " وتُسبب هذه الحالة المعروفة باسم مرض الشريان التاجي (coronary artery disease ) معظم النوبات القلبية.\n" +
            "وخلال النوبة القلبية، يُمكن لإحدى هذه اللويحات أن تُمزق وتُرسب الكوليسترول والمواد الأخرى في مجرى الدم. وتُشكل جلطة دموية في موقع التمزق. وإذا كانت الجلطة كبيرة بما فيه الكفاية، فإنها يُمكن أن تَمنع تدفق الدم عبر الشريان التاجي، مما يُؤدي إلى افتقار عضلة القلب من الأكسجين والمواد الغذائية نقص التروية (Ischemia).\n" +
            "سبب آخر للنوبة القلبية هو تشنج الشريان التاجي الذي يَعمل على إيقاف تدفق الدم إلى جزء من عضلة القلب. ويُمكن أن يُسبب استخدام التبغ والمخدرات غير المشروعة مثل الكوكايين تشنجًا يُهدد الحياة.\n",


    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about5);

        ListView tiplist = (ListView)findViewById(R.id.list5);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview_tips,
                R.id.textView, array);


        tiplist.setAdapter(arrayAdapter);
    }
}
