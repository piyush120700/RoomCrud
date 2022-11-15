package com.example.crudlib

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="user_table")
data class User(

    @PrimaryKey(autoGenerate = true)
    var id:Int,

    var uname:String,

    var email:String,

    var passw:String,


    )