package br.calebe.ticketmachine.core;

import java.util.Iterator;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author gpgp3003
 */
public class TrocoTest {
    @Test
    public void testGetIterator() {
        Troco troco = new Troco(10);
        TrocoIterator trocoIt = new TrocoIterator(troco);
        Assert.assertEquals(trocoIt, troco.getIterator());
    }
    
}