class Admin
{
    private int adminId;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    
    //default constructor
    Admin()
    {
    }
    
    //parameterized constructor
    Admin(int adminId, String email, String firstName, String password)
    {
        this.adminId = adminId;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
    }
    
    //getters
    public int getAdminId()
    {
        return this.adminId;
    }
    
    public String getEmailId()
    {
        return this.email;
    }
    
    public String getPassword()
    {
        return this.password;
    }
    
    public String getFirstName()
    {
        return this.firstName;
    }
    
    public String getLastName()
    {
        return this.lastName;
    }
    
    //setters
    public void setAdminId(int uid)
    {
        this.adminId = uid;
    }
    
    public void setEmailId(String a)
    {
        this.email = a;
    }
    
    public void setPassword(String a)
    {
        this.password = a;
    }
    
    public void setFirstName(String a)
    {
        this.firstName = a;
    }
    
    public void setLastName(String a)
    {
        this.lastName = a;
    }
    
    //toString
    @Override
    public String toString()
    {
        return String.format("Admin [adminId=%d, emailId=%s, firstName=%s, password=%s]",
                        adminId, email, firstName, password);
    }
    
}
class Product
{
    private int productId;
    private String productName;
    private String description;
    private String category;
    private double price;
    private int quantity;
    
    //default constructor
    Product()
    {
    }
    
    //parameterized constructor
    Product(int productId,String productName, String description, double price, int quantity, String category)
    {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }
    
    //getters
    public int getProductId()
    {
        return this.productId;
    }
    
    public String getProductName()
    {
        return this.productName;
    }
    
    public String getDescription()
    {
        return this.description;
    }
    
    public String getCategory()
    {
        return this.category;
    }
    
    public double getPrice()
    {
        return this.price;
    }
    
    public int getQuantity()
    {
        return this.quantity;
    }
    
    
    //setters
    public void setProductId(int pid)
    {
        this.productId = pid;
    }
    
    public void setProductName(String a)
    {
        this.productName = a;
    }
    
    public void setDescription(String a)
    {
        this.description = a;
    }
    
    public void setCategory(String a)
    {
        this.category = a;
    }
    
    public void setPrice(double p)
    {
        this.price = p;
    }
    
    public void setQuantity(int q)
    {
        this.quantity = q;
    }
    //toString
    @Override
    public String toString()
    {
        return String.format("Product [productId=%d, productName=%s, productDescription=%s, price=%.1f, quantity=%d, Category=%s]",
                        productId, productName, description, price, quantity, category);
    }
    
}