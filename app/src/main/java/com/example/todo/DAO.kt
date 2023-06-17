package com.example.todo

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface DAO{
    @Insert
    fun insertTask(entity: Entity)

    @Update
    fun updateTask(entity: Entity)

    @Delete
    fun deleteTask(entity: Entity)

    @Query("Delete from To_Do")
    fun deleteAll():Int

    @Query("Select * from To_Do")
    fun getTasks():List<CardInfo>
}