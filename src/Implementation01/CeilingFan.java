package Implementation01;

public class CeilingFan {
  private final int numberOfSpeedLevels;
  private int speed;
  private boolean directionReversed;

  public CeilingFan(int numberOfSpeedLevels) {
    this.speed = 0;
    this.numberOfSpeedLevels = numberOfSpeedLevels;
    this.directionReversed = false;
  }

  public void pullSpeedCord() {
    speed = (speed + 1) % numberOfSpeedLevels;
  }

  /**
   * Executing this command will reverse the direction
   * directionReversed is a boolean flag, and reversing it using ! operator
   */
  public void pullReverseCord() {
    directionReversed = !directionReversed;
  }

  /*
  Commenting out since no use of it as of now
  public int getSpeed() {
    return speed;
  }

  public boolean isDirectionReversed() {
    return directionReversed;
  }
  */

  public String toString() {
    return "Speed of the fan: " + speed + "\n" +
        "Direction: " + (directionReversed ? "Reversed" : "Regular");
  }
}
