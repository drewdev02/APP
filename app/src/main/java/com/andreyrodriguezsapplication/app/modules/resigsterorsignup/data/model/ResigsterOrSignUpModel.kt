package com.andreyrodriguezsapplication.app.modules.resigsterorsignup.`data`.model

import com.andreyrodriguezsapplication.app.R
import com.andreyrodriguezsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ResigsterOrSignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSignin: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIfyouneedany: String? =
      MyApp.getInstance().resources.getString(R.string.msg_if_you_need_any)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTwelve: String? = MyApp.getInstance().resources.getString(R.string.msg_enter_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecoverypasswo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recovery_passwo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOr: String? = MyApp.getInstance().resources.getString(R.string.lbl_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotamember: String? = MyApp.getInstance().resources.getString(R.string.msg_not_a_member)

)
