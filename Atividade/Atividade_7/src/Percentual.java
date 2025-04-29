class Percentual implements Aumento {
    private double percentual;

    public Percentual(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public void aplicarAumento(Empregados empregados) {
        double aumento = empregados.getSalarioMensal() * (percentual / 100);
        empregados.setSalarioMensal(empregados.getSalarioMensal() + aumento);
    }
}
