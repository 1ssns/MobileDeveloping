package com.example.mobiledeveloping.task4

fun Array<Int>.filterAndMap(
    filterFunction: (Int) -> Boolean,
    mapFunction: (Int) -> Int
): Array<Int>{
    return this.filter(filterFunction).map(mapFunction).toTypedArray()
}
