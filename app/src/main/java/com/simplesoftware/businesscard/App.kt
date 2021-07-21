package com.simplesoftware.businesscard

import android.app.Application
import com.simplesoftware.businesscard.data.AppDataBase
import com.simplesoftware.businesscard.data.BusinessCardRepository

class App: Application() {

    val database by lazy { AppDataBase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}