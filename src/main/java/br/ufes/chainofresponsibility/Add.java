package br.ufes.chainofresponsibility;

import br.ufes.model.Numbers;

/**
 *
 * @author Alcebiades
 */
public class Add implements Chain{
    private Chain next;
    @Override
    public void setNext(Chain chain) {
        this.next = chain;
    }

    @Override
    public void nextChain(Numbers numbers) {
        if(numbers.getOperationType().equalsIgnoreCase("add"))
            System.out.println(numbers.getNumber1() +" + "+numbers.getNumber2()+" = "+(numbers.getNumber1()+numbers.getNumber2()));
        else
            next.nextChain(numbers);
    }
    
}
