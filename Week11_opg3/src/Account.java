public class Account {
    private String transaction_date;
    private String product;
    private double price;
    private String payment_type;
    private String card_number;
    private String name;
    private String city;
    private String state;
    private String country;
    private String account_created;
    private String last_login;
    private double lat;
    private double long_;


    public Account(String transaction_date,String product, double price, String payment_type,String card_number, String name, String city, String state, String country, String account_created, String last_login,double lat,double long_) {
        this.transaction_date = transaction_date;
        this.product=product;
        this.price=price;
        this.payment_type = payment_type;
        this.card_number = card_number;
        this.name = name;
        this.city = city;
        this.state = state;
        this.country = country;
        this.account_created = account_created;
        this.last_login = last_login;
        this.lat=lat;
        this.long_=long_;
    }

    public String getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(String transaction_date) {
        this.transaction_date = transaction_date;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAccount_created() {
        return account_created;
    }

    public void setAccount_created(String account_created) {
        this.account_created = account_created;
    }

    public String getLast_login() {
        return last_login;
    }

    public void setLast_login(String last_login) {
        this.last_login = last_login;
    }

    public float getLat() {
        return (float) lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLong_() {
        return (float) long_;
    }

    public void setLong_(float long_) {
        this.long_ = long_;
    }

    @Override
    public String toString() {
        return String.format("Account{" +
                "transaction_date='" + transaction_date + '\'' +
                ", product='" + product + '\'' +
                ", price=" + price +
                ", payment_type='" + payment_type + '\'' +
                ", card_number='" + card_number + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", account_created='" + account_created + '\'' +
                ", last_login='" + last_login + '\'' +
                ", lat=" + lat +
                ", long_=" + long_ +
                '}');
    }
    public int setCreditCard (int creditCartNumber) {
        int sum = 0;
        //creditCartNumber = Integer.parseInt(String.valueOf(card_number));

        for (int i = card_number.length(); i>0;i=i-2) {
            if (creditCartNumber>9) {
                sum+=(i/2)*2;
            } else {
                sum+=i*2;
            }

        }
        sum = sum/card_number.length();
        System.out.println(sum%10);
        return sum%10;
    }
}
