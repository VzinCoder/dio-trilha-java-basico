public class User {
    private String name; // deixar que apenas a classe tenha acesso
    private int age;

    public User(){
        this.name = "";
        this.age = 0;
    }

    public User(String name,int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void apresentar(){
        System.out.println("Meu nome eh "+this.name+" e eu tenho "+this.age+" anos");
    }
}
