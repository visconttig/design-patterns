public abstract class CreditCard {

    // fields
    private final Integer id;
    private final Integer limit;
    private final boolean isInternational;

    public CreditCard(Integer id, Integer limit, boolean isInternational) {
        this.id = id;
        this.limit = limit;
        this.isInternational = isInternational;
    }

    public Integer getId() {
        return id;
    }


    public boolean isInternational() {
        return isInternational;
    }


    protected Integer getLimit(){
        return limit;
    }
}
