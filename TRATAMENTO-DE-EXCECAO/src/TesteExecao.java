public class TesteExecao {
    
    public static void main(String[] args) {
        String cep = "1234567";

        try {
            validarCep(cep);
            System.out.println("Cep valido");
        } catch (CepInvalidException e) {
           System.err.println("Cep invalido!");
        }
        
    }


    public static boolean validarCep(String nome) throws CepInvalidException{
        if(nome.length() != 8){
            throw new CepInvalidException();
        }

        return true;
    }
}
