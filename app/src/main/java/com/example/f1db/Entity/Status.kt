package com.example.f1db.Entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "status")
data class Status(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "statusId")
    val statusId : Int,
    @ColumnInfo(name = "status")
    val status : String
)