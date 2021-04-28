package Implementation01;

/**
 * Driver class to test the implementation 01 using an instance of Ceiling Fan
 */
public class Driver {
  public static void main(String[] args) {
    CeilingFan ceilingFan = new CeilingFan(4);
    ceilingFan.pullReverseCord();
    System.out.println(ceilingFan);
    ceilingFan.pullSpeedCord();
    System.out.println(ceilingFan);
    ceilingFan.pullSpeedCord();
    System.out.println(ceilingFan);
    ceilingFan.pullSpeedCord();
    System.out.println(ceilingFan);
    ceilingFan.pullSpeedCord();
    System.out.println(ceilingFan);
    ceilingFan.pullSpeedCord();
    System.out.println(ceilingFan);
    ceilingFan.pullReverseCord();
    System.out.println(ceilingFan);
  }
}