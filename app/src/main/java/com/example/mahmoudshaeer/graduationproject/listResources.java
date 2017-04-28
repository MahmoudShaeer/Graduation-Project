package com.example.mahmoudshaeer.graduationproject;

import android.app.FragmentManager;
import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

/**
 * Created by mahmoud Shaeer on 4/14/2017.
 */

class listResources extends BaseAdapter
{
    ArrayList<InfoObject> mydata=new ArrayList<>();
    Context context;
    listResources(Context context)
    {
        this.context=context;
        PackageInformation p1=new PackageInformation(context);
        mydata=p1.getInstalledApps(true);
    }

    @Override
    public int getCount() {
        return mydata.size();
    }

    public void display(String s)
    {
        Toast t1=Toast.makeText(context, "work", Toast.LENGTH_SHORT);
        t1.show();
    }

    @Override
    public Object getItem(int position) {
        return mydata.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        View row=inflater.inflate(R.layout.row_apps,parent,false);

        final TextView application_name = (TextView)row.findViewById(R.id.application_name);

        // TextView number = (TextView)row.findViewById(R.id.np);ap
        application_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //itemclick(v, (String) application_name.getText());
            }
        });
        ImageView application_icone= (ImageView)row.findViewById(R.id.icone_app);
        Switch application_OnOff= (Switch)row.findViewById(R.id.OnOff);
        InfoObject temp=mydata.get(position);

        //  String kk=mydata.get(position);
        application_OnOff.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //function turn off internet
                if(isChecked)
                {
                    Toast.makeText(context, "the "+application_name.getText()+"Can Not Access INTERNET", Toast.LENGTH_SHORT).show();
                    //on
                    // run inter net on the application
                }
                else
                {
                    //off
                    //cut inter net on this app
                }
            }
        });
        application_name.setText(temp.appname);
        application_icone.setImageDrawable(temp.icon);
        //number.setText(Integer.toString(temp.spermission));
        return row;
    }

}

