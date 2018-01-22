package com.android.qz.app_for_family;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static java.util.Arrays.asList;
import android.content.BroadcastReceiver;
import android.content.Context;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView friendListView = (ListView) findViewById(R.id.listView);
        final ArrayList<String> myFamily = new ArrayList<String>(asList("Amy ","Alice","Andrew(broadcast)"));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);
        friendListView.setAdapter(arrayAdapter);

        friendListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                /*
                if (position == 2){
                    Toast.makeText(getApplicationContext(), "Andrew is for common broadcast",Toast.LENGTH_LONG).show();
                    Log.i("Andrew's app", "calling intent");
//                    Intent intent = new Intent("CommonBroadcast");
//                    sendBroadcast(intent);
                } else if (position == 1) {
                    Toast.makeText(getApplicationContext(), "Alice is for inner receiver",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent("Demo inner");
                    sendBroadcast(intent);
                }
                */

                Toast.makeText(getApplicationContext(), "Hello" + myFamily.get(position),Toast.LENGTH_LONG).show();

            }
        });
    }

    /*
    public static class InnerReceiver extends BroadcastReceiver {

        private final String TAG = InnerReceiver.class.getSimpleName();
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.i(TAG, "Inner Receiver called");
            Bundle bundle = getResultExtras(true);

            Toast.makeText(context, "Inner Receiver called", Toast.LENGTH_SHORT).show();

        }
    }
    */
}
