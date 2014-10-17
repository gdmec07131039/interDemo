package cn.edu.gdmec.s07131032.interdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
	TextView mytv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		mytv = (TextView) findViewById(R.id.textView1);
		String msg = getIntent().getExtras().getString("para1");
		mytv.setText(msg);
	}

}
