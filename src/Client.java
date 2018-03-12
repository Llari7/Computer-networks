public class Client {

    public static void main(String args[]){
        String name;
        try{
            name = args[0];
            System.out.println("Hello World, I'm " + name + ". ");
        }catch (IndexOutOfBoundsException e){
            System.out.print("Error: ");
            e.printStackTrace();
        }
    }
}
