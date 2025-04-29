package com.galaxy.uaspmp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.text.NumberFormat;
import java.util.Locale;

import com.galaxy.uaspmp.Adapter.CartListAdapter;
import com.galaxy.uaspmp.Helper.ChangeNumberItemsListener;
import com.galaxy.uaspmp.Helper.ManagmentCart;
import com.galaxy.uaspmp.R;

public class CartActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter;
    private RecyclerView recyclerView;
    private ManagmentCart managmentCart;

    private TextView totalFeeTxt,taxTxt,deliveryTxt,totalTxt,emptyTxt;
    private double tax;
    private ScrollView scrollView;
    private ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cart);

        managmentCart=new ManagmentCart(this);

        initView();
        setVariavle();
        initList();
        calcualteCart();

        findViewById(R.id.orderButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kosongkan keranjang
                managmentCart.clearCart();

                // Perbarui tampilan
                adapter.notifyDataSetChanged();
                emptyTxt.setVisibility(View.VISIBLE);
                scrollView.setVisibility(View.GONE);

                // Pindah ke halaman sukses order
                Intent intent = new Intent(CartActivity.this, OrderSuccessActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }



    private void initList() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter=new CartListAdapter(managmentCart.getListCart(), this, new ChangeNumberItemsListener() {
            @Override
            public void change() {
                calcualteCart();
            }
        });

        recyclerView.setAdapter(adapter);
        if(managmentCart.getListCart().isEmpty()){
            emptyTxt.setVisibility(View.VISIBLE);
            scrollView.setVisibility(View.GONE);
        }else {
            emptyTxt.setVisibility(View.GONE);
            scrollView.setVisibility(View.VISIBLE);
        }
    }

    private void calcualteCart() {
        double percentTax = 0.02; // Pajak 2%
        double delivery = 30000;
        tax = Math.round((managmentCart.getTotalFee() * percentTax) * 100.0) / 100.0;

        double total = Math.round((managmentCart.getTotalFee() + tax + delivery) * 100) / 100;
        double itemTotal = Math.round(managmentCart.getTotalFee() * 100) / 100;

        // Format angka ke dalam format Rupiah
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        totalFeeTxt.setText(formatRupiah.format(itemTotal));
        taxTxt.setText(formatRupiah.format(tax));
        deliveryTxt.setText(formatRupiah.format(delivery));
        totalTxt.setText(formatRupiah.format(total));
    }

    private void setVariavle() {
        backBtn.setOnClickListener(view -> finish());
    }

    private void initView() {
        totalFeeTxt=findViewById(R.id.totalFeeTxt);
        taxTxt=findViewById(R.id.taxTxt);
        deliveryTxt=findViewById(R.id.deliveryTxt);
        totalTxt=findViewById(R.id.totalTxt);
        recyclerView=findViewById(R.id.view3);
        scrollView=findViewById(R.id.scrollView2);
        backBtn=findViewById(R.id.backBtn);
        emptyTxt=findViewById(R.id.emptyTxt);
    }
}