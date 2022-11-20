package com.andreyrodriguezsapplication.app.modules.homepage.`data`.model

import com.andreyrodriguezsapplication.app.R
import com.andreyrodriguezsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListbadguyRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBadGuy: String? = MyApp.getInstance().resources.getString(R.string.lbl_bad_guy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScorpion: String? = MyApp.getInstance().resources.getString(R.string.lbl_scorpion)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_when_we_all_fal)

)
