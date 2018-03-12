public class Server {

    public static void main(String args[]) throws InterruptedException {
        String name;
        try {
            name = args[0];
            System.out.println("Hello World, I'm the " + name + ". ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}