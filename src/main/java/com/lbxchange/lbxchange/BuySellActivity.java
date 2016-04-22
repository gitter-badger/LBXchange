package com.lbxchange.lbxchange;

import android.app.LauncherActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Aaron Dao on 4/2/2016.
 * Version: 1.0
 * Note:
 */
public class BuySellActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_sell);

        final Button bBuy = (Button) findViewById(R.id.bBuy);
        final Button bSell = (Button) findViewById(R.id.bSell);

        //action listener for Buy Button
        bBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itemListIntent = new Intent(BuySellActivity.this, ItemList.class);
                BuySellActivity.this.startActivity(itemListIntent);
            }
        });

        //action listener for Sell Button
        bSell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itemRegisterIntent = new Intent(BuySellActivity.this, ItemRegister.class);
                BuySellActivity.this.startActivity(itemRegisterIntent);
            }
        });
    }

}
