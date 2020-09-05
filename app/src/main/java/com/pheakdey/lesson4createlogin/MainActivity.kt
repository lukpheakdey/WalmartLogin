package com.pheakdey.lesson4createlogin

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*
import kotlin.toString as toString1

class MainActivity : AppCompatActivity() {
    private val REQUEST_CODE_CREATE_ACCOUNT = 1001
    public var userList: ArrayList<User> = ArrayList()
    var flag = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var user1 = User("user1", "luser1", "user1@gmail.com", "12345")
        val user2 = User("user2", "luser2", "user2@gmail.com", "12345")
        val user3 = User("user3", "luser3", "user4@gmail.com", "12345")
        val user4 = User("user4", "luser4", "user4@gmail.com", "12345")
        val user5 = User("user5", "luser5", "user5@gmail.com", "12345")
        userList.add(user1)
        userList.add(user2)
        userList.add(user3)
        userList.add(user4)
        userList.add(user5)

        btnSignIn.setOnClickListener {
            val email = input_email.text.toString()
            val password = input_password.text.toString()

            for(u in userList){
                if(u.email.toString1().equals(email) && u.password.toString1().equals(password))
                    flag = 1
            }
            if(flag==1){
                Toast.makeText(this, "Welcome to shopping cart", Toast.LENGTH_SHORT).show()
                var intent = Intent(this, ShoppingCategoryActivity::class.java)
                intent.putExtra("shopping_category", email)
                startActivity(intent)
            } else
                Toast.makeText(this, "Invalid email and password", Toast.LENGTH_SHORT).show()
        }

        btnSignUp.setOnClickListener {
            var intent = Intent(this, RegisterActivity::class.java)
            startActivityForResult(intent, REQUEST_CODE_CREATE_ACCOUNT)
        }

        txtForgetPassword.setOnClickListener {
            var forgetEmail = input_email.text.toString()
            var forgetPassword = input_password.text.toString()

            if(!forgetEmail.equals("") && !forgetPassword.equals("")){
                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra("ForgetPassword", forgetEmail)
                intent.type = "text/palin"
                startActivity((Intent.createChooser(intent, "Please select app")))
            }  else {
                Toast.makeText(this, "Forget Email or password is empty", Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == REQUEST_CODE_CREATE_ACCOUNT && resultCode == RESULT_OK){
            var email = data?.getStringExtra("email")
            var password = data?.getStringExtra("password")
            var firstname = data?.getStringExtra("firstname")
            var lastname = data?.getStringExtra("lastname")
            userList.add(User(firstname, lastname, email, password))
            Toast.makeText(this, "Successfully create ${email} Please login again", Toast.LENGTH_LONG).show()
        }
    }


}