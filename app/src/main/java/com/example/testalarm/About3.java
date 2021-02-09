package com.example.testalarm;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class About3 extends AppCompatActivity {
    String array []= {"متي تزور الطبيب؟\n" +
            "اتخذ الإجراءات اللازمة على الفور. ينتظر بعض الأشخاص لفترة طويلة للغاية لعدم إدراكهم للعلامات والأعراض المهمة. اتبِعْ هذه الخطوات:\n",
    "•\tاطلب المساعدة الطبية الطارئة. فلا تتردَّد إذا كنتَ تشتبه في إصابتكَ بنوبة قلبية. اتصِلْ برقم الطوارئ المحلِّي على الفور. في حال عدم تمكنكَ من الوصول إلى الخِدْمات الطبية الطارئة، اطلبْ من شخص ما نَقْلكَ إلى أقرب مستشفى.\n" +
            "لا يمكنكَ أن تقود بنفسكَ إلا إذا لم يتوفَّر لكَ خيارات أخرى. ونظرًا لأن حالتكَ قد تسوءَ،ُ فقد تعرِّضُك القيادة بنفسكَ وتعرِّض الآخرين للخطر.\n",
            "•\tتَنَاوَلْ نيتروغليسرين، إذا وصفه لك الطبيب. تَنَاوَلْهُ وَفْقًا للتعليمات أثناء انتظارك وصول المساعدة الطارئة.",
            "•\tتَناوَل الأسبرين، في حالة التوصية به. قد يُقَلِّل تناول الأسبرين أثناء النوبة القلبية تَلَفَ القلب، حيث يُساعِد في منع تجلُّط دمكَ.\n" +
                    "ومع ذلك، قد يتفاعل الأسبرين مع أدوية أخرى، وبذلك لا تتناوَلِ الأسبرين إلا إذا كان يوصي به طبيبكَ أو مساعد طاقم الطوارئ الطبي للتأكُّد مما إذا كان يمكن تَناوُل الأسبرين. اتصل أولًا لطلب المساعدة الطارئة.\n",


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about3);

        ListView tiplist = (ListView)findViewById(R.id.list3);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview_tips,
                R.id.textView, array);


        tiplist.setAdapter(arrayAdapter);
    }
}
