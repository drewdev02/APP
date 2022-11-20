package com.andreyrodriguezsapplication.app.modules.musicpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.andreyrodriguezsapplication.app.R
import com.andreyrodriguezsapplication.app.appcomponents.base.BaseActivity
import com.andreyrodriguezsapplication.app.databinding.ActivityMusicPageBinding
import com.andreyrodriguezsapplication.app.modules.musicpage.`data`.viewmodel.MusicPageVM
import kotlin.String
import kotlin.Unit

class MusicPageActivity : BaseActivity<ActivityMusicPageBinding>(R.layout.activity_music_page) {
  private val viewModel: MusicPageVM by viewModels<MusicPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.musicPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MUSIC_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MusicPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
