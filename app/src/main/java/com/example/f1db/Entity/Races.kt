package com.example.f1db.Entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey
import java.sql.Time
import java.util.*

@Entity(tableName = "races", foreignKeys = arrayOf(
    ForeignKey(entity = Circuits::class,
        parentColumns = arrayOf("circuitId"),
        childColumns = arrayOf("circuitId"),
        onDelete = CASCADE
    )))
data class Races(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "raceId")
    val raceId:Int,
    @ColumnInfo(name = "year")
    val year: Int,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "round")
    val round: Int,
    @ColumnInfo(name="date")
    val date: Date,
    @ColumnInfo(name="time")
    val time: Time,
    @ColumnInfo(name="url")
    val url: String,
    @ColumnInfo(name = "circuitId")

    val circuitId : Int
)