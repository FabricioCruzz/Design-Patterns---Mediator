import com.ppMediator.Mediator;
import com.ppMediator.Pessoa1;
import com.ppMediator.Pessoa2;

public class App {
    public static void main(String[] args) throws Exception {
        Mediator mediator = new Mediator();

        Pessoa1 p1 = new Pessoa1(mediator);
        Pessoa2 p2 = new Pessoa2(mediator);

        mediator.addPessoa(p1);
        mediator.addPessoa(p2);

        mediator.enviarMensagem(p1, "Olá!!");

    }
}
