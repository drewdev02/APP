package com.andreyrodriguezsapplication.app.modules.getstarted.`data`.model

import com.andreyrodriguezsapplication.app.R
import com.andreyrodriguezsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GetStartedModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEnjoylistening: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enjoy_listening)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)

)
