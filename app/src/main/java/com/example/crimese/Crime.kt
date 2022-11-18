package com.example.crimese

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Crime (@PrimaryKey var id: UUID = UUID.randomUUID())  {
    var title:String = "AAA"
    var date: Date? = Date()
    var isSolved: Boolean? = false
    var suspect: String=""
    var requiresPolice: Int?=0
    constructor(id: UUID, title: String, date: Date, isSolved:Boolean, suspect:String):this(id){
        this.title = title
        this.date = date
        this.id = id
        this.isSolved=isSolved
        this.suspect=suspect
        //this.requiresPolice=requiresPolice
    }
}