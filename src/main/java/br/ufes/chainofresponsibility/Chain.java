package br.ufes.chainofresponsibility;

import br.ufes.model.Numbers;

/**
 *
 * @author Alcebiades
 */
public interface Chain {
    public void setNext(Chain chain);
    public void nextChain(Numbers numbers); //numbers are my requests
}
