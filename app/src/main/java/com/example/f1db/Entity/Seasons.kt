package com.example.f1db.Entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "seasons")
data class Seasons(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "year")
    val year : Int,
    @ColumnInfo(name = "url")
    val url : String
)