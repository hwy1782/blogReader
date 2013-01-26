package com.example.coolshellreader;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.backgrand.DomParser;
import com.backgrand.ReaderService;
import com.backgrand.impl.CoolShellDOMParser;
import com.backgrand.other.CoolShellConstants;
import com.backgrand.other.ViewRender;

/**
 * 主界面
 * 
 * @author hongyehwy
 */
public class ReadActivity extends Activity  implements OnClickListener{
	private final String TAG = "ReadActivity";
	
	TextView content;
	Button showButton;
	String articleSummary;
	SystemChecker sysChecker;
	
    @SuppressLint("NewApi")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);
        
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        
        content = (TextView)findViewById(R.id.contentView);
        showButton = (Button)findViewById(R.id.buttonShow);
        
        showButton.setOnClickListener(this);
    }

    /**
     * 引入“设置”按钮
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	MenuInflater inflater = getMenuInflater();
    	inflater.inflate(R.menu.menu, menu);
    	return true;
    }
    
    /**
     * 触发“设置”按钮
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch (item.getItemId()) {
		case R.id.itemSetting:
			startActivity(new Intent(this,PreActivity.class));
			break;
		case R.id.feedBack:
			startActivity(new Intent(this,FeedBackActivity.class));
			break;
		default:
			break;
		}
    	return true;
    }
    
    /**
     * 异步获取web信息
     * @author hongyehwy
     *
     */
    class ArticleGatherer extends AsyncTask<String, Integer, String>{

		@Override
		protected String doInBackground(String... params) {
			ReaderService service = new ReaderService();
			DomParser parser = new CoolShellDOMParser();
			articleSummary = new ViewRender().genHtml4Text(parser.parseHtml(service.getDocumentFromRemote()).getModule());
			return articleSummary;
		}
		
		@Override
		protected void onPostExecute(String result) {
			Toast.makeText(ReadActivity.this, CoolShellConstants.GATHERER_ARTICLE_SUCCESS, Toast.LENGTH_LONG).show();
		}
		
		@Override
		protected void onProgressUpdate(Integer... values) {
			super.onProgressUpdate(values);
		}
    	
    }
    
    
	@Override
	public void onClick(View v) {
		sysChecker = new SystemChecker();
		// WIFI 未链接直接返回
		if(!sysChecker.isWiFiActive(v.getContext())){
			return;
		}
		
		articleSummary = new ArticleGatherer().doInBackground(null);
		content.setText(Html.fromHtml(articleSummary));
		content.setMovementMethod(LinkMovementMethod.getInstance());
		Log.d(TAG, "onClicked");
	}
    
}
