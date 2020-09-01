package com.example.f1db.Entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "constructors")
data class Constructors(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "constructorId")
    val constructorId:Int,
    @ColumnInfo(name = "constructorRef")
    val constructorRef: String,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "nationality")
    val nationality: String,
    @ColumnInfo(name="url")
    val url: String
)