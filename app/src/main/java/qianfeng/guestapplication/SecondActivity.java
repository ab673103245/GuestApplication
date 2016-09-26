package qianfeng.guestapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class SecondActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initInfo();

    }

    // 重写返回键，是在乙界面中完成
    private void initInfo() {
        Button button = (Button) findViewById(R.id.btn_submit);
        BtnOnClick btnOnClick = new BtnOnClick();
        button.setOnClickListener(btnOnClick);

    }

    private class OnRadioGroupClick implements RadioGroup.OnCheckedChangeListener {


        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {

        }
    }

    private class BtnOnClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            // 获取序列化信息，并判断结果。改变mBtn_submit2的值，持续3.5秒，然后还原。
            // 必须要 等 3.5秒显示完之后，才可以使用 返回按钮 ， 即没有提交之前的返回按钮都不管用。
            // 在这里获取序列化信息，并废除返回结果
            // 在3.5秒的方法内，重写onBackPressed(),使其有功能

            //反序列化

            Intent intent =getIntent();
            Person person = (Person)(intent.getSerializableExtra("person"));
            System.out.println("----------------->"+person);
            Log.d("qianfeng", "0----------------->" + person);

        }
    }

}