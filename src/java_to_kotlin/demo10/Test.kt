package java_to_kotlin.demo10

fun indexOfMax(a: IntArray): Int? {
    if (a.isEmpty()){
        return null
    }

    var index = 0
    for (i in 0 until a.size){
        index = if (a[i] >= a[index]) i else index
    }

    return index
}