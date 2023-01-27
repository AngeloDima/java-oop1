package jana60.bank;



class Conto {
    private int numeroConto;
    private String nomeProprietario;
    private double saldo;

    public Conto(int numeroConto, String nomeProprietario) {
        this.numeroConto = numeroConto;
        this.nomeProprietario = nomeProprietario;
        this.saldo = 0;
    }

    public void versare(double importo) {
        this.saldo += importo;
    }

    public boolean prelevare(double importo) {
        if (importo > this.saldo) {
            return false;
        }
        this.saldo -= importo;
        return true;
    }

    public int getNumeroConto() {
        return numeroConto;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getSaldoFormattato() {
        return String.format("€%.2f", saldo);
    }
}
