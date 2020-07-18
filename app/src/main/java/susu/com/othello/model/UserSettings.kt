package susu.com.othello.model

data class UserSettings(
    var themeId: Int,
    var themeName: String,
    var themeResId: Int,
    var time: Int) {

    companion object {
        const val PREF_USERSETTINGS_NAME = "susu.com.othello"
    }
}