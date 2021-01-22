public class NotaException extends IllegalAccessException {

    private static final String mensagem= "A nota do aluno não pode ser superior a 100";
    public NotaException(){
        super(mensagem);
    }
    public NotaException(String message){
        super(message);
    }
}
