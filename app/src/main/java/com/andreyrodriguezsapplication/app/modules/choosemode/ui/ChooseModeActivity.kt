package com.andreyrodriguezsapplication.app.modules.choosemode.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.andreyrodriguezsapplication.app.R
import com.andreyrodriguezsapplication.app.appcomponents.base.BaseActivity
import com.andreyrodriguezsapplication.app.databinding.ActivityChooseModeBinding
import com.andreyrodriguezsapplication.app.modules.choosemode.`data`.viewmodel.ChooseModeVM
import kotlin.String
import kotlin.Unit

class ChooseModeActivity : BaseActivity<ActivityChooseModeBinding>(R.layout.activity_choose_mode) {
  private val viewModel: ChooseModeVM by viewModels<ChooseModeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.chooseModeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CHOOSE_MODE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChooseModeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
