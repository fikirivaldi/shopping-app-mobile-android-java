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

public class PcActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterPupolar;
    private RecyclerView recyclerViewPupolar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pc);

        initRecyclerview();
        bottom_navigation();

    }

    private void bottom_navigation() {
//        LinearLayout homeBtn=findViewById(R.id.homeBtn);
        LinearLayout cartBtn=findViewById(R.id.cartBtn);

//        homeBtn.setOnClickListener(view -> startActivity(new Intent(MainActivity.this,MainActivity.class)));
        cartBtn.setOnClickListener((view -> startActivity(new Intent(PcActivity.this, CartActivity.class))));
    }

    private void initRecyclerview() {

        ArrayList<PopularDomain> allItems = new ArrayList<>();
        allItems.add(new PopularDomain("Asus Vivobook OLED","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","pic1",15,4,9000000));
        allItems.add(new PopularDomain("HP Victus 15","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","pic4",10,5,13000000));
        allItems.add(new PopularDomain("PC Core i7 12500","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","pic5",10,5,10000000));
        allItems.add(new PopularDomain("HP OMEN Gaming SSD 512GB","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","pic6",15,4,12000000));
        allItems.add(new PopularDomain("PC Ryzen 7 SSD 512TB","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","pic7",10,5,11500000));
        allItems.add(new PopularDomain("PC Core i5 13200","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","pic8",10,5,9200000));
        allItems.add(new PopularDomain("PC Core i5 GTX 1650","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","pic9",10,5,8900000));
        allItems.add(new PopularDomain("PC Ryzen 5 RTX 2050","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","pic10",10,5,79000000));
        allItems.add(new PopularDomain("Macbook Pro 13","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","pic11",10,5,17000000));
        allItems.add(new PopularDomain("ASUS ROG STRIX SCAR Edition","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","pic12",10,5,15000000));
        allItems.add(new PopularDomain("Xiaomi Mi Notebook Air 12.5","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","pic13",10,5,12000000));
        allItems.add(new PopularDomain("Laptop HP Envy","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","pic14",10,5,6000000));
        allItems.add(new PopularDomain("Asus ROG GL702","Didukung oleh Prosesor Mobile AMD Ryzen™ 7 5800H terbaru dengan grafis AMD Radeon™ dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, \n" +
                "                Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda. \uF0E0 Didukung oleh AMD Ryzen™ 5000 Series Mobile Processors with Radeon™ \n" +
                "                Graphics dan sistem pendingin kipas ganda, dan menampilkan WiFi 6 ultracepat, Vivobook Pro 14 OLED yang sangat bergaya memungkinkan Anda mencapai potensi sejati Anda.","pic15",10,5,11500000));



        RecyclerView recyclerViewAll = findViewById(R.id.viewPc);
        recyclerViewAll.setLayoutManager(new GridLayoutManager(this, 2)); // 2 kolom

        PopularListAdapter adapterAll = new PopularListAdapter(allItems);
        recyclerViewAll.setAdapter(adapterAll);

    }

}