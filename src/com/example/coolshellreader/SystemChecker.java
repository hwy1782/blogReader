package com.example.coolshellreader;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

/**
 *@author hwy1782@gmail.com
 *@date 2013-1-11下午4:26:19
 **/
public class SystemChecker {
	

	private void dialog(Context context){
		AlertDialog.Builder  builder = new Builder(context);
		builder.setTitle("警告");
		builder.setMessage("WIFI未开启,请开启wifi再查看");
		builder.setPositiveButton("确认", new OnClickListener(){

			@Override
			public void onClick(DialogInterface dialog, int which) {
				 dialog.dismiss();
			}
		});
		
		builder.create().show();
	}
	
	
	public boolean isWiFiActive(Context context) {
        WifiManager mWifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        WifiInfo wifiInfo = mWifiManager.getConnectionInfo();
        int ipAddress = wifiInfo == null ? 0 : wifiInfo.getIpAddress();
        if (!mWifiManager.isWifiEnabled() || ipAddress == 0) {
        	dialog(context);
        	return false;
        } 
        return true;
}
	
}
