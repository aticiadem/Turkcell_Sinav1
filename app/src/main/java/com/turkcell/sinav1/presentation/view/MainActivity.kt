package com.turkcell.sinav1.presentation.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.turkcell.sinav1.R
import com.turkcell.sinav1.databinding.ActivityMainBinding
import com.turkcell.sinav1.util.Constants.DEFAULT_PASSWORD
import com.turkcell.sinav1.util.Constants.DEFAULT_TEL_NO
import com.turkcell.sinav1.util.Constants.INTENT_USER_DID_LOG_IN
import com.turkcell.sinav1.util.toast

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var intentToProductScreen: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intentToProductScreen = Intent(this, ProductsActivity::class.java)

        binding.buttonContinue.setOnClickListener {
            intent.putExtra(INTENT_USER_DID_LOG_IN, false)
            startActivity(intentToProductScreen)
        }

        binding.buttonLogin.setOnClickListener {
            val telNo = binding.editTextTelNo.text.toString()
            val password = binding.editTextPassword.text.toString()

            checkUserInputState(telNo, password)
        }

    }

    private fun checkUserInputState(telNo: String, password: String) {
        if (telNo.isNotEmpty() && password.isNotEmpty()) {
            if (telNo == DEFAULT_TEL_NO && password == DEFAULT_PASSWORD) {
                intent.putExtra(INTENT_USER_DID_LOG_IN, true)
                startActivity(intentToProductScreen)
                finish()
            } else {
                this.toast(getString(R.string.input_error))
            }
        } else {
            this.toast(getString(R.string.fill_in_the_blanks))
        }
    }

}