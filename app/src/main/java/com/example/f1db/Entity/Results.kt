package com.example.f1db.Entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.sql.Time

@Entity(tableName = "results", foreignKeys = arrayOf(
    ForeignKey(entity = Constructors::class,
        parentColumns = arrayOf("constructorId"),
        childColumns = arrayOf("constructorId"),
        onDelete = ForeignKey.CASCADE
    ),
    ForeignKey(entity = Races::class,
        parentColumns = arrayOf("raceId"),
        childColumns = arrayOf("raceId"),
        onDelete = ForeignKey.CASCADE
    ),
    ForeignKey(entity = Driver::class,
        parentColumns = arrayOf("driverId"),
        childColumns = arrayOf("driverId"),
        onDelete = ForeignKey.CASCADE
    ),
    ForeignKey(entity = Status::class,
        parentColumns = arrayOf("statusId"),
        childColumns = arrayOf("statusId"),
        onDelete = ForeignKey.CASCADE
    )))
data class Results(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "resultId")
    val resultId: Int,
    @ColumnInfo(name = "raceId")
    val raceId: Int ,
    @ColumnInfo(name = "driverId")
    val driverId: Int ,
    @ColumnInfo(name = "constructorId")
    val constructorId: Int ,
    @ColumnInfo(name = "number")
    val number: Int ,
    @ColumnInfo(name = "grid")
    val grid: Int,
    @ColumnInfo(name = "position")
    val position: Int ,
    @ColumnInfo(name = "positionText")
    val positionText: String,
    @ColumnInfo(name = "positionOrder")
    val positionOrder: Int,
    @ColumnInfo(name = "points")
    val points: Float ,
    @ColumnInfo(name = "laps")
    val laps: Int,
    @ColumnInfo(name = "time")
    val time: Time,
    @ColumnInfo(name = "milliseconds")
    val milliseconds: Int,
    @ColumnInfo(name = "fastestLap")
    val fastestLap: Int,
    @ColumnInfo(name = "rank")
    val rank:  Int,
    @ColumnInfo(name = "fastestLapTime")
    val fastestLapTime: String,
    @ColumnInfo(name = "fastestLapSpeed")
    val fastestLapSpeed: String,
    @ColumnInfo(name = "statusId")
    val statusId: Int
)