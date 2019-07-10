package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName:String):Pair<String?,String?>{
        val firstName = fullName.split(" ").firstOrNull()
        val lastName = fullName.split(" ").lastOrNull()
        return firstName to lastName
    }


//    fun transliteration(payload:String,divider:String = " "):String{
//
//    }

}