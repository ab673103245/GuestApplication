package qianfeng.guestapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class GuestActivity extends AppCompatActivity {


    private RadioGroup mRg_group;
    private Button mBtn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);

        // 使用序列化传输到另一个界面，并且传输完成后，本界面 finish(); ,并且，重写乙里面的backXX方法，目的是，消去它里面调用其父类的方法。
        initInfo();
    }
    private void initInfo()
    {
        OnRadioGroupClick onRadioGroupClick = new OnRadioGroupClick();
        BtnOnClick btnOnClick = new BtnOnClick();
        mBtn_submit = ((Button) findViewById(R.id.btn_submit));
        mBtn_submit.setOnClickListener(btnOnClick);

    }

    private class OnRadioGroupClick implements RadioGroup.OnCheckedChangeListener
    {


        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {

        }
    }

    private class BtnOnClick implements View.OnClickListener{

        private Person person;

        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            person = new Person("zhangsan","剪刀");
            intent.putExtra("person",person);
            startActivity(intent);
            finish();
        }
    }

}
