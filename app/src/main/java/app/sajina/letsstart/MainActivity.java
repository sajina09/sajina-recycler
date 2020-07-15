package app.sajina.letsstart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    SajinRecyclerViewAdapter sajinRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        sajinRecyclerViewAdapter = new SajinRecyclerViewAdapter(getCountryList(), MainActivity.this);

        recyclerView.setAdapter(sajinRecyclerViewAdapter);


    }


    private ArrayList<CountryModel> getCountryList(){

        ArrayList<CountryModel> countryData = new ArrayList();
//        [{nepal,np},{india, ind}]

        CountryModel country1 = new CountryModel();
        country1.name = "Nepal";
        country1.flag = "https://cdn.countryflags.com/thumbs/nepal/flag-400.png";
        countryData.add(country1);


        CountryModel country2 = new CountryModel();
        country2.name = "Norway";
        country2.flag = "https://cdn.countryflags.com/thumbs/norway/flag-800.png";
        countryData.add(country2);



        CountryModel country3 = new CountryModel();
        country3.name = "China";
        country3.flag = "https://cdn.countryflags.com/thumbs/norway/flag-800.png";
        countryData.add(country3);



        CountryModel country4 = new CountryModel();
        country4.name = "Japan";
        country4.flag = "https://cdn.countryflags.com/thumbs/norway/flag-800.png";
        countryData.add(country4);



        CountryModel country5 = new CountryModel();
        country5.name = "Austria";
        country5.flag = "https://cdn.countryflags.com/thumbs/norway/flag-800.png";
        countryData.add(country5);



        CountryModel country6 = new CountryModel();
        country6.name = "Algeria";
        country6.flag = "https://cdn.countryflags.com/thumbs/norway/flag-800.png";
        countryData.add(country6);


        CountryModel country7 = new CountryModel();
        country7.name = "Algeria";
        country7.flag = "https://cdn.countryflags.com/thumbs/nepal/flag-400.png";
        countryData.add(country7);

        CountryModel country8 = new CountryModel();
        country8.name = "Algeria";
        country8.flag = "https://cdn.countryflags.com/thumbs/norway/flag-800.png";
        countryData.add(country8);

        CountryModel country9 = new CountryModel();
        country9.name = "Algeria";
        country9.flag = "https://cdn.countryflags.com/thumbs/norway/flag-800.png";
        countryData.add(country9);

        CountryModel country10 = new CountryModel();
        country10.name = "Algeria";
        country10.flag = "https://cdn.countryflags.com/thumbs/norway/flag-800.png";
        countryData.add(country10);

        CountryModel country11 = new CountryModel();
        country11.name = "Algeria";
        country11.flag = "https://cdn.countryflags.com/thumbs/norway/flag-800.png";
        countryData.add(country11);

        CountryModel country12 = new CountryModel();
        country12.name = "Algeria";
        country12.flag = "https://cdn.countryflags.com/thumbs/norway/flag-800.png";
        countryData.add(country12);

        CountryModel country13 = new CountryModel();
        country13.name = "Algeria";
        country13.flag = "https://cdn.countryflags.com/thumbs/norway/flag-800.png";
        countryData.add(country13);









        return countryData;



    }
}
