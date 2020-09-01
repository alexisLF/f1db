package com.example.f1db.Entity

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import java.lang.reflect.Constructor

data class Qualifying(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "qualifyId")
    val qualifyId: Int,
    @ColumnInfo(name = "raceId")
    val raceId : Int,
    @ColumnInfo(name = "driverId")
    val driverId: Int,
    @ColumnInfo(name = "constructorId")
    val constructorId: Int,
    @ColumnInfo(name = "number")
    val number :Int,
    @ColumnInfo(name = "position")
    val position: Int,
    @ColumnInfo(name = "q1")
    val q1 : String,
    @ColumnInfo(name = "q2")
    val q2 : String,
    @ColumnInfo(name = "q3")
    val q3 : String
)