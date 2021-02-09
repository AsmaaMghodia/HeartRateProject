package com.example.testalarm;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class About10 extends AppCompatActivity {
    String array []={"علاج النوبة القلبية في مستشفى\n" +
            "كل دقيقة تمر بعد النوبة القلبية سيتلف فيها مزيدًا من الأنسجة القلبية أو قد تموت هذه الأنسجة. استعادة التدفق الطبيعي للدم سريعًا سيساعد في منع حدوث فشل القلب.\n" +
            "الأدوية\n" +
            "قد تتضمَّن الأدوية الموصوفة لمعالجة النوبات القلبية ما يلي:\n",
            "•\tالأسبرين (Aspirin) \n" +
                    " قد يُوصيك مشغل الطوارئ بتناول الأسبرين، أو قد يعطيك موظف الطوارئ الطبية الأسبرين مباشرةً. يعمل الأسبرين على تقليل التخثرات الدموية؛ الأمر الذي يحافظ على تدفق الدم في الشرايين الدقيقة.\n",
            "•\tمضادات التخثر (Anticoagulant)\n" +
                    " هذه العقاقير -أو كما تدعى محارث التخثر- تساعد في تحليل التخثرات الدموية التي تحجب الدم من التدفق إلى قلبك. وكلما بكَّرت بتناول عقار مضاد للتخثر بعد أزمةٍ قلبية، زادت فرصتك في النجاة، وقلَّ الضرر الواقع على القلب.\n",
            "•\tالأدوية المضادة للصفيحات (Antiplatelet medicines)\n" +
                    " قد يعطيك أطباء غرفة الطوارئ عقاقير أخرى تُعرف باسم مضادات الصفيحات لمساعدتك في تجنُّب التعرض للتخثرات وتقييد التخثرات الحالية وعدم السماح لها بالنمو.\n",
            "•\tأدوية ترقيق الدم (Blood thinners) \n" +
                    " من المرجح أن تُعطى أدويةٌ أخرى -مثل الهيبارين- لجعل دمك أقل «لزوجةً» وأقل عرضةً للتعرض للتخثرات. يُعطى الهيبارين عبر الحَقْن بين الأوردة أو عبر الحَقْن تحت الجلد.\n",
            "•\tمسكِّنات الألم\n" +
                    " يمكن أن تُعطى مسكنات ألم مثل المورفين.\n",
            "•\tالنيتروغليسرين (Nitroglycerin)\n" +
                    " يُستخدم هذا الدواء لعلاج ألم الصدر (الذبحة)، ويمكنه أن يحسِّن تدفُّق الدم عبر توسيع (بسط) الأوعية الدموية.\n",
            "•\tحاصرات بيتا  (Beta-blockers) \n" +
                    " تساعد هذه الأدوية على استرخاء عضلة قلبك، وإبطاء نبض القلب، وتقليل ضغط الدم؛ مما يجعل مهمة قلبك أيسر. يمكن لحاصرات بيتا الحد من مدى تضرُّر القلب، والحيلولة دون حدوث أزمات قلبية مستقبلية.\n",
            "•\tمثبطات الإنزيم المحول للأنغيوتنسينAngiotensin converting enzyme (ACE) inhibitors\n" +
                    " تخفض هذه الأدوية ضغط الدم وتقلل إجهاد القلب.\n",
            "•\tأدوية خافِضة للكوليسترول (Statins)\n" +
                    " تساعد هذه العقاقير في التحكم في كوليسترول الدم.\n",
            "الإجراءات الجراحية والإجراءات الأخرى\n" +
                    "بالإضافة إلى الأدوية، قد تُتخذ أحد هذه الإجراءات لعلاج النوبة القلبية التي تشعر بها:\n",
            "•\tرأب الأوعية التاجية والدعامات (Angioplasty)\n" +
                    " في هذا الإجراء، المعروف أيضًا باسم التدخل التاجي بطريق الجلد (PCI)، يدخل الأطباء أنبوبًا طويلًا رفيعًا (قِسطار) يمر عبر الشريان التاجي في الفخذ أو الرسغ إلى شريان مسدود في القلب. إذا كان لديك نوبة قلبية، غالبًا ما يتم اتخاذ الإجراء مباشرةً بعد قسطرة القلب، الإجراء المستخدم لاكتشاف الانسداد.\n" +
                    "تحتوي هذه القسطرة على بالون خاص، يتم نفخه لفترة وجيزة في الموضع لفتح الشريان التاجي المسدود. ثم بعد ذلك، يتم إدخال دعامة شبكية معدنية في الشريان لإبقائها مفتوحة على المدى الطويل، واستعادة تدفق الدم إلى القلب. بناءً على حالتك، قد تحصل على دعامة مغلفة بدواء يتم إطلاقه ببطء للمساعدة في إبقاء الشريان مفتوحًا.\n",
            "•\tجراحة مجازة الشريان التاجي (Coronary artery bypass surgery)\n" +
                    " في بعض الحالات، يجري الأطباء جراحة مجازة الشريان في حالات الطوارئ في وقت الإصابة بنوبة قلبية. ولكن، إذا أمكن، قد تخضع لجراحة المجازاة بعد أن يستغرق قلبك وقتًا ـ من ثلاثة إلى سبعة أيام تقريبًا ـ للتعافي من النوبة القلبية التي تعرضتَ لها.\n" +
                    "تتضمن جراحة المجازاة خياطة الأوردة أو الشرايين الموجودة خلف الشريان التاجي المسدود أو الضيق، مما يسمح بتدفق الدم إلى القلب لتجاوز الجزء الضيق.\n" +
                    "وفور استعادة تدفق الدم إلى قلبك واستقرار حالتك، فمن المحتمل أن تبقى في المستشفى لعدة أيام.\n",
            "إعادة تأهيل القلب\n" +
                    "يوفر العديد من المستشفيات برامج قد تبدأ في أثناء وجودك في المستشفى وتستمر لأسابيع وحتى شهرين بعد عودتك إلى المنزل. تركز برامج إعادة تأهيل القلب بشكل عام على أربعة مجالات رئيسية — الأدوية، والتغيرات في نمط الحياة، والمشكلات العاطفية، والعودة التدريجية لأنشطتك الطبيعية.\n" +
                    "تُعدُّ المشاركة في هذا البرنامج في غاية الأهمية. عادةً ما يعيش الأشخاص الذين بادروا إلى برنامج إعادة تأهيل القلب عقب التعرض لنوبة قلبية فترة أطول وغالبًا ما يكونون أقل عرضةً للتعرض لنوبة قلبية أخرى أو مضاعفاتها.\n",
            ""

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about10);

        ListView tiplist = (ListView)findViewById(R.id.list10);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview_tips,
                R.id.textView, array);


        tiplist.setAdapter(arrayAdapter);
    }
}