public class Shanghai extends AbstractDance
{
  private static DanceStep[] steps = 
    {
      //            t1L  dxL  dyL t2L   t1R  dxR  dyR  t2R
      new DanceStep(  0,  80,   0, 0,    0,   0,   0,   0),
      new DanceStep(  0,   0,   0, 0,    0,  80,  50,   0),
      new DanceStep(  0,   0,  50, 0,    0,   0,   0,   0),
      new DanceStep(  0,   0,   0, 0,    0, -80,   0,   0),
      new DanceStep(  0, -80, -50, 0,    0,   0,   0,   0),
      new DanceStep(  0,   0,   0, 0,    0,   0, -50,   0)
    };

  private static int[] rhythm = {1, 2, 2, 1, 2, 2};

  public Shanghai()
  {
    super(steps, rhythm);
  }

  public String getName()
  {
    return "Shanghai";
  }

  public int getTempo()
  {
    return 200;
  }
}
