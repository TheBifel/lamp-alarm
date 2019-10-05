package dev.bifel.lampalarm

import android.app.Application
import dev.bifel.lampalarm.di.repositoryModule
import dev.bifel.lampalarm.di.retrofitModule
import org.koin.android.ext.android.startKoin
import org.koin.standalone.KoinComponent

/**
 * Date: 05.10.2019
 * Time: 2:58
 *
 * @author Bohdan Ishchenko
 */
class App : Application(), KoinComponent {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(retrofitModule, repositoryModule))
    }
}
