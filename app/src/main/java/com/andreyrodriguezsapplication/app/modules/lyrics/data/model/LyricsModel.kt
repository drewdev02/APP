package com.andreyrodriguezsapplication.app.modules.lyrics.`data`.model

import com.andreyrodriguezsapplication.app.R
import com.andreyrodriguezsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LyricsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBadGuy: String? = MyApp.getInstance().resources.getString(R.string.lbl_bad_guy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_verse_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_sleepin_you_r)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_verse_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sleepin_you_r)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBadGuyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_bad_guy)
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

)
