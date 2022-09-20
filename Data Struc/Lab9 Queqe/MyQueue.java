public class MyQueue {
    private Object[] elementData;
    private static int size;
    private int front;

    public MyQueue(int n){
        elementData = new Object[n];
        size = 0;
        front = 0;
    }

    public void enqueue(Object obj) {
        if (size < elementData.length) {
            int b = (front + size) % elementData.length;
            elementData[b] = obj;
            size++;
        }
    }

    public Object dequeue() {
        Object obj = elementData[front];
        elementData[front] = null;
        front++; size--;
        return obj;
        }

    public static boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        // String answer = "";
        // for (int i = 0; i < elementData.length; i++) {
        //     if (elementData[i] != null) {
        //         answer = answer + elementData[i] + ",";
        //     }
        // }
        // return answer;

        String ans = "";
        int index = front;
        int i = 1;

        while (i <= size) {
            ans += elementData[index & elementData.length] + " ";
            i += 1;
            index += 1; 
        }

        return ans;
    }
}