package leet_code

/**
 * Author: LiFan
 * Date: 2020/5/8
 * Description: 合并两个有序list
 */

class Solution21 {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null)
            return l2
        if (l2 == null)
            return l1
        val list = mutableListOf<Int>()
        var it1 = l1
        var it2 = l2
        while (!(it1 == null && it2 == null)) {
            if (it1 == null) {
                list.add(it2!!.`val`)
                it2 = it2.next
            } else if (it2 == null) {
                list.add(it1.`val`)
                it1 = it1.next
            } else if (it1.`val` < it2.`val`) {
                list.add(it1.`val`)
                it1 = it1.next
            } else {
                list.add(it2.`val`)
                it2 = it2.next
            }
        }
        val head=ListNode(0)
        var node=head
        for (i in list.indices){
            node.`val`=list[i]
            if (i == list.size -1){
                break
            }
            node.next = ListNode(0)
            node = node.next!!
        }


        return head
    }
}