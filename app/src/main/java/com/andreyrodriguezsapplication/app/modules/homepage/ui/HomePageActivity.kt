package com.andreyrodriguezsapplication.app.modules.homepage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.andreyrodriguezsapplication.app.R
import com.andreyrodriguezsapplication.app.appcomponents.base.BaseActivity
import com.andreyrodriguezsapplication.app.databinding.ActivityHomePageBinding
import com.andreyrodriguezsapplication.app.modules.homepage.`data`.model.ListbadguyRowModel
import com.andreyrodriguezsapplication.app.modules.homepage.`data`.model.ListtimeRowModel
import com.andreyrodriguezsapplication.app.modules.homepage.`data`.viewmodel.HomePageVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomePageActivity : BaseActivity<ActivityHomePageBinding>(R.layout.activity_home_page) {
  private val viewModel: HomePageVM by viewModels<HomePageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listbadguyAdapter = ListbadguyAdapter(viewModel.listbadguyList.value?:mutableListOf())
    binding.recyclerListbadguy.adapter = listbadguyAdapter
    listbadguyAdapter.setOnItemClickListener(
    object : ListbadguyAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListbadguyRowModel) {
        onClickRecyclerListbadguy(view, position, item)
      }
    }
    )
    viewModel.listbadguyList.observe(this) {
      listbadguyAdapter.updateData(it)
    }
    val listtimeAdapter = ListtimeAdapter(viewModel.listtimeList.value?:mutableListOf())
    binding.recyclerListtime.adapter = listtimeAdapter
    listtimeAdapter.setOnItemClickListener(
    object : ListtimeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListtimeRowModel) {
        onClickRecyclerListtime(view, position, item)
      }
    }
    )
    viewModel.listtimeList.observe(this) {
      listtimeAdapter.updateData(it)
    }
    binding.homePageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListbadguy(
    view: View,
    position: Int,
    item: ListbadguyRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListtime(
    view: View,
    position: Int,
    item: ListtimeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOME_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomePageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
