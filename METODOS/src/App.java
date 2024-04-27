public class App {
    public static void main(String[] args) throws Exception {
        SmartTV tv = new SmartTV();

        // trocando canal
        System.out.println("Canal atual "+tv.canal);
        tv.aumentarCanal();
        System.out.println("Canal atual: "+tv.canal);
        tv.diminuirCanal();
        System.out.println("Canal atual "+tv.canal);
        tv.trocarCanal(13);
        System.out.println("Canal atual "+tv.canal);

        // trocando volume
        System.out.println("Volume atual: "+tv.volume);
        tv.aumentarVolume();
        System.out.println("Volume atual: "+tv.volume);
        tv.diminuirVolume();
        System.out.println("Volume atual: "+tv.volume);

        //ligar tv
        System.out.println("Ligada: "+tv.ligada);
        tv.ligar();
        System.out.println("Ligada: "+tv.ligada);
    }
}
