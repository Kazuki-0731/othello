package susu.com.othello

import android.app.Application
import android.content.Context
import org.koin.android.ext.android.startKoin
import susu.com.othello.di.appModule

class CustomApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        // 自身の保持
        appContext = this

        // DIの開始
        startKoin(this, listOf(appModule))
    }

    companion object {
        lateinit var appContext: Context
//        lateinit var themeList: ArrayList<ThemeData>
    }
}
