package br.calebe.ticketmachine.core;

import java.util.Iterator;

/**
 *
 * @author gpgp3003
 */
class Troco {

    protected PapelMoeda[] papeisMoeda;

    public Troco(int valor) {
        papeisMoeda = new PapelMoeda[6];
        int count = 0;
        while (valor % 100 != 0 && valor>100) {
            count++;
            valor = valor - 100;
        }
        papeisMoeda[5] = new PapelMoeda(100, count);
        count = 0;
        while (valor % 50 != 0 && valor>50) {
            count++;
            valor = valor - 50;

        }
        papeisMoeda[4] = new PapelMoeda(50, count);
        count = 0;
        while (valor % 20 != 0 && valor>20) {
            count++;
            valor = valor - 20;

        }
        papeisMoeda[3] = new PapelMoeda(20, count);
        count = 0;
        while (valor % 10 != 0 && valor>10) {
            count++;
            valor = valor - 10;

        }
        papeisMoeda[2] = new PapelMoeda(10, count);
        count = 0;
        while (valor % 5 != 0 && valor>5) {
            count++;
            valor = valor - 5;

        }
        papeisMoeda[1] = new PapelMoeda(5, count);
        count = 0;
        while (valor % 2 != 0 && valor>2) {
            count++;
            valor = valor - 2;

        }
        papeisMoeda[0] = new PapelMoeda(2, count);
    }

    public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator(this);
    }

}
