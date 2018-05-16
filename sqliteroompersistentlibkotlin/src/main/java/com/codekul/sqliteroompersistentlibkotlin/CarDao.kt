package com.codekul.sqliteroompersistentlibkotlin

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface CarDao {

    @Insert
    fun insert(cr : car)

    @Query("select * from car")
    fun  cars() : List<car>
}