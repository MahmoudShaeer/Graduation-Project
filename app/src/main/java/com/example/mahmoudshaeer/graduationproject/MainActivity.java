package com.example.mahmoudshaeer.graduationproject;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    Button login;

    DatabaseReference datauser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=(Button)findViewById(R.id.login_btn);
        datauser= FirebaseDatabase.getInstance().getReference("users");

    }

    public void checkvalid(View view)
    {
      //  WifiManager wifiManager = (WifiManager) getSystemService(Context.WIFI_SERVICE);
       // WifiInfo wInfo = wifiManager.getConnectionInfo();
        //final String macAddress = wInfo.getMacAddress();


//         final ArrayList<String > arr=new ArrayList<>();

  //      datauser.addValueEventListener(new ValueEventListener() {
      //      @Override
    //        public void onDataChange(DataSnapshot dataSnapshot) {

        //        if (!dataSnapshot.hasChild(macAddress)) {

                    Toast.makeText(MainActivity.this, "go", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Home.class);
                    startActivity(intent);
          //          return;
            //    } else {
              //      datauser.setValue(macAddress);
                //    Toast.makeText(MainActivity.this, "added", Toast.LENGTH_SHORT).show();
                //}
            //}

            //@Override
            //public void onCancelled(DatabaseError databaseError) {

            //}
        //});
    }


}
