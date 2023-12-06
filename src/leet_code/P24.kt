package leet_code

/**
 * @author: LiFan
 * @date: 2023/11/21
 * @Description:
 * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
 */

class P24 {
    fun swap3Node(head: ListNode?) {
        val n0 = head
        val n1 = n0!!.next
        val n2 = n1!!.next
        val n3 = n2!!.next

        n0.next = n2
        n2.next = n1
        n1.next = n3
    }
    fun swapPairs(head: ListNode?): ListNode? {
        if (head == null) return head
        if (head.next == null) return head
        val fakeHead = ListNode(-1).apply { next = head }
        var iterator = fakeHead
        while (iterator.next != null && iterator.next!!.next != null) {
            swap3Node(iterator)
            iterator = iterator.next!!.next!!
        }
        return fakeHead.next
    }

}

fun main() {
    val l1 = ListNode(arrayOf(1))
    val p = P24()
    val result = p.swapPairs(l1)
    result?.print()
}