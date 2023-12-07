package leet_code

/**
 * @author: LiFan
 * @date: 2023/11/20
 * @Description:
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 *
 * 重点：使用双指针方法单次遍历
 */

class P19 {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val fakeHead = ListNode(-1)
        fakeHead.next = head
        var first: ListNode? = fakeHead
        var second: ListNode? = fakeHead
        var i = 0
        while (first != null) {
            if (i > n) {
                second = second!!.next
            }
            i++
            first = first.next
        }
        //此时first到底 删除second下方的节点
        second!!.next = second.next!!.next
        return fakeHead.next
    }
}

fun main() {
    val l1 = ListNode(arrayOf(1,2,3,4,5,6,7,8))
    val p = P19()
    p.removeNthFromEnd(l1,2)
    l1.print()
}