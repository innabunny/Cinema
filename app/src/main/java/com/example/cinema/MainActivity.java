package com.example.cinema;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    List<Films> listOfFilms;

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar_title_layout);
        setContentView(R.layout.activity_main);



        listOfFilms = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);

        listOfFilms.add(new Films(R.drawable.greenmile, "Зеленая миля","фильм", "Обвиненный в страшном преступлении, Джон Коффи оказывается в блоке смертников тюрьмы «Холодная гора». Вновь прибывший обладал поразительным ростом и был пугающе спокоен, что, впрочем, никак не влияло на отношение к нему начальника блока Пола Эджкомба, привыкшего исполнять приговор."));
        listOfFilms.add(new Films(R.drawable.earth, "Земля ночью в цвете","документальный фильм","Документальный сериал, снятый на шести континентах, благодаря передовым технологиям позволяет понаблюдать за ночным образом жизни животных в полноцветном изображении."));
        listOfFilms.add(new Films(R.drawable.avatar, "Аватар","фильм", "Джейк Салли — бывший морской пехотинец, прикованный к инвалидному креслу. Несмотря на немощное тело, Джейк в душе по-прежнему остается воином. Он получает задание совершить путешествие в несколько световых лет к базе землян на планете Пандора, где корпорации добывают редкий минерал, имеющий огромное значение для выхода Земли из энергетического кризиса."));
        listOfFilms.add(new Films(R.drawable.batman, "Бэтман","фильм", "После двух лет поисков правосудия на улицах Готэма для своих сограждан Бэтмен становится олицетворением беспощадного возмездия. Когда в городе происходит серия жестоких нападений на представителей элиты, загадочные улики приводят Брюса Уэйна в самые темные закоулки преступного мира, где он встречает Женщину-Кошку, Пингвина, Кармайна Фальконе и Загадочника. "));

        MyListAdapter adapter = new MyListAdapter(this, R.layout.mu_custom_list,listOfFilms);

        listView.setAdapter(adapter);

    }


    @Override
    public void onClick(View view) {
        Button button = (Button) view;
        if (button.getId() == R.id.button2) {
            Intent intent = new Intent("browserActivity");
            startActivity(intent);
        }
    }
}