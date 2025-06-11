package leet_code

/**
 * Author: LiFan
 * Date: 2020/7/9
 * Description:
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 */

class Solution61 {
    fun ListNode.size(): Int {
        var len = 0
        var node: ListNode? = this
        while (node != null) {
            len++
            node = node.next
        }
        return len
    }

    fun ListNode.goto(n: Int): ListNode? {
        var listNode: ListNode? = this
        (0 until n).forEach {
            listNode = listNode!!.next
        }
        return listNode
    }

    fun rotateRight(head: ListNode?, k: Int): ListNode? {
        if (head?.next == null) {
            return head
        }
        val size = head.size()
        if (size == 1 || k % size == 0) {
            return head
        }
        val divK = k % size
        //建立循环链
        val endNode = head.goto(head.size() - 1)
        endNode!!.next = head
        //预先获取头
        val resultNode = head.goto(size - divK)
        //断开循环
        val beforeStartNode = head.goto(size - divK - 1)
        beforeStartNode!!.next = null
        return resultNode

    }
}

fun main() {
//    Solution61().rotateRight(ListNode(arrayOf(1,2,3,4,5)),2)!!.print()
//    Solution61().rotateRight(ListNode(arrayOf(0, 1, 2)), 4)!!.print()
}