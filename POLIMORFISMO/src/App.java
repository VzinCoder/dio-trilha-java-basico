public class App {
    public static void main(String[] args) throws Exception {
        Animal animal = new Cachorro();

        animal.comer(); // aparentemente esse animal é um cachorro

        if(animal instanceof Cachorro){
            System.out.println("É um cachorro");
        }else{
            System.out.println("É outro animal");
        }
        
    }
}
