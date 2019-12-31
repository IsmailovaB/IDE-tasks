package InterviewTasks;

public class FlowOfExcecutionBlocks {
    //Order of execution?
//        First execute static block only once
//        Second execute non static block(without creating an object this block will not run,
//        even tough you don’t do anything with the object. Every time you create an object it will be executed)
//        Third execute constructor every time you create an object

        String string ="";
        static int b;

        {
            b=3;
            System.out.println("2. This is NON STATIC BLOCK  " + b);
        }

        static
        {
            b= 55;
            System.out.println("1. This is static block  " + b);
        }


        public FlowOfExcecutionBlocks()
        {
            b = 60;
            System.out.println("3. This is CONSTRUCTOR block  " + b);
        }

        public static void main( String[] args ) {

           FlowOfExcecutionBlocks t1 = new FlowOfExcecutionBlocks();
            FlowOfExcecutionBlocks t2 = new FlowOfExcecutionBlocks();
            FlowOfExcecutionBlocks t3 = new FlowOfExcecutionBlocks();

            //   b = 40;
            System.out.println(b);


        }


        A a = new A();
    }

class A{
    int x;
    int y;
    A (){
        this(5);
        System.out.println("I am the first one");
    }
    A(int x){
        this(x,5);
        System.out.println("I am the second one");
    }
    A(int x, int y){
        this.x=x;
        this.y= y;
        System.out.println("I am the 3th one");
    }
}

