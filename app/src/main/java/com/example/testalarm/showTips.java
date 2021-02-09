package com.example.testalarm;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class showTips extends AppCompatActivity {

    // Array of strings...

   static String countryList[] = { "•\tالخبز الأبيض من أكثر الأطعمة الغنية بالصوديوم، كما أنه منزوع النخالة والألياف ما يجعل نسبة الكربوهيدرات مرتفعة فيه جدا مما يزيد نسبة السكر في الدم كما يؤثر ذلك على صحة القلب",
            "اللحوم الباردة والمصنعة تحتوي على نسبة عالية من مادة نترات الصوديم التي تستخدم كمادة حافظة\n" +
                    "مما  يزيد فرصة حدوث الالتهاب في الجسم، وهو سبب مباشر في ضيق وتصلب الشرايين\n",
            "•\tالخبز الأبيض من أكثر الأطعمة الغنية بالصوديوم، كما أنه منزوع النخالة والألياف ما يجعل نسبة الكربوهيدرات مرتفعة فيه جدا مما يزيد نسبة السكر في الدم كما يؤثر ذلك على صحة القلب",
            "•\tالأطعمة المقلية تحتوي على نسبة مرتفعة من الدهون المتحولة التي تزيد من نسبة الكوليستول الضار بالجسم وتخفض من نسبة الكوليسترول الجيد مما يزيد مخاطر الوفاة بمرض الشريان التاجي",
            "•\tتناول كميات كافيه من السوائل بعد الإفطار",
    "•\tتقليل الملح في الطعامن بشكل عام لمنع ارتفاع ضغط الدم",
            "•\tالإكثار من تناول الفاكهة والخضروات الغنية بالألياف",
   "\tلا تخرج في الأوقات المتأخرة من الليل حرصا على سلامتك",
           "\tارتدي ملابس جيدة واحرص على تدفئة الجسم خاصة إذا كنت تعاني من مشكلات في الشرايين التاجية.",
           "\tلا تنزل في الطقس البارد بعد تناول الطعام.",
           "\tتناول المشروبات الدافئة يساعد على ضبط حرارة الجسم ",
           "تجنب التدخين و منتجات التبغ بشكل عام فهي تزيد الضغط على القلب ",
           "الإبقاء على وزن مثالي يساعد في الحفاظ على الصحة",
           "الحصول على القدر الكافي من النوم الجيد يقلل خطر الإصابة بالنوبات القلبية وارتفاع ضغط الدم ",
           "تمرن حوالي 30 دقيقة في أغلب أيام الأسبوع حيث يمكن لبعض التمرين اليومي المنتظم تقليل خطر مرض القلب لديك ",
           "تجنب التوتر والضغط العصبي ",
           "إجراء فحوصات على الصحة بانتظام مثل (فحوصات ضغط الدم ومستويات الكوليسترول و داء السكري) يحافظ على القلب والأوعة الدموية من التلف.",
           "ابتعد عن ممارسة الرياضة في حالة الصيام وخاصة فترة ما قبل الافطار لنقص سوائل الجسم مما قد يؤدي ألي جلطات حرارية نتيجة الجفاف ",
           "عدم التعرض المباشر لأشعة الشمس في الأوقات شديدة الحر لتجنب الارتفاع المفاجيء في الضغط الشرياني ",
           "لا تسى ارتداء الطواقي القطنية أو تغطية الرأس بأغطية بيضاء اللون بالخارج؛ لتجنب الأشعة فوق البنفسجية التي تخترق الجسم وترفع من درجة حرارته وخاصة لدى الأطفال.",
           "تجنب بذل المجهود الشديد لسلامتك ",
           "تناول الأدوية وحده ليس كافيا ولكن تناولها في مواعيدها المحددة لمنع المضاعفات الصحية ",
           "ممارسة التمارين الرياضية الخفيفة كالجري والسباحة مع شرط عدم الإجهاد يساعد على تقوية عضلة القلب وزيادة ضخها للدم ",
           "احرص على أن تكون درجة حرارة جسدك طبيعية ولا تقل عن الطبيعي ",
           "تجنب الانتقال من جو دافئ إلي جو بارد بصورة مفاجئة لأن هذا يؤدي إلى تقلص الشرايين بالإضافة إلي إضعاف الدورة الدموية الطرفية ",
           "تجنب الأطعمة الدسمة والغنية بالدهون والأملاح ،حيث يسهم تخفيف الوزن بتحسن و تغيرات إيجابية",
           "عدم تناول الكثير من الطعام في وقت واحد لتجنب اندفاع الدم مرة واحدة للجهاز الهضمي ما يسبب مشكلة للقلب وتقسيمه على فترات اليوم بدلا من ذلك",
           "أكثر من تناول الفاكهه والخضراوات الغنية بالألياف ",
           "ابتعد عن أشعة الشمس الضارة حتى لا تتعرض للهبوط الحاد ",
           "تجنب الوجبات السريعة التي تحتوي على نسبة دهون عالية ",
           "استخدم المصعد الكهربائي بقدر الإمكان بدلا من الصعود على السلم لتجنب الشعور بالإجهاد وحدوق مضاعفات ",
           "تجنب الاجهاد الشديد في العمل سواء عضلي أو ذهني",
           "عليك بالتقليل من المنتجات الكحولية أو بالأفضل منعها لأنها تزيد من ضغط الدم بالإضافة إلى زيادة الوزن ",
           "المحافظة على نظام غذائي صحي يساعد على تحسن حالتك الصحية ",
           "تساعد كمية صغيرة من جوز عين الجمل يومياً على خفض مستوى الكولسترول الضار ورفع مستوى الكولسترول الجيد والوقاية من أمراض القلب",
           "تناول 150 غم من المكسرات؛ كاللوز والكاجو والفستق والجوز كل أسبوع يُقلّل بنسبة 50% من خطر الإصابة بأمراض القلب",
           "منتجات الألبان غنية بالبوتاسيوم الذي يؤثّر بشكل إيجابي في خفض ضغط الدم مما يقلل خطر الإصابة بالعديد من أمراض القلب ",
           "يحتوي الحمص والبقوليات الأخرى؛ كالعدس والفاصوليا الجافة على كميات عالية جداً من الألياف القابلة للذوبان التي يمكن أن تقلّل من مستوى الكولسترول الضار في الدم",
           "يحتوي الشوفان على نوع من الألياف يسمي بيتا جلوكان الذى يساعد في خفض مستوي الكولسترول الضار في الدم والحفاظ علي استقرار مستويات السكر في الدم ",
           "يعتبر الكاكاو مصدرا غنيا بمركب الفلافانوس الذي يعمل كمضاد للأكسدة وبالتالي يساعد علي منع التصاق الكولسترول الضار علي جدران الشرايين ويساعد علي خفض ضغط الدم ومنع تكون الجلطات",
           "تُعتبر جميع أنواع وأشكال الكرز (الكرز الحلو، الكرز الحامض، الكرز المجفف، عصير الكرز) مفيدة لصحة القلب وذلك لإكتوائها علي مضادات أكسده تسمي الأنثوسيانين التي تساعد ةعلي حماية الأوعيه الدموية",
           "تحتوي الأسماك الدهنية مثل: سمك الماكريل، والسردين، والتونة، والسلمون على دهون الأوميغا 3؛ حيثُ إنَّ هذه الدهون تساعد على تقليل مستوى الدهون الثلاثية وزيادة مستوى الكولسترول الجيد في الدم، كما تُحسّن مرونة الأوعية الدموية؛ ممّا يجعلها أقل عُرضة للانسداد",
           "يحتوي البرتقال على ألياف تُسَّمى البكتين تُساعد على الوقاية من مستويات الكولسترول العالية في الدم، كما أنَّها تحتوي على البوتاسيوم الذي يساعد على التحكم في ضغط الدم",
           "يعدّ التوت غنيًّا بمضادات الأكسدة مثل الأنثوسيانين التي تحمي من عوامل الخطر التي تؤدي إلى تطوّر أمراض القلب، كما ارتبط تناول التوت بانخفاض الكولسترول الضار، وانخفاض ضغط الدم الانقباضي. ",
           "تحتوي السبانخ على العديد من المواد الكيميائيّة، والفيتامينات، والمعادن بما في ذلك حمض الفوليك، والحديد، وتُحارب هذه المركبات العديد من الأمراض وتُساعد على الحماية من أمراض القلب",
           "يحتوي التفاح على الألياف القابلة للذوبان التي قد تُخفض من مستوى الكولسترول الضار ",
           " يحتوي التفاح على الفلافونويد الذي قد يُساعد على خفض ضغط الدم، حيثُ ارتبط تناول التفاح بتقليل خطر الإصابة بأمراض القلب",
           "يحتوي الموز على البوتاسيوم الذي يقوم بتنظيم عمل وظائف القلب كما ينشّط الكلى للتخلص من الصوديوم الفائض في الجسم وبالتالي خفض ضغط الدم، كما يحتوي على الألياف التي تقوم بتقليل نسبة الكولسترول الضارّ في الجسم ",
           "يحتوي الزبيب على مضادات الأكسدة التي تقوم بالتصدّي لأي بكتيريا أو التهابات قد تؤثر مضاعفاتها على صحة القلب ",
           "يُعدّ الأفوكادو مصدراً غنيّاً بالأحماض الدهنية الأحادية غير المشبعة بالإضافة إلى احتوائه على كميّاتٍ كبيرةٍ من مضادّات الأكسدة التي تساعد على تقليل الالتهابات في جميع أجزاء الجسم، وخاصّةً القلب ",
           "زيت الزيتون عبارة عن دهون صحية غمية بمضادات الأكسده التى تحمي الأوعية الدموية للقلب والتى تساعد علي خفض مستويات الكولسترول في الدم ",
           "فول الصويا.يحتوي علي الألياف الصحية للقلب والتي تسلعد علي خفض مستويات الكولسترول في الدم",
           "الشعير يحتوي على الألياف التى تساعد في خفض مستويات الكولسترول في الدم وقد يخفض مستوى السكر أيضا",
           "تحتوي بذور الكتان على الألياف الصحية والمواد الكيميائية النباتية مثل الليجنان والأحماض الدهنيه مثل أوميغا3",



   };

    int length= countryList.length;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors);

        ListView  tiplist = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview_tips,
                R.id.textView, countryList);


        tiplist.setAdapter(arrayAdapter);








    }






}
