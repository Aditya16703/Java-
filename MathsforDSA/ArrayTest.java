public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[5];
        
        System.out.println("Address of arr[0]: " + System.identityHashCode(arr[0]));
        System.out.println("Address of arr[1]: " + System.identityHashCode(arr[1]));
        System.out.println("Address of arr[2]: " + System.identityHashCode(arr[2]));
        System.out.println("Address of arr[3]: " + System.identityHashCode(arr[3]));
        System.out.println("Address of arr[4]: " + System.identityHashCode(arr[4]));
    }
}

