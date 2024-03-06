package com.jetbrains.kmpapp.data.api

import com.jetbrains.kmpapp.data.model.MuseumObject


interface MuseumApi {
    suspend fun getData(): List<MuseumObject>
}
