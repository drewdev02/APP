package com.andreyrodriguezsapplication.app.modules.articspageone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.andreyrodriguezsapplication.app.R
import com.andreyrodriguezsapplication.app.appcomponents.base.BaseActivity
import com.andreyrodriguezsapplication.app.databinding.ActivityArticsPageOneBinding
import com.andreyrodriguezsapplication.app.modules.articspageone.`data`.model.Listtime1RowModel
import com.andreyrodriguezsapplication.app.modules.articspageone.`data`.viewmodel.ArticsPageOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ArticsPageOneActivity :
    BaseActivity<ActivityArticsPageOneBinding>(R.layout.activity_artics_page_one) {
  private val viewModel: ArticsPageOneVM by viewModels<ArticsPageOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listtimeAdapter = ListtimeAdapter(viewModel.listtimeList.value?:mutableListOf())
    binding.recyclerListtime.adapter = listtimeAdapter
    listtimeAdapter.setOnItemClickListener(
    object : ListtimeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listtime1RowModel) {
        onClickRecyclerListtime(view, position, item)
      }
    }
    )
    viewModel.listtimeList.observe(this) {
      listtimeAdapter.updateData(it)
    }
    binding.articsPageOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListtime(
    view: View,
    position: Int,
    item: Listtime1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ARTICS_PAGE_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ArticsPageOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
