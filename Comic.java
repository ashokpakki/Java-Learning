class Comic {
    private String title;
    private String illustrator;
    private double price;

    public Comic(String title, String illustrator, double price) {
        this.title = title;
        this.illustrator = illustrator;
        this.price = price;
    }

    //getters
    public String getTitle() {
        return title;
    }
    public String getIllustrator() {
        return illustrator;
    }
    public double getPrice() {
        return price;
    }

    //setters
    public void setPrice(double price) {
        if(price > 0)this.price = price;
    }
}

public static void main(String[] args) {
    Comic superman = new Comic("Superman", "Joe Shuster");

    superman.getTitle();
    superman.getIllustrator();

    superman.setPrice(500.0);

    System.out.println(superman.getPrice());
}