package com.codekul.sqliteroompersistentlibkotlin

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase


@Database(version = 1, entities = [(car::class)])
abstract class AppDb : RoomDatabase(){

    abstract fun CarDao() : CarDao
}