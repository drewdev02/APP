package com.andreyrodriguezsapplication.app.modules.resigsterorsignuptwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.andreyrodriguezsapplication.app.modules.resigsterorsignuptwo.`data`.model.ResigsterOrSignUpTwoModel
import org.koin.core.KoinComponent

class ResigsterOrSignUpTwoVM : ViewModel(), KoinComponent {
  val resigsterOrSignUpTwoModel: MutableLiveData<ResigsterOrSignUpTwoModel> =
      MutableLiveData(ResigsterOrSignUpTwoModel())

  var navArguments: Bundle? = null
}
