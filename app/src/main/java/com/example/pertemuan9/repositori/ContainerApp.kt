package com.example.roomdb.repositori

import DatabaseSiswa
import android.content.Context
import com.example.pertemuan9.repositori.OfflineRepositoriSiswa
import com.example.pertemuan9.repositori.RepositoriSiswa

interface ContainerApp {
    val repositoriSiswa : RepositoriSiswa
}

class ContainerDataApp(private val context: Context): ContainerApp{
    override val repositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSiswa(DatabaseSiswa.getDatabase(context).siswaDao())
    }
}