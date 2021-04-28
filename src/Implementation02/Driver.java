package Implementation02;

/**
 * Driver class to test the implementation 01 using an instance of Ceiling Fan, and instance of change speed and
 * reverse direction command
 */
public class Driver {
  public static void main(String[] args) {
    CeilingFan ceilingFan = new CeilingFan(4);
    CeilingFanChangeSpeed ceilingFanChangeSpeed = new CeilingFanChangeSpeed(ceilingFan);
    CeilingFanReverseCommand ceilingFanReverseCommand = new CeilingFanReverseCommand(ceilingFan);
    System.out.println(ceilingFan);
    ceilingFanChangeSpeed.execute();
    System.out.println(ceilingFan);
    ceilingFanChangeSpeed.execute();
    System.out.println(ceilingFan);
    ceilingFanReverseCommand.execute();
    System.out.println(ceilingFan);
    ceilingFanChangeSpeed.execute();
    System.out.println(ceilingFan);
    ceilingFanReverseCommand.execute();
    System.out.println(ceilingFan);
    ceilingFanChangeSpeed.execute();
    System.out.println(ceilingFan);
  }
}
