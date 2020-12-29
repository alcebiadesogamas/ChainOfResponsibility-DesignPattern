
import br.ufes.chainofresponsibility.Add;
import br.ufes.chainofresponsibility.Chain;
import br.ufes.chainofresponsibility.Div;
import br.ufes.chainofresponsibility.Mult;
import br.ufes.chainofresponsibility.Sub;
import br.ufes.model.Numbers;

/**
 *
 * @author Alcebiades
 */
public class TestChain {

    public static void main(String[] args) {
        Numbers number = new Numbers(3, 4, "pow");

        Chain chainOperation1 = new Add(); //type Chain
        Chain chainOperation2 = new Sub(); //type Chain
        Chain chainOperation3 = new Div(); //type Chain
        Chain chainOperation4 = new Mult(); //type Chain
        
        chainOperation1.setNext(chainOperation2);
        chainOperation2.setNext(chainOperation3);
        chainOperation3.setNext(chainOperation4);

        chainOperation1.nextChain(number);
    }
}
