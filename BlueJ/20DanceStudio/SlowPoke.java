import java.awt.Image;

public class SlowPoke extends Walker
{

  // Constructor
  public SlowPoke(int x, int y, Image leftPic, Image rightPic)
  {
      super (x, y, leftPic, rightPic);
  }
  
  public int distanceTraveled()
  {
      return super.distanceTraveled() / 10;
  }
}