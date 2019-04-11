package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class SaldoInsuficienteException extends Exception {

       public SaldoInsuficienteException(String message) {
        super(message);
    }

    public SaldoInsuficienteException() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
