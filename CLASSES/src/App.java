public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student();

        student.name = "Vinicius";
        student.age = 18;

        student.talkName();
        student.talkAge();
    }
}
