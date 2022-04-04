package Ex1;

public class Stack {

    public static void main(String[] args) {
        System.out.println("------------INTEGER-----------");
        java.util.Stack<Integer> stackInteger = new java.util.Stack<>();
        int[] arr = {0, -6, 4, 8, 3, 9};
        System.out.println("Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();


        for (int i = 0; i < arr.length; i++) {
            stackInteger.push(arr[i]);
        }
        System.out.println("Stack is: ");
        System.out.println(stackInteger);

        System.out.println();
        System.out.println("Array after reverse: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stackInteger.pop();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println("------------STRING-----------");
        java.util.Stack<String> wStack = new java.util.Stack<>();
        String str = "Hello World";
        String[] mWord = str.split("");
        System.out.println("String before reverse in array:");
        for (int i = 0; i < mWord.length; i++) {
            System.out.print(mWord[i]+" ");
        }
        System.out.println("Stack is:");
        for (int i = 0; i < mWord.length; i++) {
            wStack.push(mWord[i]);
        }
        System.out.println(wStack);

        System.out.println("mWord after reverse:");
        for (int i = 0; i < mWord.length; i++) {
            mWord[i]=wStack.pop();
        }
        for (int i = 0; i < mWord.length; i++) {
            System.out.print(mWord[i]+"\t");
        }
    }
}
