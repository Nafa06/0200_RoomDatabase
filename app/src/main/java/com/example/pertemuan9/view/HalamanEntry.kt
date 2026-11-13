package com.example.pertemuan9.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.pertemuan9.viewmodel.DetailsSiswa
import com.example.pertemuan9.viewmodel.UIStateSiswa

@Composable
fun EntrySiswaBody(
    uiStateSiswa: UIStateSiswa,
    onSiswaValueChange: (DetailsSiswa) -> Unit,
    onSaveClick: () -> Unit,
    modifier: Modifier = Modifier
) {}