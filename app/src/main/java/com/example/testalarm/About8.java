package com.example.testalarm;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class About8 extends AppCompatActivity {
String array []= {"الوقاية\n" +
        "لم يفُت الأوان بعد لاتخاذ احتياطاتك للوقاية من النوبة القلبية — حتى لو كنت أصِبتَ بواحدة بالفعل. هاك بعض الطرق التي ستساعدك على تجنب الإصابة بنوبة قلبية.\n",

"•\tالأدوية\n" +
        " يقلل الانتظام على تناول الأدوية من احتمالية إصابتك بنوبة قلبية ويزيد من كفاءة قلبك المتعب. خذ الأدوية التي يصفها لك الطبيب بانتظام، واسأله عن الفترات المعقولة بين الفحوصات.\n",
        "•\tعوامل تابعة لنظام الحياة\n" +
                " حافظ على وزنك المثالي ونظام غذائي مفيد لقلبك، امتنع عن التدخين، مارس الرياضة بانتظام، سيطِرْ على مسبِّبات القلق أو أي عوامل أخرى قد تسبب نوبة قلبية، كارتفاع ضغط الدم، أو نسبة الكوليستيرول، أو داء السُّكَّري.\n",

};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about8);
        ListView tiplist = (ListView)findViewById(R.id.list8);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview_tips,
                R.id.textView, array);


        tiplist.setAdapter(arrayAdapter);
    }
}
