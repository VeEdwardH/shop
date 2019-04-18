package discuss.entity;


public class Cartitem {

  private long id;
  private long productid;
  private double unitprice;
  private long pcount;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getProductid() {
    return productid;
  }

  public void setProductid(long productid) {
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

}
