public class CalculadoraCelular implements CalculadoraInterface {

    @Override
    public int dividir(int firstNum, int secondNum) {
        
        return firstNum/secondNum;
    }

    @Override
    public int multiplicar(int firstNum, int secondNum) {
        
        return firstNum*secondNum;
    }

    @Override
    public int soma(int firstNum, int secondNum) {
        return firstNum+secondNum;
    }

    @Override
    public int subtrair(int firstNum, int secondNum) {
        return firstNum-secondNum;
    }
    
}
