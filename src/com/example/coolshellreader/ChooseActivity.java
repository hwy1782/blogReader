package com.example.coolshellreader;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * �û���Ϣ����
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
