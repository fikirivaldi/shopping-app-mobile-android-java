package com.galaxy.uaspmp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.galaxy.uaspmp.Adapter.PopularListAdapter;
import com.galaxy.uaspmp.Domain.PopularDomain;
import com.galaxy.uaspmp.R;

import java.util.ArrayList;

public class GamingActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterPupolar;
    private RecyclerView recyclerViewPupolar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gaming);

        initRecyclerview();
        bottom_navigation();

    }

    private void bottom_navigation() {
//        LinearLayout homeBtn=findViewById(R.id.homeBtn);
        LinearLayout cartBtn=findViewById(R.id.cartBtn);

//        homeBtn.setOnClickListener(view -> startActivity(new Intent(MainActivity.this,MainActivity.class)));
        cartBtn.setOnClickListener((view -> startActivity(new Intent(GamingActivity.this, CartActivity.class))));
    }

    private void initRecyclerview() {

        ArrayList<PopularDomain> allItems = new ArrayList<>();

        allItems.add(new PopularDomain("Sony Playstation 5 Disc","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","pic2",10,4.5,7500000));
        allItems.add(new PopularDomain("Sony Playstation 4 Pro 1TB","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","g1",10,4.5,5500000));
        allItems.add(new PopularDomain("Sony Playstation 4 Fat 500GB","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","g2",10,4.5,3500000));
        allItems.add(new PopularDomain("Sony Playstation 3 Slim 500GB","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","g3",10,4.5,2500000));
        allItems.add(new PopularDomain("XBOX 360 S","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","g4",10,4.5,1900000));
        allItems.add(new PopularDomain("XBOX One S 500GB","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","g5",10,4.5,2400000));
        allItems.add(new PopularDomain("Sony Playstation 4 Slim","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","g6",10,4.5,4200000));
        allItems.add(new PopularDomain("ASUS ROG Ally 512GB","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","g7",10,4.5,7500000));
        allItems.add(new PopularDomain("Nintendo Switch  128GB","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","g8",10,4.5,4500000));
        allItems.add(new PopularDomain("Lenovo Legion Go 512GB","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","g9",10,4.5,12500000));
        allItems.add(new PopularDomain("MSI Claw A1M 512GB","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","g10",10,4.5,6800000));
        allItems.add(new PopularDomain("XBOX Series X 1TB","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","g11",10,4.5,7100000));



        RecyclerView recyclerViewAll = findViewById(R.id.viewGaming);
        recyclerViewAll.setLayoutManager(new GridLayoutManager(this, 2)); // 2 kolom

        PopularListAdapter adapterAll = new PopularListAdapter(allItems);
        recyclerViewAll.setAdapter(adapterAll);

    }

}