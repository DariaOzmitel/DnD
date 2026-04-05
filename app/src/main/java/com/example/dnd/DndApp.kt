package com.example.dnd

import android.app.Application
import com.example.core_network.di.networkModule
import com.example.feature_spell_list.di.spellsModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class DndApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@DndApp)
            modules(listOf(spellsModule, networkModule))
        }
    }
}