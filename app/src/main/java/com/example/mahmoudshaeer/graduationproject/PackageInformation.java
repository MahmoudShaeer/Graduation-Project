package com.example.mahmoudshaeer.graduationproject;

import android.app.Service;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;

import java.util.ArrayList;
import java.util.List;

public class PackageInformation {


    private Context mContext;

    public PackageInformation()
    {

    }

    public PackageInformation(Context context){
        mContext=context;
    }

    public ArrayList<InfoObject> getInstalledApps(boolean getSysPackages){

        PackageManager pm =mContext.getPackageManager();
        List<ApplicationInfo> packages = pm.getInstalledApplications(PackageManager.GET_META_DATA);
        ArrayList<InfoObject> res = new ArrayList<InfoObject>();
        for (ApplicationInfo applicationInfo : packages) {
            InfoObject newInfo = new InfoObject();
                newInfo.appname = applicationInfo.loadLabel(mContext.getPackageManager()).toString();
                newInfo.icon=applicationInfo.loadIcon(pm);
            try {
                PackageInfo packageInfo = pm.getPackageInfo(applicationInfo.packageName, PackageManager.GET_PERMISSIONS);
                PackageInfo packageInfo2 = pm.getPackageInfo(applicationInfo.packageName, PackageManager.GET_SERVICES);
                ServiceInfo[] sarr=packageInfo2.services;
                String[] requestedPermissions = packageInfo.requestedPermissions;
                boolean done=false;
                if(requestedPermissions != null) {
                    for (int i = 0; i < requestedPermissions.length; i++) {
                        if (requestedPermissions[i].contains("INTERNET")) {
                               done=true;
                               break;
                        }
                    }
                }
                if(sarr!=null){
                    if(done==true)
                        res.add(newInfo);
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }return res;
    }

   public InfoObject getitem(int position)
   {
       return this.getInstalledApps(true).get(position);
   }

}
