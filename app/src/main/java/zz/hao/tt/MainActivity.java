package zz.hao.tt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import zz.hao.jni.JNITest;
/*
* DESC: 生成的so库、jar包在source文件夹下，
* 如使用so、jar包方式，则复制到libs目录下，并在build.gradle中把依赖库jni去除
* */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_jni).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, new JNITest().test(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
