/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode() ; 
        ListNode p = l3;		//结果链表的引用
        int carry=0;			//进位标志
        ListNode t1 = l1;		
        ListNode t2 = l2;
        int val;
        while(t1 != null && t2 != null){	//把两个链表前段不空的做加
            val = t1.val + t2.val + carry;
            if(val>9){			//进位
                carry = 1;
                val %= 10;
            }else{
                carry = 0;
            }
            p.next= new ListNode(val);
            p=p.next;
            t1 = t1.next;
            t2 = t2.next;
        }

        if(t1==null&&t2==null){		//两个链表长度相等
            if(carry==1){
                p.next= new ListNode(1);
                p=p.next;
            }
        }else if(t1 == null){		//l1比较短
            while(t2!=null){		//l2剩下的连续往前推
                val = t2.val + carry;
                if(val>9){
                    carry = 1;
                    val %= 10;
                }else{
                    carry = 0;
                }
                p.next= new ListNode(val);
                p=p.next;
                t2 = t2.next;
            }
            if(carry==1){		
                p.next= new ListNode(1);
                p=p.next;
            }
        }else if(t2==null){		//l2比较短
            while(t1!=null){		//l1剩下的连续往前推
                val = t1.val + carry;
                if(val>9){
                    carry = 1;
                    val %= 10;
                }else{
                    carry = 0;
                }
                p.next= new ListNode(val);
                p=p.next;
                t1 = t1.next;
            }
            if(carry==1){
                p.next= new ListNode(1);
                p=p.next;
            }
        }
        l3=l3.next;			//l3首个元素没有被用到，跳过
        return l3;
    }
}

//问题？：如果l3使用首个元素，
p 指向的地方直接     p= new ListNode(val);     p=p.next;  会导致l3指向丢失。