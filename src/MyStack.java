import java.util.Stack;

public class MyStack {

    public static int getLastRemove(Stack<Integer> stack){
        int result = stack.pop();
        if(stack.isEmpty()){
            return result;
        }
        int last = getLastRemove(stack);
        stack.push(result);
        return last;
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int a = getLastRemove(stack);

    }

    public void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int i = getLastRemove(stack);
        reverse(stack);
        stack.push(i);
    }

}

