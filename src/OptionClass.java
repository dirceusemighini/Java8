import java.util.Optional;
import java.util.function.Function;

/**
 * Created by dirceu on 10/4/14.
 * Usada como codigo teste do post de optinal nos posts do blog
 * http://dirceuprofessor.blogspot.com/2014/10/java-8-optional-funcional.html
 * http://dirceuprofessor.blogspot.com/2014/10/java-8-optional-evitando.html
 */
public class OptionClass {

    public static void main(String args[]) {

        //Valor numérico Inteiro 10
        Optional<Integer> optIntValor = Optional.of(10);
        //Sem valor
        Optional<Integer> optIntVazio = Optional.empty();
        if(optIntValor.isPresent()){
            Integer valor = optIntValor.get();
        } else {
            //Código    quando não existir valor
        }

        optIntValor.orElse(0);
        optIntVazio.orElse(new Integer(0));
        optIntValor.map(
                val -> new Integer(val)
        )         ;
        Integer i = new Integer(10);
        Function<Integer,String> f = v -> v.toString();
        Function<Integer,Boolean> fs = v -> v > 18 && v %2 == 0;
        optIntValor.map(valor -> valor*2).orElse(0);
        optIntValor.filter(vlr -> vlr>10);
        try {
            optIntVazio.orElseThrow(Exception::new);
        }catch(Exception e){

        }
        Optional<String> complemento = Optional.of("Bloco C 22");
        Endereco end = new Endereco("rua",Optional.of("Bloco C 22"))  ;
        Usuario usuario = new Usuario("nome",Optional.of(end));
        Optional<String> comp = usuario.getEndereco().flatMap(endereco -> endereco.getComplemento());
    }
}

class Endereco  {
    public Optional<String> getComplemento() {
        return complemento;
    }

    private Optional<String> complemento;
    public Endereco(String rua, Optional<String> complemento){}
}
class Usuario{
    public Optional<Endereco> getEndereco() {
        return endereco;
    }

    private Optional<Endereco> endereco;
    public Usuario(String nome, Optional<Endereco>endereco) {}
}

