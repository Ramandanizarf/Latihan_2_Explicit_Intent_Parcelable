package com.example.latihan2

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Mahasiswa(
    val nama: String,
    val nim: String,
    val prodi: String
) : Parcelable
