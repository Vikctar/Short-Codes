package com.vikcandroid.datawallet;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;

import com.vikcandroid.datawallet.adapter.SafAdapter;
import com.vikcandroid.datawallet.model.Service;
import com.vikcandroid.datawallet.utils.GridItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class SafaricomActivity extends AppCompatActivity {

    private List<Service> services = new ArrayList<>();
    private RecyclerView recyclerView;
    private SafAdapter safAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safaricom);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.categorySafaricom)));

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.categorySafaricom));
        }

        safAdapter = new SafAdapter(services);
        recyclerView = (RecyclerView) findViewById(R.id.safRecycler);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new GridItemDecoration(2, dpToPixel(2), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(safAdapter);

        prepareServices();
    }

    private void prepareServices() {
        Service service = new Service("Buy Bundle", getResources().getColor(R.color.colorAccent));
        services.add(service);

        service = new Service("Sambaza", getResources().getColor(R.color.categoryDSTV));
        services.add(service);

        service = new Service("Data Balance", getResources().getColor(R.color.categoryYu));
        services.add(service);

        service = new Service("Please call me", getResources().getColor(R.color.categoryAirtel));
        services.add(service);

        service = new Service("Okoa Jahazi", getResources().getColor(R.color.categoryOrange));
        services.add(service);

        service = new Service("Top up", getResources().getColor(R.color.categorySafaricom));
        services.add(service);

        service = new Service("Data Balance", getResources().getColor(R.color.primary_color));
        services.add(service);

        service = new Service("Daily Bundles", getResources().getColor(R.color.colorPrimary));
        services.add(service);

        service = new Service("Customer Care", getResources().getColor(R.color.categoryDSTV));
        services.add(service);

        service = new Service("Bonga Points", getResources().getColor(R.color.categoryDSTV));
        services.add(service);

    }

    private int dpToPixel(int dp) {
        Resources resources = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, resources.getDisplayMetrics()));
    }

}
