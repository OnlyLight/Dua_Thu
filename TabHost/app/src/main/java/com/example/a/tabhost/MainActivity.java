package com.example.a.tabhost;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        // 1
        TabHost.TabSpec tab1 = tabHost.newTabSpec("Tab 1");
        tab1.setIndicator("Ổi");
        tab1.setContent(new Intent(MainActivity.this, Tab1.class));

        // 2
        TabHost.TabSpec tab2 = tabHost.newTabSpec("Tab 2");
        tab2.setIndicator("Tab 2");
        tab2.setContent(new Intent(MainActivity.this, Tab2.class));

        // 3
        TabHost.TabSpec tab3 = tabHost.newTabSpec("Tab 3");
        tab3.setIndicator("Tab 3");
        tab3.setContent(new Intent(MainActivity.this, Tab3.class));

        // add
        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);
    }
}
