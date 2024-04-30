public abstract class Animal {
    public abstract void fazerBarulho(); 

    public void comer(){
        fazerBarulho();
        System.out.println("Comendo...");
    }
}
