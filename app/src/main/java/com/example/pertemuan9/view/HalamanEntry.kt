package com.example.pertemuan9.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.example.pertemuan9.R
import com.example.pertemuan9.viewmodel.DetailsSiswa
import com.example.pertemuan9.viewmodel.UIStateSiswa

@Composable
fun EntrySiswaBody(
    uiStateSiswa: UIStateSiswa,
    onSiswaValueChange: (DetailsSiswa) -> Unit,
    onSaveClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_large)),
        modifier = modifier.padding(dimensionResource(id = R.dimen.padding_medium))
    ) {}
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormInputSiswa(
    detailsSiswa: DetailsSiswa,
    modifier: Modifier = Modifier,
    onValueChange: (DetailsSiswa) -> Unit = {},
    enabled: Boolean = true
) {}