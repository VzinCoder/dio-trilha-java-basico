public class User {
    private String name;
    private int age;
    private String tell;

    public User() {
        this.name = "";
        this.age = 0;
        this.tell = "";
    }

    public User(String name, int age, String tell) {
        this.name = name;
        this.age = age;
        this.tell = tell;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

   
}
