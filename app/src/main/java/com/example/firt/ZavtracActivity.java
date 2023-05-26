package com.example.firt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ZavtracActivity extends AppCompatActivity {

    List<Salats> salats = new ArrayList<Salats>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salat);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.list_salat);

        SalatAdapter adapter = new SalatAdapter(this, salats);

        recyclerView.setAdapter(adapter);


    }

    private void setInitialData() {
        salats.add(new Salats("Омлет",R.drawable.omlet, "Пышный омлет без молока и соды.Это прекрасный вариант для тех, у кого непереносимость коровьего молока.", "Продукты (на 3 порции)\n" +
                "Яйца - 6 шт.\n" +
                "Вода минеральная газированная - 100 мл\n" +
                "Сыр твёрдый - 100 г\n" +
                "Помидор - 1 шт.\n" +
                "Соль - по вкусу\n" +
                "Перец чёрный молотый - по вкусу\n" +
                "Масло растительное (для жарки) - 1 ст. ложка\n" +
                "*\n" +
                "Для подачи (по желанию):\n" +
                "Горошек зелёный консервированный - 100 г\n" +
                "\n" +
                "\n" +
                " -Пошаговый рецепт:\n" +
                "    -Подготовьте все ингредиенты. Воду лучше возьмите сильногазированную, тогда омлет будет пышнее.\n" +
                "\n" +
                "    -Помидоры нарежьте кусочками среднего размера. В сковороде на среднем огне разогрейте растительное масло и обжарьте нарезанные помидоры до мягкости, примерно 2-3 минуты.\n" +
                "\n" +
                "    -Яйца разбейте в глубокую миску. Посолите и добавьте чёрный молотый перец.\n" +
                "\n" +
                "    -Вилкой слегка разболтайте яйца, чтобы белки и желтки перемешались между собой.\n" +
                "\n" +
                "    -Влейте в яичную массу сильногазированную минеральную воду и перемешайте.\n" +
                "\n" +
                "    -Яичную массу с водой вылейте в сковороду к обжаренным помидорам.\n" +
                "\n" +
                "    -Накройте сковороду крышкой и жарьте омлет примерно 5-7 минут до момента, когда яйца почти \"схватятся\".\n" +
                "\n" +
                "    -Сыр натрите на крупной тёрке.\n" +
                "\n" +
                "    -За минуту до готовности омлета распределите по поверхности натёртый сыр. Накройте крышкой и прогрейте ещё 1 минуту.\n" +
                "\n" +
                "    -Как только сыр расплавился, а омлет стал пышным и плотным - сковороду можно снимать с огня.\n" +
                "\n" +
                "    -Такой пышный омлет без молока можно подать с консервированным зёленым горошком.\n" +
                "\n" +
                "    -Пышный омлет на газированной воде, с помидорами и сыром, внесёт приятное разнообразие в череду привычных завтраков из яиц."));

        salats.add(new Salats("Сырники",R.drawable.sirnik, "Самый вкусный завтрак - теплые сырники", "Продукты (на 4 порции)\n" +
                "Творог - 300 г\n" +
                "Яйцо - 1 шт.\n" +
                "Сметана или йогурт - 2 ст. ложки\n" +
                "Мука - примерно 130 г (1 стакан объемом 200 мл)\n" +
                "Разрыхлитель - 1 ч. ложка\n" +
                "Сахар - 1-2 ст. ложки (по вкусу)\n" +
                "Соль - 1 щепотка\n" +
                "Масло растительное - для жарки" +
                 "\n" +
                "Пошаговый рецепт\n" +
                "\n" +
                "Творог тщательно размять с сахаром.\n" +
                "Добавить яйцо, сметану, соль, разрыхлитель. Все хорошо перемешать.\n" +
                "Затем добавить муку.\n" +
                "\n" +
                "Тщательно перемешать тесто для сырников.\n" +
                "\n" +
                "Тесто разделить на 2 части. Из каждой части скатать колбаску.\n" +
                "\n" +
                "Нарезать колбаску из теста кусочками шириной около 2 см.\n" +
                "\n" +
                "Сформировать сырники и обвалять их в муке.\n" +
                "\n" +
                "Разогреть сковороду, налить растительное масло. В горячее масло выложить сырники.\n" +
                "Жарить сырники на среднем огне сперва под крышкой 3-5 минут, до румяности с одной стороны. Затем перевернуть сырники на другую сторону и жарить уже без крышки, также до золотистого цвета, еще 2-3 минуты.\n" +
                "\n" +
                "Подавать сырники с вареньем, джемом, сиропом, сгущенкой или сметаной.\n"));

    }
}