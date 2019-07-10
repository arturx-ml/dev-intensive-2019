package ru.skillbranch.devintensive.extensions

import java.text.SimpleDateFormat
import java.util.*

const val SECOND = 1000L
const val MINUTE = 60 * SECOND
const val HOUR = 60 * MINUTE
const val DAY = 24 * HOUR


fun Date.format(pattern: String = "HH:mm:ss dd.MM.yy"): String {
    val format = SimpleDateFormat(pattern, Locale("ru"))
    return format.format(this)
}

fun Date.add(value: Int, unit: TimeUnits = TimeUnits.SECOND): Date {
    var time = this.time

    time += when (unit) {
        TimeUnits.SECOND -> value * SECOND
        TimeUnits.MINUTE -> value * MINUTE
        TimeUnits.HOUR -> value * HOUR
        TimeUnits.DAY -> value * DAY
        else -> throw IllegalStateException("invalid unit")
    }
    this.time = time

    return this
}

fun Date.humanizeDiff(date: Date = Date()): String {
    val current = Date()
    return ""
//    val diff =
}

enum class TimeUnits {
    SECOND,
    MINUTE,
    HOUR,
    DAY
}