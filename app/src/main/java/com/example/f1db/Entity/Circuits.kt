package com.example.f1db.Entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "circuits")
data class Circuits(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "circuitId")
    val circuitId:Int,
    @ColumnInfo(name = "circuitRef")
    val circuitRef: String,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "location")
    val location: String,
    @ColumnInfo(name="country")
    val country: String,
    @ColumnInfo(name="lat")
    val lat: Float,
    @ColumnInfo(name="lng")
    val lng:Float,
    @ColumnInfo(name="alt")
    val alt: Int,
    @ColumnInfo(name="url")
    val url: String
)