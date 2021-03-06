package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author gpgp3003
 */
public class TicketMachine {

    protected int valor;
    protected int saldo;
    protected int[] papelMoeda = {2, 5, 10, 20, 50, 100};

    public TicketMachine(int valor) {
        this.valor = valor;
        this.saldo = 0;
    }

    public void inserir(int quantia) throws PapelMoedaInvalidaException {
        if(Arrays.asList(papelMoeda).contains(quantia)){
            boolean achou = false;
            for (int i = 0; i < papelMoeda.length && !achou; i++) {
                if (papelMoeda[i] == quantia) {
                    achou = true;
                }
                if (!achou) {
                throw new PapelMoedaInvalidaException();
                }
            }
            this.saldo += quantia;
        }
    }

    public int getSaldo() {
        return saldo;
    }

    public int getTroco() {
        return Troco(saldo - valor);
    }

    public String imprimir() throws SaldoInsuficienteException {
        if (saldo < valor) {
            throw new SaldoInsuficienteException();
        }
        String result = "*****************\n";
        result += "*** R$ " + saldo + ",00 ****\n";
        result += "*****************\n";
        return result;
    }

    private int Troco(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
