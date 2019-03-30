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
    

    @Test
    public void testGetValorDois() {
        int quantidade = 5;
        int valor = 2;
        PapelMoeda moeda = new PapelMoeda(valor,quantidade);
        assertEquals(moeda.getValor(),valor);
    }

   
    @Test
    public void testGetQuantidadeDois() {
        int quantidade = 5;
        int valor = 2;
        PapelMoeda moeda = new PapelMoeda(valor,quantidade);
        assertEquals(moeda.getQuantidade(),quantidade);
    }
}