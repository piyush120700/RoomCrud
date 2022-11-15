package com.example.crudlib

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface UserDao:java.io.Serializable {

    @Insert
    fun addUser(user:User)

    @Query("SELECT * FROM user_table")
    fun displayData():List<User>

    @Update
    fun updateUser(user: User)

    @Delete
    fun deleteUser(user: User)

}