package com.andreyrodriguezsapplication.app.modules.articspage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.andreyrodriguezsapplication.app.R
import com.andreyrodriguezsapplication.app.appcomponents.base.BaseActivity
import com.andreyrodriguezsapplication.app.appcomponents.views.TimePickerFragment
import com.andreyrodriguezsapplication.app.databinding.ActivityArticsPageBinding
import com.andreyrodriguezsapplication.app.modules.articspage.`data`.viewmodel.ArticsPageVM
import java.util.Date
import kotlin.String
import kotlin.Unit

class ArticsPageActivity : BaseActivity<ActivityArticsPageBinding>(R.layout.activity_artics_page) {
  private val viewModel: ArticsPageVM by viewModels<ArticsPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.articsPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowtime.setOnClickListener {
      val destinationInstance = TimePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, TimePickerFragment.TAG) {
          selectedTime ->
        onTimeSelectedLinearRowtime(selectedTime)
      }
    }
    binding.linearRowtimeOne.setOnClickListener {
      val destinationInstance = TimePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, TimePickerFragment.TAG) {
          selectedTime ->
        onTimeSelectedLinearRowtimeOne(selectedTime)
      }
    }
  }

  private fun onTimeSelectedLinearRowtime(selectedTime: Date) {
  }

  private fun onTimeSelectedLinearRowtimeOne(selectedTime: Date) {
  }

  companion object {
    const val TAG: String = "ARTICS_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ArticsPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
