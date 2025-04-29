package com.galaxy.uaspmp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.galaxy.uaspmp.Adapter.PopularListAdapter;
import com.galaxy.uaspmp.Domain.PopularDomain;
import com.galaxy.uaspmp.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView.Adapter adapterPupolar;
private RecyclerView recyclerViewPupolar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        initRecyclerview();
        bottom_navigation();
        see_all();
        all_item();
        pc_item();
        phone_item();
        acc_item();
        gaming_item();
    }

    private void gaming_item() {
        LinearLayout gamingItem=findViewById(R.id.gamingItem);

        gamingItem.setOnClickListener((view -> startActivity(new Intent(MainActivity.this, GamingActivity.class))));
    }

    private void acc_item() {
        LinearLayout accItem=findViewById(R.id.accItem);

        accItem.setOnClickListener((view -> startActivity(new Intent(MainActivity.this, AccActivity.class))));
    }

    private void phone_item() {
        LinearLayout pcItem=findViewById(R.id.phoneItem);

        pcItem.setOnClickListener((view -> startActivity(new Intent(MainActivity.this, PhoneActivity.class))));
    }

    private void pc_item() {
        LinearLayout pcItem=findViewById(R.id.pcItem);

        pcItem.setOnClickListener((view -> startActivity(new Intent(MainActivity.this, PcActivity.class))));
    }

    private void all_item() {
        LinearLayout allItem=findViewById(R.id.allItem);

        allItem.setOnClickListener((view -> startActivity(new Intent(MainActivity.this, AllActivity.class))));
    }

    private void see_all() {

        TextView seeAll=findViewById(R.id.seeAll);

        seeAll.setOnClickListener((view -> startActivity(new Intent(MainActivity.this, AllActivity.class))));
    }


    private void bottom_navigation() {
//        LinearLayout homeBtn=findViewById(R.id.homeBtn);
        LinearLayout cartBtn=findViewById(R.id.cartBtn);

//        homeBtn.setOnClickListener(view -> startActivity(new Intent(MainActivity.this,MainActivity.class)));
        cartBtn.setOnClickListener((view -> startActivity(new Intent(MainActivity.this, CartActivity.class))));
    }

    private void initRecyclerview() {
        ArrayList<PopularDomain> items=new ArrayList<>();


        items.add(new PopularDomain("Asus Vivobook OLED","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","pic1",15,4,9000000));
        items.add(new PopularDomain("Sony Playstation 5","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","pic2",10,4.5,7500000));
        items.add(new PopularDomain("Iphone 14 Pro 512GB","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","pic3",13,4.2,14000000));

        ArrayList<PopularDomain> allItems = new ArrayList<>();

        allItems.add(new PopularDomain("ASUS ROG Ally 512GB","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","g7",10,4.5,7500000));
        allItems.add(new PopularDomain("XBOX Series X 1TB","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","g11",10,4.5,7100000));
        allItems.add(new PopularDomain("Mouse Razer Mamba","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","a1",13,4.2,1200000));




        recyclerViewPupolar=findViewById(R.id.view22);
        recyclerViewPupolar.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterPupolar=new PopularListAdapter(items);
        recyclerViewPupolar.setAdapter(adapterPupolar);

        RecyclerView recyclerViewAll = findViewById(R.id.view23);
        recyclerViewAll.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
//        setLayoutManager(new GridLayoutManager(this, 2)); // 2 kolom

        PopularListAdapter adapterAll = new PopularListAdapter(allItems);
        recyclerViewAll.setAdapter(adapterAll);

    }

}