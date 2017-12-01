package com.kodilla;

interface ATM {

    void payIn();

    void payOut();

    default void connectionWithBank() {
        System.out.println("Lacze z bankiem.." + "\n" + "Polaczenie z bankiem aktywne");
    }

    static void infoEndWorkATM() {
        System.out.println("Koniec pracy bankomatu");
    }
}

class ATMImpl implements ATM {

    public void payIn() {
        System.out.println("Proces wplaty rozpoczety pomyslnie");
    }

    public void payOut() {
        System.out.println("Proces wyplaty rozpoczety pomyslnie");
    }
}

class Zadanie2 {
    public static void main (String[] args) {

        ATMImpl atmImpl = new ATMImpl();

        atmImpl.connectionWithBank();
        atmImpl.payIn();
        atmImpl.payOut();
        ATM.infoEndWorkATM();


    }
}
