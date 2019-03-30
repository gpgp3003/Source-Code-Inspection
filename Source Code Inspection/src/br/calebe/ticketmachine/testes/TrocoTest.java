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
        TrocoIterator ti = new TrocoIterator(troco);
        Assert.assertEquals(ti, troco.getIterator());
    }

    @Test
    public void testGetIteratorDois() {
        Troco troco = new Troco(20);
        TrocoIterator ti = new TrocoIterator(troco);
        Assert.assertEquals(ti, troco.getIterator());
    }

}

