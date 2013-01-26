package com.example.coolshellreader;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * ∑¥¿°…Ë÷√
 * @author hongyehwy
 *
 */
public class FeedBackActivity  extends PreferenceActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.feedback);
	}
	
	
}
