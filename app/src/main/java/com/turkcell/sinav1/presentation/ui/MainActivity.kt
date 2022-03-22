package com.turkcell.sinav1.presentation.ui

import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import androidx.appcompat.app.AppCompatActivity
import com.turkcell.sinav1.R
import com.turkcell.sinav1.databinding.ActivityMainBinding
import com.turkcell.sinav1.util.Constants.DEFAULT_PASSWORD
import com.turkcell.sinav1.util.Constants.DEFAULT_TEL_NO
import com.turkcell.sinav1.util.Constants.DID_LOG_IN
import com.turkcell.sinav1.util.toast

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var intentToProductScreen: Intent
    private var eyeState = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intentToProductScreen = Intent(this, ProductsActivity::class.java)

        binding.buttonContinue.setOnClickListener {
            DID_LOG_IN = false
            startActivity(intentToProductScreen)
        }

        binding.buttonLogin.setOnClickListener {
            val telNo = binding.editTextTelNo.text.toString()
            val password = binding.editTextPassword.text.toString()

            checkUserInputState(telNo, password)
        }

        binding.pastePin.setOnClickListener {
            checkPasswordEditTextEyeState()
        }

    }

    private fun checkPasswordEditTextEyeState() {
        if (eyeState == 0) {
            binding.pastePin.setImageResource(R.drawable.ic_visibility_off)
            binding.editTextPassword.transformationMethod = HideReturnsTransformationMethod()
            eyeState = 1
        } else {
            binding.pastePin.setImageResource(R.drawable.ic_visibility_on)
            binding.editTextPassword.transformationMethod = HideReturnsTransformationMethod()
            binding.editTextPassword.transformationMethod = PasswordTransformationMethod()
            eyeState = 0
        }
    }

    private fun checkUserInputState(telNo: String, password: String) {
        if (telNo.isNotEmpty() && password.isNotEmpty()) {
            if (telNo == DEFAULT_TEL_NO && password == DEFAULT_PASSWORD) {
                startActivity(intentToProductScreen)
                DID_LOG_IN = true
                finish()
            } else {
                this.toast(getString(R.string.input_error))
            }
        } else {
            this.toast(getString(R.string.fill_in_the_blanks))
        }
    }

}