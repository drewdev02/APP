package com.andreyrodriguezsapplication.app.modules.resigsterorsignup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.andreyrodriguezsapplication.app.modules.resigsterorsignup.`data`.model.ResigsterOrSignUpModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import org.koin.core.KoinComponent

class ResigsterOrSignUpVM : ViewModel(), KoinComponent {
  val resigsterOrSignUpModel: MutableLiveData<ResigsterOrSignUpModel> =
      MutableLiveData(ResigsterOrSignUpModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount
}
