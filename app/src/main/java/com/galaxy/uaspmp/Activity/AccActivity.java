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

public class AccActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterPupolar;
    private RecyclerView recyclerViewPupolar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_acc);

        initRecyclerview();
        bottom_navigation();

    }

    private void bottom_navigation() {
//        LinearLayout homeBtn=findViewById(R.id.homeBtn);
        LinearLayout cartBtn=findViewById(R.id.cartBtn);

//        homeBtn.setOnClickListener(view -> startActivity(new Intent(MainActivity.this,MainActivity.class)));
        cartBtn.setOnClickListener((view -> startActivity(new Intent(AccActivity.this, CartActivity.class))));
    }

    private void initRecyclerview() {

        ArrayList<PopularDomain> allItems = new ArrayList<>();

        allItems.add(new PopularDomain("Mouse Razer Mamba","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","a1",13,4.2,1200000));
        allItems.add(new PopularDomain("Logitech Mouse Gaming","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","a2",13,4.2,1300000));
        allItems.add(new PopularDomain("Gaming Mouse ROG Spatha","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","a3",13,4.2,2300000));
        allItems.add(new PopularDomain("Mouse ROG Strix Evolve","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","a4",13,4.2,1900000));
        allItems.add(new PopularDomain("Keyboard Gaming ROG","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","a5",13,4.2,2300000));
        allItems.add(new PopularDomain("Keyboard RedDragon Mechanical","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","a6",13,4.2,500000));
        allItems.add(new PopularDomain("Keyboard ROG Mechanical 334","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","a7",13,4.2,2500000));
        allItems.add(new PopularDomain("JBL C45BT Headphones Wireless","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","a8",13,4.2,9600000));
        allItems.add(new PopularDomain("Headphone Beats B445 Wireless","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","a9",13,4.2,430000));
        allItems.add(new PopularDomain("JBL T450 Headphones Wireless","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","a10",13,4.2,1200000));



        RecyclerView recyclerViewAll = findViewById(R.id.viewAcc);
        recyclerViewAll.setLayoutManager(new GridLayoutManager(this, 2)); // 2 kolom

        PopularListAdapter adapterAll = new PopularListAdapter(allItems);
        recyclerViewAll.setAdapter(adapterAll);

    }

}