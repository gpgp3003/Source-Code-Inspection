package br.calebe.ticketmachine.core;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author gpgp3003
 */
public class PapelMoedaTest {
    
    @Test
    public void testGetValor() {
       PapelMoeda papel = new PapelMoeda(50, 10);
       Assert.assertEquals(50, papel.getValor());
    }

    @Test
    public void testGetQuantidade() {
       PapelMoeda papel = new PapelMoeda(50, 10);
       Assert.assertEquals(5, papel.getQuantidade());
    }
    
}