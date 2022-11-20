package com.andreyrodriguezsapplication.app.modules.resigsterorsignupone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.andreyrodriguezsapplication.app.R
import com.andreyrodriguezsapplication.app.appcomponents.base.BaseActivity
import com.andreyrodriguezsapplication.app.databinding.ActivityResigsterOrSignUpOneBinding
import com.andreyrodriguezsapplication.app.modules.resigsterorsignupone.`data`.viewmodel.ResigsterOrSignUpOneVM
import kotlin.String
import kotlin.Unit

class ResigsterOrSignUpOneActivity :
    BaseActivity<ActivityResigsterOrSignUpOneBinding>(R.layout.activity_resigster_or_sign_up_one) {
  private val viewModel: ResigsterOrSignUpOneVM by viewModels<ResigsterOrSignUpOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.resigsterOrSignUpOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "RESIGSTER_OR_SIGN_UP_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ResigsterOrSignUpOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
