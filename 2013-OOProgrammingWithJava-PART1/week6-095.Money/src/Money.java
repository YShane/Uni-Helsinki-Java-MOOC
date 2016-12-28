//Use this money class whenever you need a money class
public class Money {

    private final int euros;   //final means it cannot be changed; "immutable"
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added) {

        if ((this.cents + added.cents) < 100) {
            return new Money((this.euros + added.euros), this.cents + added.cents);
        } else {
            return new Money(((this.euros + added.euros) + 1), (this.cents + added.cents) - 100);
        }

    }

    public boolean less(Money compared) {

        boolean x = true;
        if (this.euros > compared.euros) {

            x = false;

        } else if (this.euros == compared.euros) {

            if (this.cents > compared.cents) {
                x = false;
            } else if (this.cents < compared.cents) {
                x = true;
            }
        } else {
            x = true;
        }

        return x;

    }

    public Money minus(Money decremented) {

       

        if (this.euros > decremented.euros) {
            if((this.cents-decremented.cents)<0){
                return new Money(((this.euros-decremented.euros)-1),(100-(decremented.cents-this.cents)));
            }
            else{
                return new Money((this.euros-decremented.euros),(this.cents-decremented.cents));
            }

        } else if (this.euros < decremented.euros) {
            return new Money(0,0);

        } else //if (this.euros == decremented.euros) 
        {
                if((this.cents-decremented.cents)<=0){
                    return new Money(0,0);
                }
                else{
                    return new Money(0,(this.cents-decremented.cents));
                }
        }

    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
