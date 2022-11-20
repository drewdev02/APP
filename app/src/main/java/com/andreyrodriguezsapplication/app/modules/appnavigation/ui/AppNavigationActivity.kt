package com.andreyrodriguezsapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.andreyrodriguezsapplication.app.R
import com.andreyrodriguezsapplication.app.appcomponents.base.BaseActivity
import com.andreyrodriguezsapplication.app.databinding.ActivityAppNavigationBinding
import com.andreyrodriguezsapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.andreyrodriguezsapplication.app.modules.articspage.ui.ArticsPageActivity
import com.andreyrodriguezsapplication.app.modules.articspageone.ui.ArticsPageOneActivity
import com.andreyrodriguezsapplication.app.modules.choosemode.ui.ChooseModeActivity
import com.andreyrodriguezsapplication.app.modules.getstarted.ui.GetStartedActivity
import com.andreyrodriguezsapplication.app.modules.homepage.ui.HomePageActivity
import com.andreyrodriguezsapplication.app.modules.loading.ui.LoadingActivity
import com.andreyrodriguezsapplication.app.modules.lyrics.ui.LyricsActivity
import com.andreyrodriguezsapplication.app.modules.musicpage.ui.MusicPageActivity
import com.andreyrodriguezsapplication.app.modules.resigsterorsignup.ui.ResigsterOrSignUpActivity
import com.andreyrodriguezsapplication.app.modules.resigsterorsignupone.ui.ResigsterOrSignUpOneActivity
import com.andreyrodriguezsapplication.app.modules.resigsterorsignuptwo.ui.ResigsterOrSignUpTwoActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearHomePage.setOnClickListener {
      val destIntent = HomePageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMusicPage.setOnClickListener {
      val destIntent = MusicPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearArticsPage.setOnClickListener {
      val destIntent = ArticsPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLyrics.setOnClickListener {
      val destIntent = LyricsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearResigsterOrSignUp.setOnClickListener {
      val destIntent = ResigsterOrSignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearArticsPageOne.setOnClickListener {
      val destIntent = ArticsPageOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLoading.setOnClickListener {
      val destIntent = LoadingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearGetStarted.setOnClickListener {
      val destIntent = GetStartedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearChooseMode.setOnClickListener {
      val destIntent = ChooseModeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearResigsterOrSignUpTwo.setOnClickListener {
      val destIntent = ResigsterOrSignUpTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearResigsterOrSignUpOne.setOnClickListener {
      val destIntent = ResigsterOrSignUpOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
