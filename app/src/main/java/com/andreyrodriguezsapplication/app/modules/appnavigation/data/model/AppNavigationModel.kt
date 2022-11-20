package com.andreyrodriguezsapplication.app.modules.appnavigation.`data`.model

import com.andreyrodriguezsapplication.app.R
import com.andreyrodriguezsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoading: String? = MyApp.getInstance().resources.getString(R.string.lbl_loading)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGetStarted: String? = MyApp.getInstance().resources.getString(R.string.lbl_get_started2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChooseMode: String? = MyApp.getInstance().resources.getString(R.string.lbl_choose_mode2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResigsterOrSignUpOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_resigster_or_si)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResigsterOrSignUp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_resigster_or_si2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResigsterOrSignUpTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_resigster_or_si3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMusicPage: String? = MyApp.getInstance().resources.getString(R.string.lbl_music_page)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomePage: String? = MyApp.getInstance().resources.getString(R.string.lbl_home_page)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLyrics: String? = MyApp.getInstance().resources.getString(R.string.lbl_lyrics2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArticsPageOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_artics_page_one)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArticsPage: String? = MyApp.getInstance().resources.getString(R.string.lbl_artics_page)

)
