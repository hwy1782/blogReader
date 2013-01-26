package com.backgrand;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import android.app.Application;
import android.util.Log;

/**
 *@author hwy1782@gmail.com
 *@date 2013-1-11ÏÂÎç1:40:02
 **/
public class ReaderService extends Application{
	
	private static final String ACCESS_URL = "http://coolshell.cn/";
	private static final String TAG = "ReaderApplication";

	public synchronized Document getDocumentFromRemote(){
		Document doc = null;
		try {
			if(doc == null){
				doc = Jsoup.connect(ACCESS_URL).timeout(3000).get();
			}
			return doc;
			
		} catch (IOException e) {
			Log.e(TAG, e.getMessage());
		}
		return doc;
	}
	
}
