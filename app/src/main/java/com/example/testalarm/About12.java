package com.example.testalarm;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class About12 extends AppCompatActivity {

    String array []={"التأقلم والدعم\n" +
            "إن الإصابة بنوبة قلبية يُعد أمرًا مخيفًا، وقد تتساءل كيف سيؤثر ذلك على حياتك وما إذا كنت ستتعرض إلى نوبة أخرى.\n" +
            "والشعور بالخوف والغضب والذنب والاكتئاب جميعها أمور شائعة بعد التعرض لنوبة قلبية. قد يساعدك مناقشتها مع طبيبك أو أحد أفراد العائلة أو صديق. أو فكر في التحدث إلى مقدم خدمات الصحة العقلية أو الانضمام إلى إحدى مجموعات الدعم.\n" +
            "من المهم أن تذكر علامات أو أعراض الاكتئاب لطبيبك. يمكن أن تكون برامج إعادة تأهيل القلب فعالة في الوقاية من الاكتئاب أو علاجه بعد التعرض لنوبة قلبية.\n",
    "\n" +
            "ممارسة الجنس بعد التعرُّض لأزمة قلبية\n" +
            "يقلق بعض الأشخاص حيال ممارسة الجنس بعد التعرُّض إلى أزمة قلبية، ولكن يمكن أن يعود معظم الأشخاص إلى مزاولة النشاط الجنسي بأمان عقب التعافي من الأزمة. وسيتوقَّف وقت استئنافكَ النشاط الجنسي على راحتك البدنية، واستعدادك النفسي، ونشاطك الجنسي السابق. اسألْ طبيبكَ عن الوقت الآمن لاستئناف النشاط الجنسي.\n" +
            "قد تُؤَثِّر بعض أدوية القلب في الوظيفة الجنسية. فإذا واجهتكَ مشاكل العجز الجنسي، فتحدَّثْ إلى طبيبكَ.\n",


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about12);

        ListView tiplist = (ListView)findViewById(R.id.list12);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview_tips,
                R.id.textView, array);


        tiplist.setAdapter(arrayAdapter);
    }
}
