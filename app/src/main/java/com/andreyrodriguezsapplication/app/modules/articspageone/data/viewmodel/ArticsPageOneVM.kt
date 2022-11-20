package com.andreyrodriguezsapplication.app.modules.articspageone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.andreyrodriguezsapplication.app.modules.articspageone.`data`.model.ArticsPageOneModel
import com.andreyrodriguezsapplication.app.modules.articspageone.`data`.model.Listtime1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ArticsPageOneVM : ViewModel(), KoinComponent {
  val articsPageOneModel: MutableLiveData<ArticsPageOneModel> =
      MutableLiveData(ArticsPageOneModel())

  var navArguments: Bundle? = null

  val listtimeList: MutableLiveData<MutableList<Listtime1RowModel>> =
      MutableLiveData(mutableListOf())
}
