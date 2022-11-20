package com.andreyrodriguezsapplication.app.modules.musicpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.andreyrodriguezsapplication.app.modules.musicpage.`data`.model.MusicPageModel
import org.koin.core.KoinComponent

class MusicPageVM : ViewModel(), KoinComponent {
  val musicPageModel: MutableLiveData<MusicPageModel> = MutableLiveData(MusicPageModel())

  var navArguments: Bundle? = null
}
