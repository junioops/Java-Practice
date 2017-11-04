package stack1;
// this defines an integer stack which can hold ten values
/*
    The following code defines an integer class - stack
    -> It can be imagined as a blueprint of 10 plates
    -> there are two methods i. Stack.push() and ii. Stack.pop()
    -> the constructor Stack() initializes a variable tos to -1
    -> a) Stack.push() - the method is used to create a plate in the stack
          two cases evolve - if tos is 9 (10th plate) then it states that
          the stack is full. Otherwise, the plate[incremented value of tos]
          (plate[place value]) = the item
       b) Stack.pop() - it returns the plate according to the current value of tos,
          tos' value is then decremented. If tos is less than 0 (shouldn't be possible)
          then it exits the program, stating a stack underflow
 */
class Stack {
    int stck[] = new int[10];
    int tos;

    // initialize top of the stack
    Stack() {
        tos = -1;
    }
    // push an item onto the stack
    void push(int item) {
        if(tos == 9)
            System.out.println("Stack is full");
        else
            stck[++tos] = item;
    }
    // pops an item from the stack
    int pop() {
        if(tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
class TestStack {
    public static void main(String args[]) {
        Stack mystack1 = new Stack(); // mystack1.tos = -1
        Stack mystack2 = new Stack(); // mystack2.tos = -1

        // push some numbers into the stack
        for(int i = 0; i < 10; i++) mystack1.push(i);
        for(int i = 10; i < 20; i++) mystack2.push(i);

        // pop those numbers off the stack
        System.out.println("Stack in mystack1: ");
        for(int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());
        System.out.println("Stack in mystack2: ");
        for(int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());
    }
}