//URL: https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1
class ReverseLinkedList
{
    Node reverseList(Node head)
    {
        if(head == null) return null;
        if(head.next == null) return head;

        Node newNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }
}