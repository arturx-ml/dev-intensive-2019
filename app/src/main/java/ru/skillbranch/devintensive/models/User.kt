package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.utils.Utils
import java.util.*

data class User(
    val id: String,
    var firstName:String?,
    var lastName:String?,
    var avatar:String? = null,
    var rating :Int = 0,
    var respect:Int = 0,
    var lastVisit : Date? = Date(),
    var isOnline : Boolean = false
    )
{
    companion object Factory {

        private var id = -1
        public fun makeUser(fullName:String):User{
            id++

            return User("$id", Utils.parseFullName(fullName).first?:"",Utils.parseFullName(fullName).second?:"")
        }
    }


}