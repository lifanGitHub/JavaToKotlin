package leet_code

/**
 * @author: LiFan
 * @date: 2023/11/20
 * @Description:给你一个链表数组，每个链表都已经按升序排列。
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 *
 *
 */

class P23 {

    fun merge2Lists(list1: ListNode?,list2: ListNode?): ListNode? {
        if (list2 == null) { return list1 }
        val newHead = ListNode(-1)
        var newHeadIterator = newHead
        var tag1:ListNode? = list1
        var tag2 = list2

        while (tag1 != null || tag2 != null){
            if (tag1 == null){
                newHeadIterator.next = tag2
                tag2 = tag2!!.next
            }else if (tag2 == null){
                newHeadIterator.next = tag1
                tag1 = tag1.next
            }else{
                //合并
                if (tag1.`val` <= tag2.`val`){
                    newHeadIterator.next = tag1
                    tag1 = tag1.next
                }else{
                    newHeadIterator.next = tag2
                    tag2 = tag2.next
                }
            }
            newHeadIterator = newHeadIterator.next!!
        }
        return newHead.next!!
    }
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if (lists.isEmpty()) { return null }
        var result = lists[0]
        for (i in 1 until lists.size){
            result = merge2Lists(result,lists[i])
        }
        return result
    }
}

fun main() {
    val l1 = ListNode(arrayOf(1,3,5))
    val l2 = ListNode(arrayOf(2,4,6))
    val l3 = ListNode(arrayOf(2,4,6))
    val p = P23()
    val x = p.mergeKLists(arrayOf(l1,l2))
    x?.print()
}