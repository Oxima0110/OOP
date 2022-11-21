package Seminar_1;

public class Chocolate extends Product {

    private Double cacao;

    public Chocolate(String name, Double price) {
        super(name, price);
    }

    public Chocolate(String name) {
        super(name);
    }

    public Chocolate(String name, Double price, Double cacao) {
        super(name, price);
        this.cacao = cacao;
    }

    public Double getCacao() {
        return this.cacao;
    }

    @Override
    public String toString() {
        return String.format("%s %,.2f", super.toString(), getCacao());
    }
}
