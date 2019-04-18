package discuss.entity;


public class Salesitem {

  private long id;
  private String productid;
  private double unitprice;
  private long pcount;
  private long orderid;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getProductid() {
    return productid;
  }

  public void setProductid(String productid) {
    this.productid = productid;
  }


  public double getUnitprice() {
    return unitprice;
  }

  public void setUnitprice(double unitprice) {
    this.unitprice = unitprice;
  }


  public long getPcount() {
    return pcount;
  }

  public void setPcount(long pcount) {
    this.pcount = pcount;
  }


  public long getOrderid() {
    return orderid;
  }

  public void setOrderid(long orderid) {
    this.orderid = orderid;
  }

}
