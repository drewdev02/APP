package com.andreyrodriguezsapplication.app.modules.articspageone.`data`.model

import com.andreyrodriguezsapplication.app.R
import com.andreyrodriguezsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Listtime1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_33)

)
