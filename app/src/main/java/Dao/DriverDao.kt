package Dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.f1db.Entity.Driver

@Dao
interface DriverDao {
    @Query("Select * from drivers order by driverId asc")
    fun getAllDrivers():LiveData<List<Driver>>

    @Query("Delete from drivers")
    suspend fun deleteAll();

    @Insert
    suspend fun insert(driver: Driver)

}