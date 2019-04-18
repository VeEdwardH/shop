package discuss.entity;


public class Salesorder {

  private long id;
  private String userid;
  private long addrid;
  private long salesitem;
  private java.sql.Date odate;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }


  public long getAddrid() {
    return addrid;
  }

  public void setAddrid(long addrid) {
    this.addrid = addrid;
  }


  public long getSalesitem() {
    return salesitem;
  }

  public void setSalesitem(long salesitem) {
    this.salesitem = salesitem;
  }


  public java.sql.Date getOdate() {
    return odate;
  }

  public void setOdate(java.sql.Date odate) {
    this.odate = odate;
  }

}
