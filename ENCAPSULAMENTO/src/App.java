public class App {
    public static void main(String[] args) throws Exception {
       User user = new User("Vinicius",18);

       user.apresentar();
      // user.name = "Kleber"; nao funciona pois esta encapsulado 
      user.setName("Kleber");
      user.setAge(22); 
      user.apresentar();
    }
}
