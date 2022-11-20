package com.andreyrodriguezsapplication.app.modules.homepage.`data`.model

import com.andreyrodriguezsapplication.app.R
import com.andreyrodriguezsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomePageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNewalbum: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_album)
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
  var txtBillieEilish: String? = MyApp.getInstance().resources.getString(R.string.lbl_billie_eilish)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNews: String? = MyApp.getInstance().resources.getString(R.string.lbl_news)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVideo: String? = MyApp.getInstance().resources.getString(R.string.lbl_video)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArtists: String? = MyApp.getInstance().resources.getString(R.string.lbl_artists)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPodcast: String? = MyApp.getInstance().resources.getString(R.string.lbl_podcast)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlaylist: String? = MyApp.getInstance().resources.getString(R.string.lbl_playlist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeemore: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAsItWas: String? = MyApp.getInstance().resources.getString(R.string.lbl_as_it_was)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHarryStyles: String? = MyApp.getInstance().resources.getString(R.string.lbl_harry_styles)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGodDid: String? = MyApp.getInstance().resources.getString(R.string.lbl_god_did)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDJKhaled: String? = MyApp.getInstance().resources.getString(R.string.lbl_dj_khaled)

)
