public enum DiasSemana {
    SEGUNDA_FEIRA(1),
    TERÇA_FEIRA(2),
    QUARTA_FEIRA(3),
    QUINTA_FEIRA(4),
    SEXTA_FEIRA(5),
    SABADO(6),
    DOMINGO(0);

    private int num;

    private DiasSemana(int num){
        this.num = num;
    }

    public int getNum(){
        return this.num;
    }


    public static DiasSemana findDay(int num)throws Exception{
        for (DiasSemana dia : DiasSemana.values()) {
            if(num == dia.getNum()){
                return dia;
            }
        }
        throw new Exception();
    }
}
