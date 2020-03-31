package lambdas;

interface Executable {
    int execute(int x, int y);
}

class Runner {
    public void run(Executable e) {
        int a = e.execute(10, 15);
        System.out.println(a);
    }
}


public class Test1 {
    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.run(new Executable() {
            @Override
            public int execute(int x, int y) {
//                System.out.println("Hello!");
//                System.out.println("Goodbye!");

                return x + y;
            }
        });

//        runner.run((int x) -> {
//            System.out.println("Hello!");
//            System.out.println("Goodbye!");
//
//            return 5;
//        });

        runner.run((x, y)->x + y);
    }

}
