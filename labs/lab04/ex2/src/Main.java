public class Main {
    public static void main(String[] args) {

        Worker w1 = new Worker("sevda", 2000);
        Worker w2 = new Worker("sevda", 2000);
        Worker w3 = new Worker("sevda", 2000);
        System.out.println("Worker: " +Worker.counter);


        try {
            w1.setName();
            w1.setSalary();
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}