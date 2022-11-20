package com.andreyrodriguezsapplication.app.modules.choosemode.`data`.model

import com.andreyrodriguezsapplication.app.R
import com.andreyrodriguezsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChooseModeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChoosemode: String? = MyApp.getInstance().resources.getString(R.string.lbl_choose_mode)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDarkmode: String? = MyApp.getInstance().resources.getString(R.string.lbl_dark_mode)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLightmode: String? = MyApp.getInstance().resources.getString(R.string.lbl_light_mode)

)
