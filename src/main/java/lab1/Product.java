package lab1;

public class Product {
    private int id;
    private String name;
    private String category;
    private double price;

    /**
     * Product constructor
     * @param builder
     */
    private Product(ProductBuilder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.category = builder.category;
        this.price = builder.price;
    }

    /**
     * toString
     * @return class description in string format
     */
    @Override
    public String toString() {
        return "Id: " + id + "\n"
                + "Name: " + name + "\n"
                + "Category: " + category + "\n"
                + "Price: " + price + "\n";
    }

    /**
     * equals
     * @param obj taken obj
     * @return verdict of equality with boolean type
     */
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || obj.getClass() != this.getClass()) return false;
        Product product = (Product) obj;
        return (product.id == this.id);
    }

    /**
     * hashCode
     * @return hash
     */
    @Override
    public int hashCode(){
        return 31 * 9 + this.id;
    }

    /**
     * Builder pattern
     */
    public static class ProductBuilder {

        private int id;
        private String name;
        private String category = " ";
        private double price = 0.0;

        /**
         * Builder constructor
         */
        public ProductBuilder setId(int id){
            this.id= id;
            return this;
        }

        public ProductBuilder setName(String name){
            this.name = name;
            return this;
        }

        /**
         * Builder price setter
         */
        public ProductBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        /**
         * Builder category setter
         */
        public ProductBuilder setCategory(String category) {
            this.category = category;
            return this;
        }



        /**
         * Builder build method
         */
        public Product build(){
            return new Product(this);
        }

    }

    /**
     * name getter
     */
    public String getName() {
        return name;
    }

    /**
     * price getter
     */
    public double getPrice() {
        return price;
    }

    /**
     * id getter
     */
    public int getId() {
        return id;
    }

    /**
     * category getter
     */
    public String getCategory() {
        return category;
    }


    /**
     * name setter
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * category setter
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * price setter
     */
    public void setPrice(double price) {
        this.price = price;
    }


}
