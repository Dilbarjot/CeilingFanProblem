package Implementation02;

public class CeilingFan {
  private final int numberOfSpeedLevels;
  private int speed;
  private boolean directionReversed;

  public CeilingFan(int numberOfSpeedLevels) {
    this.speed = 0;
    this.numberOfSpeedLevels = numberOfSpeedLevels;
    this.directionReversed = false;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public void setDirectionReversed(boolean directionReversed) {
    this.directionReversed = directionReversed;
  }

  public boolean getDirectionReversed() {
    return directionReversed;
  }

  public int getSpeed() {
    return speed;
  }

  public int getNumberOfSpeedLevels() {
    return numberOfSpeedLevels;
  }


  public String toString() {
    return "Speed of the fan: " + speed + "\n" +
        "Direction: " + (directionReversed ? "Reversed" : "Regular");
  }
}
