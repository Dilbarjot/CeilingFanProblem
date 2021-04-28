package Implementation02;

public class CeilingFanReverseCommand implements Command {
  private final CeilingFan ceilingFan;

  public CeilingFanReverseCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  /**
   * Executing this command will reverse the direction
   * reverseDirection is a boolean flag, and reversing it using ! operator
   */
  public void execute() {
    boolean directionReversed = ceilingFan.getDirectionReversed();
    ceilingFan.setDirectionReversed(!directionReversed);
  }
}
