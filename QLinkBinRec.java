// public class QueueB{
//     static class Node{
//         int data;
//         Node next ;
//         Node(int data){
//             this.data= data;
//             this.next =null;
//         }
//     }

//     static class Queue{

//         static Node head= null;
//         static Node tail= null;

//         public static boolean isEmpty() {
//             return head == null & tail == null ;
            
//         }

//       // add 
//       public static void add(int data){
//           Node newNode = new Node(data);
//            if(head==null){
//               head= tail= newNode;
//               return ;
//            }
//            tail.next= newNode;
//            tail = newNode;
//       }



//       public static int remove(){
//         if(isEmpty()){
//             System.out.println("its a Empty Queue .........");
//             return -1;
//         }
//         int front = head.data;

//         //single Element case
//         if(tail == head){
//             tail=head=null;

//         }else{
//             head= head.next;
//         }
//         return front;
//       }


//       //peek

//       public static int peek(){
//         if(isEmpty()){
//             System.out.println("its a Empty Queue  ");
//             return -1;
//         }
//         return head.data;
        
//       }
      
//     }

//     public static void main(String[] args) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.remove();
//         q.remove();
//         q.remove();
//         q.remove();
//         q.remove();

//         while (!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }

// }


// // o/p
// // its a Empty Queue .........










// public class  binRecurrsion
// {

//    public static int binarySearch(int arr[], int left, int right, int item)
//    {
//         if (right >= left && left <= arr.length - 1) 
//        {
//             int mid = left + (right - left) / 2;

//             if (arr[mid] == item)
//                return mid;
//             if (arr[mid] > item)
//                return binarySearch(arr, left, mid - 1, item);
//             return binarySearch(arr, mid + 1, right, item);
//         }
//         return -1;
//    }




//    public static void main(String[] args)

//    {
//         int arr[] = {10,20,25,30,40,50};
//         int item = 25;
//         int res = binarySearch(arr,0,arr.length-1,item);
//         if(res == -1)
//            System.out.println("The element is not found");
//        else
//            System.out.println("The element is at index "+res);
//     }
    
// }



// // output?
// // The element is at index 2
