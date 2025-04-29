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

public class PhoneActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterPupolar;
    private RecyclerView recyclerViewPupolar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_phone);

        initRecyclerview();
        bottom_navigation();

    }

    private void bottom_navigation() {
//        LinearLayout homeBtn=findViewById(R.id.homeBtn);
        LinearLayout cartBtn=findViewById(R.id.cartBtn);

//        homeBtn.setOnClickListener(view -> startActivity(new Intent(MainActivity.this,MainActivity.class)));
        cartBtn.setOnClickListener((view -> startActivity(new Intent(PhoneActivity.this, CartActivity.class))));
    }

    private void initRecyclerview() {

        ArrayList<PopularDomain> allItems = new ArrayList<>();

        allItems.add(new PopularDomain("Iphone 14 Pro Blue","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","pic3",13,4.2,16000000));
        allItems.add(new PopularDomain("Iphone 14 Pro White","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","p1",13,4.2,16200000));
        allItems.add(new PopularDomain("Samsung galaxy s21 ultra","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","p2",13,4.2,19200000));
        allItems.add(new PopularDomain("Xiaomi Mi 12 lite","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","p3",13,4.2,2000000));
        allItems.add(new PopularDomain("Xiaomi Mi 5x","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","p4",13,4.2,1900000));
        allItems.add(new PopularDomain("Xiaomi Mi MIX 2","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","p5",13,4.2,1800000));
        allItems.add(new PopularDomain("Huawei nova 2","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","p6",13,4.2,2900000));
        allItems.add(new PopularDomain("Huawei nova 2","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","p7",13,4.2,2100000));
        allItems.add(new PopularDomain("Huawei P20","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","p8",13,4.2,3400000));
        allItems.add(new PopularDomain("Huawei Honnor 8 Pro","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","p9",13,4.2,2300000));
        allItems.add(new PopularDomain("Vivo V9 Black","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","p10",13,4.2,2100000));


        RecyclerView recyclerViewAll = findViewById(R.id.viewPhone);
        recyclerViewAll.setLayoutManager(new GridLayoutManager(this, 2)); // 2 kolom

        PopularListAdapter adapterAll = new PopularListAdapter(allItems);
        recyclerViewAll.setAdapter(adapterAll);

    }

}