public class App {
    public static void main(String[] args) throws Exception {
        User user = new User("vinicius",18,"40028922");

        System.out.println(user.getName()+" vc tem "+user.getAge()+" anos e seu telefone eh "+user.getTell());
    }
}
