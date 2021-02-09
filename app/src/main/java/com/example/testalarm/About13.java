package com.example.testalarm;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class About13 extends AppCompatActivity {
    String array[] = {
      "الاستعداد لموعدك\n" +
              "تُشخص النوبة القلبية عادةً كحالة طارئة. ومع ذلك، إذا كنت قلقاً بشأن خطر الإصابة بنوبة قلبية، فراجع طبيبك للتحقق من عوامل الخطر والتحدث عن الوقاية منها. إذا كانت مخاطر الإصابة عالية، فقد تُحال إلى اختصاصي القلب.\n" +
              "يَرِد فيما يلي بعض المعلومات للمساعدة في الاستعداد للموعد الطبي المحدد لَك.\n"
      ,"ما يمكنك فعله؟\n" +
            "عند حجز موعد طبي، اسأل إذا ما كان هناك أيُّ شيءٍ ينبغي عليك فعله مقدَّمًا مثل تقييد نظامك الغذائي. فقد تحتاج، على سبيل المثال، إلى الصوم قبل إجراء اختبار الكوليسترول.\n"
            ,"جهِّزْ قائمة بما يلي:\n" +
            "•\t*  أعراضك، بما فيها أي أعراض تَبدو غير متعلقة بمرض الشريان التاجي، والوقت الذي بدأت فيه\n" +
            "•\t* المعلومات الشخصية الرئيسية، بما فيها التاريخ العائلي بالإصابة بمرض القلب، أو السكتة، أو ارتفاع ضغط الدم، أو السكري والضغوط الرئيسية الحديثة أو التغييرات الحياتية الحديثة\n" +
            "•\t* جميع الأدوية، والفيتامينات والمكملات الغذائية الأخرى التي تتناولها مع تحديد الجرعات\n" +
            "•\t* الأسئلة التي قد يكون مطلوبًا طرحها على طبيبك\n"
            ,"تَتضمن بعض الأسئلة التي يُمكنك طرحها على طبيبك فيما يخص منع حدوث النوبة القلبية ما يلي:\n" +
            "•\tما الاختبارات التي أحتاج إلى إجرائها لتحديد صحتي القلبية الحالية؟\n" +
            "•\tما الأغذية التي ينبغي عليَّ تناوُلها أو تجنُّبها؟\n" +
            "•\tما مستوى النشاط البدني الملائم؟\n" +
            "•\tكم عدد المرات التي يَنبغي أن أُفحص فيها للتحقق من مرض القلب؟\n" +
            "•\tأنا لديَّ حالاتٌ صحيَّةٌ أخرى. كيف يُمكِنُني التعامل بأفضل طريقة مُمكِنة مع هذه الحالات معًا؟\n" +
            "•\tهل هناك أي منشورات أو مطبوعات أخرى يمكنني أخذها؟ ما المواقع الإلكترونية التي تَنصحُني بها؟\n" +
            "لا تتردد في طرح أي أسئلة إضافية أخرى أيضًا.\n"
            ,"ما يمكن أن يقوم به الطبيب\n" +
            "من المرجَّح أن يطرح عليك طبيبك عددًا من الأسئلة، تتضمَّن ما يلي:\n" +
            "•\tإلى أي مدًى تفاقمت الأعراض؟\n" +
            "•\tهل هي أعراض ثابتة أم أنها تأتي وتذهب؟\n" +
            "•\tما الذي يُحسِّن من أعراضكَ، إن وُجد؟ إذا كنتَ تشعر بألم في الصدر، هل يتحسن مع الراحة؟\n" +
            "•\tهل هناك أمور، إن وجدت، تجعل الأعراض لديك أكثر سوءًا؟ إذا كنت تشعر بألم في الصدر، هل النشاط الشديد يجعله أسوأ؟\n" +
            "•\tهل شُخِّصت بارتفاع ضغط الدم، أو داء السكري، أو ارتفاع الكوليستيرول؟\n",
            "ما الذي يُمكنُك القِيام به في هذه الأثناء؟\n" +
                    "ليس مبكرًا أبدًا إجراء تغييرات صحية على نمط الحياة، مثل الإقلاع عن التدخين، وتناول الأطعمة الصحية، وممارسة المزيد من النشاط البدني. هذه خطوط رئيسة للوقاية من النوبة القلبية.\n",


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about13);

        ListView tiplist = (ListView)findViewById(R.id.list13);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview_tips,
                R.id.textView, array);


        tiplist.setAdapter(arrayAdapter);
    }
}
