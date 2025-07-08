package com.lifan.app.leet_code

import leet_code.ListNode

/**
 * @author: LiFan
 * @date: 2025/7/3
 * @Description:
 */

//class ListNode(var `val`: Int) {
//    var next: ListNode? = null
//}

class P25 {
    fun reverseNode(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var curr = head
        while (curr != null) {
            val next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }
        return prev
    }

    fun splitNode(head: ListNode?, k: Int): Array<ListNode?> {
        if (head == null) return arrayOf()

        var p = head
        var q:ListNode? = head
        for (i in 1 until  k) {
            q = q!!.next
            if (q == null){
                break
            }
        }
        if (q == null){
            //无需截断
            return arrayOf()
        }else{
            val next = q.next
            //截断
            q.next = null
            //重新排序
            reverseNode(p)
            return arrayOf(q,p,next)
        }

    }


    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        if (head == null) return head
        var result = splitNode(head,k)
        if (result.isEmpty()) return head
        val newHead = result[0]

        while (result.isNotEmpty()){
            var q = result[0]!!
            var p = result[1]!!
            var next = result[2]
            result = splitNode(next,k)
            if (result.isEmpty()){
                //无需再排序
                p.next = next
            }else{
                //连接下一段的头指针
                p.next = result[0]
            }
        }
        return newHead
    }


}

fun main() {
    val n = ListNode(arrayOf(1,2,3,4,5,6,7))
    val nn = P25().reverseKGroup(n,2)!!
    nn!!.print()
}