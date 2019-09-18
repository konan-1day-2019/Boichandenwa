package com.example.boichandenwa2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CallingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calling);

        class CallingActivity.java extends MainActivity.java{
            public void callingForNumber{
                double id = 09081286582;
                System.out.println(id);
                System.out.println("発信中");
            }

            public void callingFromNumber {
                double id = 09081286582;
                System.out.println(id);
                System.out.println("受信中");
            }
        }

    }
}








        //画面遷移プログラム　デモ
        /*Button nextButton = (Button)findViewById(R.id.button2);
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CallingActivity.class);
                startActivity(intent);
            }
        });
         */

        //Uri uri = Uri.parse("tel:1111111111");
        //Intent i = new Intent(Intent.ACTION_DIAL,uri);
        //startActivity(i);

    }
}
