package com.andreyrodriguezsapplication.app.modules.articspage.`data`.model

import com.andreyrodriguezsapplication.app.R
import com.andreyrodriguezsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ArticsPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBillieeilish: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_billie_eilish2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_2_album_67_tr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlbums: String? = MyApp.getInstance().resources.getString(R.string.lbl_albums)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLilbubblegum: String? = MyApp.getInstance().resources.getString(R.string.lbl_lilbubblegum)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHappierThanEv: String? =
      MyApp.getInstance().resources.getString(R.string.msg_happier_than_ev)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDontsmileatm: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dont_smile_at_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSongs: String? = MyApp.getInstance().resources.getString(R.string.lbl_songs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeemore: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDontsmileatmOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dont_smile_at_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBillieEilishOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_billie_eilish)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLilbubblegumOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_lilbubblegum)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBillieeilishTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_billie_eilish3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_33)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_33)

)
