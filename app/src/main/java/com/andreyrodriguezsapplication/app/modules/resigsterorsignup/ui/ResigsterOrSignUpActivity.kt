package com.andreyrodriguezsapplication.app.modules.resigsterorsignup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.andreyrodriguezsapplication.app.R
import com.andreyrodriguezsapplication.app.appcomponents.base.BaseActivity
import com.andreyrodriguezsapplication.app.appcomponents.googleauth.GoogleHelper
import com.andreyrodriguezsapplication.app.databinding.ActivityResigsterOrSignUpBinding
import com.andreyrodriguezsapplication.app.modules.resigsterorsignup.`data`.viewmodel.ResigsterOrSignUpVM
import kotlin.String
import kotlin.Unit

class ResigsterOrSignUpActivity :
    BaseActivity<ActivityResigsterOrSignUpBinding>(R.layout.activity_resigster_or_sign_up) {
  private val viewModel: ResigsterOrSignUpVM by viewModels<ResigsterOrSignUpVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.resigsterOrSignUpVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.imageGoogle.setOnClickListener {
        googleLogin.login()
      }
    }

    companion object {
      const val TAG: String = "RESIGSTER_OR_SIGN_UP_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, ResigsterOrSignUpActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
