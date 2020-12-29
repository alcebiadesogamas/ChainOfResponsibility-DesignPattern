package br.ufes.chainofresponsibility;

import br.ufes.model.Numbers;

/**
 *
 * @author Alcebiades
 */
public class Div implements Chain {

    private Chain next;

    @Override
    public void setNext(Chain chain) {
        this.next = chain;
    }

    @Override
    public void nextChain(Numbers numbers) {
        if (numbers.getOperationType().equalsIgnoreCase("div")) {
            System.out.println(numbers.getNumber1() + " / " + numbers.getNumber2() + " = " + (numbers.getNumber1() / numbers.getNumber2()));
        } else {
            next.nextChain(numbers);
        }
    }

}
