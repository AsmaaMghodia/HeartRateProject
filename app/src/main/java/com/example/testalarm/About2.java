package com.example.testalarm;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class About2 extends AppCompatActivity {
String array[] = {"\t\tتتنوع أعراض النوبة القلبية",
"لا يعاني جميع الأشخاص المصابين بالنوبات القلبية من الأعراض ذاتها أو حِدَّةِ الأعراض نفسِها. يعاني بعض الأشخاص ألمًا خفيفًا، بينما يعاني البعض الآخر ألمًا أكثر حِدَّةً. بعض الأشخاص لا تظهر عليهم أعراض، بينما قد تكون العلامة الأولى للبعض الآخر الإصابة بالسكتة القلبية (cardiac arrest). ومع ذلك، كلما زادت معاناتك من الأعراض والعلامات، زاد احتمال إصابتك بنوبة قلبية.\n" +
        "تحدث بعض النوبات القلبية فجأة، ولكن يعاني العديد من الأشخاص أعراض وعلامات تحذيرية قبل النوبة القلبية بساعات أو أيام أو أسابيع. وقد يتمثَّل التحذير الأوَّل في تكرار ألم أو ضغط الصدر (angina) ويحدث بسبب بَذلِ المجهود، ويمكن تخفيفه عن طريق الراحة. وتنجُم الذبحة عن الانخفاض المؤقَّت في تدفُّق الدم إلى القلب.\n",
        "\n" +
                "الأعراض المعتادة لنوبات القلب:- \n",
        "    ضيق أو شعور بالألم في منطقة الصدر\n" +
                " يمكن أن يعطي هذا الانزعاج أو الألم شعورًا بالوجع المحكم أو الضغط أو الامتلاء أو العصر في صدرك يستمر لأكثر من دقائق قليلة. قد يأتي هذا الشعور المزعج ويذهب.\n",
"الألم في الجزء العلوي من الجسم\n" +
        " قد ينتشر الألم أو الشعور المزعج إلى صدرك وصولاً إلى كتفيك أو ذراعيك أو ظهرك أو رقبتك أو أسنانك أو فكك. قد تتعرض لألم في أعلى جسمك بدون إحساس مزعج في الصدر.\n",
        "    ألم المعدة\n" +
                " قد يمتد الألم لأسفل إلى منطقة البطن وقد يعطي شعورًا يشبه الحرقان في القلب\n",
        "ضيق التنفس\n" +
                " قد تلهث لتتنفس أو تحاول أن تأخذ أنفاسًا عميقة. غالبًا ما يحدث هذا قبل أن ينشأ لديك شعور بعدم الراحة أو قد لا تتعرض لأي شعور بعدم الراحة في الصدر\n",
        "القلق\n" +
                " قد تشعر بإحساس بالكآبة أو تشعر كما لو أنك تمر بنوبة ذعر بدون سبب واضح\n",

        "    الدوار\n" +
                " بالإضافة إلى الضغط في الصدر، قد تشعر بالدوار أو تشعر كما لو أنك قد تموت\n",
        "  التعرق\n" +
                " قد يظهر لديك العرق فجأة مع برودة وشكل صدفي للبشرة\n",

        "    الغثيان والقيء\n" +
                " قد تشعر بألم في معدتك أو تتقيأ\n",
        "خفقان القلب\n" +
                " قد تشعر كما لو أن ضربات قلبك تتسارع أو قد يكون مدركًا تمامًا أن لنبض قلبك\n",
        "- قد يعاني النساء من جميع أعراض الأزمة القلبية النمطية أو بعضها أو العديد منها أو لا يعانين من أي منها. على الرغم من أن بعض أنواع الألم أو الضغط أو الانزعاج في الصدر ما زالت أعراضًا شائعة للأزمة القلبية لدى النساء، إلا أن العديد من النساء يعانين من أعراض الأزمة القلبية دون الشعور بألم في الصدر، مثل:\n" +
                "    ألم في العنق أو الظهر أو الكتفين أو الفك\n" +
                "    ضيق التنفس\n" +
                "    ألم في البطن أو \"حرقة في فم المعدة\"\n" +
                "    تورم في أحد الذراعين أو كليهما\n" +
                "    الغثيان أو القيء\n" +
                "    دوار أو إغماء\n" +
                "    تعب غير عادي أو غير مبرر، ربما لعدة أيام\n",
          "قد يكون لدى كبار السن والأشخاص المصابين بداء السكري أعراض خفيفة جدًا ناتجة عن نوبة قلبية أو قد لا تظهر أعراض إطلاقًا، لذلك من المهم بشكل خاص عدم التغاضي عن الأعراض الناتجة عن النوبة القلبية في الأشخاص المصابين بداء السكري وكبار السن حتى لو لم تبدُ الأعراض خطيرة.",


};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about2);

        ListView tiplist = (ListView)findViewById(R.id.list2);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview_tips,
                R.id.textView, array);


        tiplist.setAdapter(arrayAdapter);
    }
}
