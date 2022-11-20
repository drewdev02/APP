package com.andreyrodriguezsapplication.app.modules.loading.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.andreyrodriguezsapplication.app.R
import com.andreyrodriguezsapplication.app.appcomponents.base.BaseActivity
import com.andreyrodriguezsapplication.app.databinding.ActivityLoadingBinding
import com.andreyrodriguezsapplication.app.modules.getstarted.ui.GetStartedActivity
import com.andreyrodriguezsapplication.app.modules.loading.`data`.viewmodel.LoadingVM
import kotlin.String
import kotlin.Unit

class LoadingActivity : BaseActivity<ActivityLoadingBinding>(R.layout.activity_loading) {
  private val viewModel: LoadingVM by viewModels<LoadingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loadingVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = GetStartedActivity.getIntent(this, null)
      startActivity(destIntent)
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "LOADING_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, LoadingActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
