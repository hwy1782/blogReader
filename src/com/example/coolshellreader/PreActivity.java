package com.example.coolshellreader;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * 首选项设置
 * @author hongyehwy
 *
 */
public class PreActivity  extends PreferenceActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.prefs);
	}
	
	
}
