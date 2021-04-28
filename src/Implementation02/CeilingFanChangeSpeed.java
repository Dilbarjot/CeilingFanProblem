package Implementation02;

public class CeilingFanChangeSpeed implements Command {
  private final CeilingFan ceilingFan;

  public CeilingFanChangeSpeed(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  /**
   * To execute, we get the speed of fan and increment it
   * To make sure we stay within the range of fan's allowable speed, we take modulo number of speed levels
   * Then, we set the speed using setter method
   */
  public void execute() {
    int prevSpeed = ceilingFan.getSpeed();
    int numberOfSpeedLevels = ceilingFan.getNumberOfSpeedLevels();
    int currentSpeed = (prevSpeed + 1) % numberOfSpeedLevels;
    ceilingFan.setSpeed(currentSpeed);
  }
}