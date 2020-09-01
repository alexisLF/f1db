package com.example.f1db.Entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "drivers")
data class Driver(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "driverId")
    val driverId: Int,
    @ColumnInfo(name = "driverRef")
    val driverRef: String,
    @ColumnInfo(name = "number")
    val number: Int,
    @ColumnInfo(name = "code")
    val code: String,
    @ColumnInfo(name = "forename")
    val forename: String,
    @ColumnInfo(name = "surname")
    val surname:String,
    @ColumnInfo(name = "dob")
    val birth: Date,
    @ColumnInfo(name = "nationality")
    val nationality: String,
    @ColumnInfo(name = "url")
    val url:String
)