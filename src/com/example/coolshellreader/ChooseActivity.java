package com.example.coolshellreader;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * 用户信息设置
 * @author hongyehwy
 *
 */
public class ChooseActivity  extends PreferenceActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.localchoose);
	}
	
	
}
