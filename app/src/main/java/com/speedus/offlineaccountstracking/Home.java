package com.speedus.offlineaccountstracking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Sudeep on 11/8/2014.
 */
public class Home extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void addAccount(View v)
    {
        Intent intent = new Intent(this,AddAccount.class);
        startActivity(intent);
    }

    public void addTransaction(View v)
    {
        Intent intent = new Intent(this,AddTransaction.class);
        startActivity(intent);
    }


    public void recentTransactions(View v)
    {
        Intent intent = new Intent(this,ListRecentTransactions.class);
        startActivity(intent);
    }
    public void listAccounts(View v)
    {
        Intent intent = new Intent(this,ListAccounts.class);
        startActivity(intent);
    }
    public void searchTransactions(View v)
    {
        Intent intent = new Intent(this,SearchTransactions.class);
        startActivity(intent);
    }

}
