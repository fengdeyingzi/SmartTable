package com.mycompany.myapp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.bin.david.form.core.SmartTable;
import com.bin.david.form.data.style.FontStyle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements View.OnClickListener{
    private Button mBtnLogin; //=(Button)findViewById(R.id.btn_login);
    private TextView mTextViewUser;
	SmartTable table;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
		mBtnLogin = (Button) findViewById(R.id.btn_login);
        mTextViewUser = (TextView)findViewById(R.id.textview_user);
        mBtnLogin.setOnClickListener(this);
        
		List<UserInfo> list = new ArrayList<>();
        table = (SmartTable) findViewById(R.id.table);
        list.add(new UserInfo("沈阳",100, 150, 50, 240, 1100, 450, 23458));
        list.add(new UserInfo("沈阳",100, 150, 50, 240, 1100, 450, 23458));
        list.add(new UserInfo("沈阳",100, 150, 50, 240, 1100, 450, 23458));
        list.add(new UserInfo("沈阳",100, 150, 50, 240, 1100, 450, 23458));
        list.add(new UserInfo("乌鲁木齐",100, 150, 50, 240, 1100, 450, 23458));
        list.add(new UserInfo("乌鲁木齐",100, 150, 50, 240, 1100, 450, 23458));
        list.add(new UserInfo("乌鲁木齐",100, 150, 50, 240, 1100, 450, 23458));
        list.add(new UserInfo("乌鲁木齐",100, 150, 50, 240, 1100, 450, 23458));
        list.add(new UserInfo("沈阳",100, 150, 50, 240, 1100, 450, 23458));
        list.add(new UserInfo("沈阳",100, 150, 50, 240, 1100, 450, 23458));
        list.add(new UserInfo("沈阳",100, 150, 50, 240, 1100, 450, 23458));
        list.add(new UserInfo("沈阳",100, 150, 50, 240, 1100, 450, 23458));

        table.setData(list);
        table.getConfig().setContentStyle(new FontStyle(50, Color.BLUE));
		
		
		
    }
    @Override
    public void onClick(View v) {
        mTextViewUser.setText(20);
    }
}
