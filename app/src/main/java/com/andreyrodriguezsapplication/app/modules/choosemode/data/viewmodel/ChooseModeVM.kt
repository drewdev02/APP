package com.andreyrodriguezsapplication.app.modules.choosemode.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.andreyrodriguezsapplication.app.modules.choosemode.`data`.model.ChooseModeModel
import org.koin.core.KoinComponent

class ChooseModeVM : ViewModel(), KoinComponent {
  val chooseModeModel: MutableLiveData<ChooseModeModel> = MutableLiveData(ChooseModeModel())

  var navArguments: Bundle? = null
}
