package com.example.pertemuan9.viewmodel

import Siswa
import androidx.lifecycle.ViewModel
import com.example.pertemuan9.repositori.RepositoriSiswa

class HomeViewModel(private val repositoriSiswa: RepositoriSiswa):ViewModel() {

    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }

    data class HomeUiState(
        val listSiswa: List<Siswa> = listOf()
    )
}