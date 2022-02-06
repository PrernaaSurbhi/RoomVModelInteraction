package com.example.roomvmodelinteraction.dataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/**
 * Created by PrernaSurbhi on 07/02/22.
 * This is the Room Data Base Class
 */

@Database(entities = [SleepDetail::class], version = 1, exportSchema = false)
abstract class SleepDetailDataBase : RoomDatabase() {

    abstract val sleepDetailDAO: SleepDetailDAO

    companion object {
        private var INSTANCE: SleepDetailDataBase? = null

        fun getInstance(context: Context): SleepDetailDataBase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        SleepDetailDataBase::class.java,
                        "sleep_history_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }


    }

}