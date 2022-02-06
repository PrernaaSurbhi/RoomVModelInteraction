package com.example.roomvmodelinteraction.dataBase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by PrernaSurbhi on 07/02/22.
 * As this class we are going to use as entity class , so added @Entity.
 * Entity - this class is used to create table in data base
 */


@Entity(tableName = "daily_sleep_quality_table")
data class SleepDetail(
    //here we added primary key autoGenerate = true, as we want primary key to be auto generated
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "nightId")
    var nightId:Long  = 0L,

    @ColumnInfo(name = "start_time_milli")
    var startTimeMilli:Long = System.currentTimeMillis(),

    @ColumnInfo(name = "end_time_milli")
    var endTimeMilli:Long = 0L,

    @ColumnInfo(name = "quality_rating")
    var sleepQuality: Int = -1

)
