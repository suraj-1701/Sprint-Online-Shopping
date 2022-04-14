class ProductNotFoundException extends RuntimeException 
{
  ProductNotFoundException()
  {
    super();
  }
}
class Product
{
    private int productId;
    private String productName;
    private String description;
    private String category;
    private int price;
    private int quantity;
    
    //default constructor
    Product()
    {
    }
    
    //parameterized constructor
    Product(int productId,String productName, String description, int price, int quantity, String category)
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
    
    public int getPrice()
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
    
    public void setPrice(int p)
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
        return String.format("Product [productId=%d, productName=%s, description=%s, price=%d, quantity=%d, category=%s]",
                        productId, productName, description, price, quantity, category);
    }
    
}

interface AdminService
{
  void createProduct(Product product);
  Product updateProduct(Product product);
  void deleteProduct(int id);
  Product searchProduct(int id);
  Product[] getProducts();
}

class AdminServiceImpl implements AdminService
{
  public static Product productArray[] = new Product[5];
  public static int count = 0;

  //implementations
  @Override
  public void createProduct(Product product)
  {
    productArray[count++] = product;
  }

  @Override
  public Product updateProduct(Product product) throws ProductNotFoundException
  {
    for(int i=0; i<5; i++)
    {
      if(product.getProductId() == productArray[i].getProductId())
      {
        productArray[i] = product;
        return productArray[i];
      }
    }
    throw new ProductNotFoundException();
  }

  @Override
  public void deleteProduct(int id) throws ProductNotFoundException
  {
    for(int i=0; i<5; i++)
    {
      if(productArray[i].getProductId() == id)
      {
        productArray[i] = null;
      }
    }
    throw new ProductNotFoundException();
  }

  @Override
  public Product searchProduct(int id)
  {
    for(int i=0; i<5; i++)
    {
      if(productArray[i].getProductId() == id)
      {
        return productArray[i];
      }
    }
    throw new ProductNotFoundException();
  }

  @Override
  public Product[] getProducts()
  {
    return productArray;
  }
}