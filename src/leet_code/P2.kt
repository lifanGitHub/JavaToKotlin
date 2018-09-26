package leet_code

/**
 * @author by LiFan
 * @date 2018/9/26
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
class P2{
    class ListNode(var `val`: Int = 0) {
        var next: ListNode? = null

        override fun toString(): String {
            var str = ""
            var it: ListNode? = this
            while (it != null){
                str += "->${it.`val`}"
                it = it.next
            }
            return str
        }
    }

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var list1: ListNode? = l1
        var list2: ListNode? = l2
        var head: ListNode? = null
        var it: ListNode? = head
        var add = 0
        while (list1 != null || list2 != null || add != 0){
            var sum = (list1?.`val`?:0) + (list2?.`val`?:0) + add
            add = 0
            if (sum > 9){
                sum -= 10
                add = 1
            }
            if (head == null){
                head = ListNode(sum)
                it = head
            }else{
                it!!.next = ListNode(sum)
                it = it.next
            }
            list1 = list1?.next
            list2 = list2?.next
        }

        return head

    }

}

fun main(args: Array<String>) {
    val l1 = P2.ListNode(1)
    l1.next = P2.ListNode(1)
    l1.next!!.next = P2.ListNode(1)
    l1.next!!.next!!.next = P2.ListNode(2)
    l1.next!!.next!!.next!!.next = P2.ListNode(3)

    val l2 = P2.ListNode(9)
    l2.next = P2.ListNode(8)
    l2.next!!.next = P2.ListNode(0)
    l2.next!!.next!!.next = P2.ListNode(0)
    l2.next!!.next!!.next!!.next = P2.ListNode(7)
    println(P2().addTwoNumbers(l1,l2))
}