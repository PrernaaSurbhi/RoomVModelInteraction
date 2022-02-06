package com.example.roomvmodelinteraction.dataBase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

/**
 * Created by PrernaSurbhi on 07/02/22.
 * DAO - Data access Object interface , it is used to communicate with data base.It should be interface class .
 * This class include insert , update , query ,delete command
 */

@Dao
interface SleepDetailDAO {
    @Insert
    fun insertSleepDetail(night: SleepDetail)

    @Update
    fun updateSleepDetail(night:SleepDetail)

    @Query("SELECT * from daily_sleep_quality_table WHERE nightId = :key")
    fun getKEY(key:Long):SleepDetail?

    @Query("DELETE FROM daily_sleep_quality_table")
    fun clear()

    @Query("SELECT * FROM daily_sleep_quality_table ORDER BY nightId DESC LIMIT 1")
    fun getTonight(): SleepDetail?

    @Query("SELECT * FROM daily_sleep_quality_table ORDER BY nightId DESC")
    fun getAllNights(): LiveData<List<SleepDetail>>

}