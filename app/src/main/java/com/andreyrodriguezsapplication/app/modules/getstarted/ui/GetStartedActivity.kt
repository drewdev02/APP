package com.andreyrodriguezsapplication.app.modules.getstarted.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.andreyrodriguezsapplication.app.R
import com.andreyrodriguezsapplication.app.appcomponents.base.BaseActivity
import com.andreyrodriguezsapplication.app.databinding.ActivityGetStartedBinding
import com.andreyrodriguezsapplication.app.modules.getstarted.`data`.viewmodel.GetStartedVM
import kotlin.String
import kotlin.Unit

class GetStartedActivity : BaseActivity<ActivityGetStartedBinding>(R.layout.activity_get_started) {
  private val viewModel: GetStartedVM by viewModels<GetStartedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.getStartedVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "GET_STARTED_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GetStartedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
