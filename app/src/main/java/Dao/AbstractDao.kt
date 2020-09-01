package Dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

interface AbstractDao<T> {

    @Insert
    suspend fun insert(obj: T)

    @Update
    fun update(obj: T)

    @Delete
    fun delete(obj: T)
}