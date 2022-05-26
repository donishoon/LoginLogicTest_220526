package com.dohn.loginlogictest_220526

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnCheck.setOnClickListener {

//            버튼이 눌리면  > 입력한 id /pw를 변수로 저장

            val inputId = edtId.text.toString()
            val inputPw = edtPassword.text.toString()

            if ( inputId == "admin" && inputPw == "qwer" ) {
                Toast.makeText(this, "관리자님 환영합니다", Toast.LENGTH_SHORT).show()
            }
            
            
            else {
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }



        }

    }
}