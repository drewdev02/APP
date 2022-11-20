package com.andreyrodriguezsapplication.app.modules.resigsterorsignupone.`data`.model

import com.andreyrodriguezsapplication.app.R
import com.andreyrodriguezsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ResigsterOrSignUpOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEnjoylistening: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enjoy_listening)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_spotify_is_a_pr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRegister: String? = MyApp.getInstance().resources.getString(R.string.lbl_register)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignin: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)

)
