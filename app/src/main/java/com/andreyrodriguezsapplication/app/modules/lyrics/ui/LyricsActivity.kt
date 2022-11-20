package com.andreyrodriguezsapplication.app.modules.lyrics.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.andreyrodriguezsapplication.app.R
import com.andreyrodriguezsapplication.app.appcomponents.base.BaseActivity
import com.andreyrodriguezsapplication.app.databinding.ActivityLyricsBinding
import com.andreyrodriguezsapplication.app.modules.lyrics.`data`.viewmodel.LyricsVM
import kotlin.String
import kotlin.Unit

class LyricsActivity : BaseActivity<ActivityLyricsBinding>(R.layout.activity_lyrics) {
  private val viewModel: LyricsVM by viewModels<LyricsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.lyricsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LYRICS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LyricsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
