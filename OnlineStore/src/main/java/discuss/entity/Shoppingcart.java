package discuss.entity;


public class Shoppingcart {

  private long id;
  private long userid;
  private String cartitem;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public String getCartitem() {
    return cartitem;
  }

  public void setCartitem(String cartitem) {
    this.cartitem = cartitem;
  }

}
