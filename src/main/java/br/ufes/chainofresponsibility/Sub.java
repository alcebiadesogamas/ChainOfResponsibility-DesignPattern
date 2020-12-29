package br.ufes.chainofresponsibility;

import br.ufes.model.Numbers;

/**
 *
 * @author Alcebiades
 */
public class Sub implements Chain {

    private Chain next;

    @Override
    public void setNext(Chain chain) {
        this.next = chain;
    }

    @Override
    public void nextChain(Numbers numbers) {
        if (numbers.getOperationType().equalsIgnoreCase("sub")) {
            System.out.println(numbers.getNumber1() + " - " + numbers.getNumber2() + " = " + (numbers.getNumber1() - numbers.getNumber2()));
        } else {
            this.next.nextChain(numbers);
        }
    }

}
