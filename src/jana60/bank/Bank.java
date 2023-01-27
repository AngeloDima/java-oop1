package jana60.bank;

import java.util.Scanner;

class Bank {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String nome = s.nextLine();
        int numeroConto = (int) (Math.random() * 1000) + 1;
        Conto conto = new Conto(numeroConto, nome);

        boolean esci = false;
        while (!esci) {
            System.out.println("Cosa vuoi fare? versare, prelevare, esci");
            String scelta = s.nextLine();
            if (scelta.equals("versare")) {
                System.out.print("Inserisci l'importo da versare: ");
                double importo = s.nextDouble();
                s.nextLine();
                conto.versare(importo);
                System.out.println("Saldo attuale: " + conto.getSaldoFormattato());
            } else if (scelta.equals("prelevare")) {
                System.out.print("Inserisci l'importo da prelevare: ");
                double importo = s.nextDouble();
                s.nextLine();
                if (!conto.prelevare(importo)) {
                    System.out.println("Operazione non valida: saldo insufficiente");
                } else {
                    System.out.println("Saldo attuale: " + conto.getSaldoFormattato());
                }
            } else if (scelta.equals("esci")) {
                esci = true;
            } else {
                System.out.println("Scelta non valida, riprova.");
            }
        }
    }
}
