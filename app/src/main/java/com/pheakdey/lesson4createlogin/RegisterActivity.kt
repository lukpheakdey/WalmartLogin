package com.pheakdey.lesson4createlogin

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register.*


class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btn_sign_up.setOnClickListener {
            var firstName = et_frist_name.text.toString()
            var lastName = et_last_name.text.toString()
            var email = et_email.text.toString()
            var password = et_password.text.toString()

            if(!firstName.toString().equals("") && !lastName.toString().equals("") && !email.toString().equals(
                    ""
                ) && !password.toString().equals("")){
                //Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
                //val resultIntent = Intent(this, MainActivity::class.java)
                var resultIntent = Intent()
                resultIntent.putExtra("email", email)
                resultIntent.putExtra("password", password)
                resultIntent.putExtra("firstname", firstName)
                resultIntent.putExtra("lastname", lastName)
                setResult(RESULT_OK, resultIntent)
                //startActivity(resultIntent)
                finish()
            } else {
                Toast.makeText(this, "Please enter again", Toast.LENGTH_SHORT).show()
            }
        }
    }


}