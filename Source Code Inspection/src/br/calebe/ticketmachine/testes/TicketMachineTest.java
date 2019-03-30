/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author EduTedeschi
 */
public class TicketMachineTest {
    
    public void testInserir() throws PapelMoedaInvalidaException {
        TicketMachine ticket = new TicketMachine(5);
        int aux = ticket.getSaldo();
        ticket.inserir(10);
        Assert.assertTrue(aux < ticket.getSaldo());
    }

    @Test
    public void testGetSaldo() {
        TicketMachine ticket = new TicketMachine(20);
        Assert.assertEquals(0, ticket.getSaldo());
                
    }
}