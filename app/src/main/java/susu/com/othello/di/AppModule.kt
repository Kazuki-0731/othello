package susu.com.othello.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module
import susu.com.othello.view.fragment.FirstFragment
import susu.com.othello.viewmodel.MainViewModel

val appModule = module {
    factory { FirstFragment() }

    viewModel { MainViewModel(androidContext() as Application) }
}