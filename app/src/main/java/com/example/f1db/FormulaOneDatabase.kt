package com.example.f1db

import Dao.DriverDao
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.f1db.Entity.Driver

@Database(entities = arrayOf(Driver::class),version = 1, exportSchema = false)
public abstract class FormulaOneDatabase : RoomDatabase() {
    abstract fun driverDao(): DriverDao

    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: FormulaOneDatabase? = null

        fun getDatabase(context: Context): FormulaOneDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    FormulaOneDatabase::class.java,
                    "word_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}