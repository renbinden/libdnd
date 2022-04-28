package uk.co.renbinden.libdnd.item;

public final class Item<T extends ItemType> {

    private final T type;
    private int amount;

    public Item(T type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    public Item(T type) {
        this(type, 1);
    }

    public T getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
