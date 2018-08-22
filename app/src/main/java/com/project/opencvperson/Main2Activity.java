package com.project.opencvperson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main2Activity extends AppCompatActivity {
List<Items> items=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final RecyclerView recyclerView = findViewById(R.id.recyclerview);

        ApiUtils.getSOService().getCount().enqueue(new Callback<List<Items>>() {
            @Override
            public void onResponse(Call<List<Items>> call, Response<List<Items>> response) {
                if (response.isSuccessful()){
                    if (response.body().size()>0){
                        Log.e("eeeerwfvsdf",""+response.body().size());
                        for (Items item:response.body()){
                            items.add(new Items(item.getCc_num(),item.getCc_count(),item.getCc_date()));
                        }
                        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
                        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
                        recyclerView.setLayoutManager(layoutManager);
                        recyclerView.setAdapter(new Adapter(items,Main2Activity.this));
                    }
                }else{

                }
            }

            @Override
            public void onFailure(Call<List<Items>> call, Throwable t) {

            }
        });
//        recyclerView.setAdapter(new Adapter());


    }
}
