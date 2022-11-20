package com.andreyrodriguezsapplication.app.modules.homepage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.andreyrodriguezsapplication.app.modules.homepage.`data`.model.HomePageModel
import com.andreyrodriguezsapplication.app.modules.homepage.`data`.model.ListbadguyRowModel
import com.andreyrodriguezsapplication.app.modules.homepage.`data`.model.ListtimeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomePageVM : ViewModel(), KoinComponent {
  val homePageModel: MutableLiveData<HomePageModel> = MutableLiveData(HomePageModel())

  var navArguments: Bundle? = null

  val listbadguyList: MutableLiveData<MutableList<ListbadguyRowModel>> =
      MutableLiveData(mutableListOf())

  val listtimeList: MutableLiveData<MutableList<ListtimeRowModel>> =
      MutableLiveData(mutableListOf())
}
