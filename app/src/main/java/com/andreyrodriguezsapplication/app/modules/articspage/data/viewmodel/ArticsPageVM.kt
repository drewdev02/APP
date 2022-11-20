package com.andreyrodriguezsapplication.app.modules.articspage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.andreyrodriguezsapplication.app.modules.articspage.`data`.model.ArticsPageModel
import org.koin.core.KoinComponent

class ArticsPageVM : ViewModel(), KoinComponent {
  val articsPageModel: MutableLiveData<ArticsPageModel> = MutableLiveData(ArticsPageModel())

  var navArguments: Bundle? = null
}
