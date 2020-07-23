package leet_code

/**
 * Author: LiFan
 * Date: 2020/5/8
 * Description:
 */

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    constructor(list : Array<Int>):this(list[0]){
        var listNode = this
        for (i in (1 until  list.size)){
            val newNode = ListNode(list[i])
            listNode.next = newNode
            listNode = newNode
        }
    }

    fun print() {
        var listNode: ListNode? = this
        while (listNode!=null){
            print("${listNode.`val`}->")
            listNode = listNode.next
        }
        println("null")
    }

}

fun main() {
    ListNode(arrayOf(1,2,3,4)).print()
}
