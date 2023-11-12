public class Toys implements Comparable<Toys> {
    
    private static int base_id;

    private int id;
    private String name;
    private int quantity;
    private int frequency;

    {
        base_id++;
    }

    public Toys(String name, int quantity, int frequency) {
        this.id = base_id;
        this.name = name;
        this.quantity = quantity;
        this.frequency = frequency;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
    }


    @Override
    public String toString() {
        return "\n[Игрушка] id: " + this.id + ", название: " + this.name + ", кол-во: " + this.quantity + ", частота: " + this.frequency;
    }

    @Override
    public int compareTo(Toys t) {
        return Integer.compare(t.getFrequency(), this.frequency);
    }

}