package com.andreyrodriguezsapplication.app.modules.resigsterorsignupone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.andreyrodriguezsapplication.app.modules.resigsterorsignupone.`data`.model.ResigsterOrSignUpOneModel
import org.koin.core.KoinComponent

class ResigsterOrSignUpOneVM : ViewModel(), KoinComponent {
  val resigsterOrSignUpOneModel: MutableLiveData<ResigsterOrSignUpOneModel> =
      MutableLiveData(ResigsterOrSignUpOneModel())

  var navArguments: Bundle? = null
}
