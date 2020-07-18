package susu.com.othello.model

import android.content.Context
import susu.com.othello.CustomApplication

class UserSettingsRepository {
    private val context = CustomApplication.appContext
    private val pref = context.getSharedPreferences(UserSettings.PREF_USERSETTINGS_NAME, Context.MODE_PRIVATE)
    private val editor = pref.edit()

}