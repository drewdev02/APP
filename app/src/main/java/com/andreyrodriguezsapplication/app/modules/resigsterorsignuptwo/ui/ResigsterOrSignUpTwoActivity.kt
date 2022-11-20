package com.andreyrodriguezsapplication.app.modules.resigsterorsignuptwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.andreyrodriguezsapplication.app.R
import com.andreyrodriguezsapplication.app.appcomponents.base.BaseActivity
import com.andreyrodriguezsapplication.app.databinding.ActivityResigsterOrSignUpTwoBinding
import com.andreyrodriguezsapplication.app.modules.resigsterorsignuptwo.`data`.viewmodel.ResigsterOrSignUpTwoVM
import kotlin.String
import kotlin.Unit

class ResigsterOrSignUpTwoActivity :
    BaseActivity<ActivityResigsterOrSignUpTwoBinding>(R.layout.activity_resigster_or_sign_up_two) {
  private val viewModel: ResigsterOrSignUpTwoVM by viewModels<ResigsterOrSignUpTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.resigsterOrSignUpTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "RESIGSTER_OR_SIGN_UP_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ResigsterOrSignUpTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
