package com.andreyrodriguezsapplication.app.modules.musicpage.`data`.model

import com.andreyrodriguezsapplication.app.R
import com.andreyrodriguezsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MusicPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNowplaying: String? = MyApp.getInstance().resources.getString(R.string.lbl_now_playing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBadGuy: String? = MyApp.getInstance().resources.getString(R.string.lbl_bad_guy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBillieEilish: String? = MyApp.getInstance().resources.getString(R.string.lbl_billie_eilish)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwoHundredTwentyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_25)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_02)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLyrics: String? = MyApp.getInstance().resources.getString(R.string.lbl_lyrics)

)
