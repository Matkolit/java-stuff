import java.util.Scanner;

public class Distance {
  private static final double EARTH_RADIUS = 6371.0;
  private static final double WARSAW_LON = 21.008490;
  private static final double WARSAW_LAT = 52.234982;

  public static void main(String[] args) {
    Scanner userIn = new Scanner(System.in);

    var coordinates = getLonLat(userIn);

    var distance = distance(WARSAW_LAT, WARSAW_LON, coordinates[1], coordinates[0]);

    System.out.printf("\nOdległość między punktami wynosi %.2fkm.\n", distance);
    userIn.close();

  }

  public static Double[] getLonLat(Scanner userIn) {
    double lon = 0.0, lat = 0.0;
    boolean isLonValid = false, isLatValid = false;

    while (!isLonValid) {
      try {
        System.out.println("Wprowadź długość geograficzną punktu docelowego");
        lon = userIn.nextDouble();
        isLonValid = true;
      } catch (Exception e) {
        clearBuffer(userIn);
      }
    }
    while (!isLatValid) {
      try {
        System.out.println("Wprowadź szerokość geograficzną punktu docelowego");
        lat = userIn.nextDouble();
        isLatValid = true;
      } catch (Exception e) {
        clearBuffer(userIn);
      }
    }
    return new Double[] { lon, lat };
  }

  public static double distance(double lat1, double lon1, double lat2, double lon2) {
    double dLat = Math.toRadians(lat2 - lat1);
    double dLon = Math.toRadians(lon2 - lon1);

    lat1 = Math.toRadians(lat1);
    lat2 = Math.toRadians(lat2);

    double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
        Math.sin(dLon / 2) * Math.sin(dLon / 2) * Math.cos(lat1) * Math.cos(lat2);
    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

    return EARTH_RADIUS * c;
  }

  private static void clearBuffer(Scanner scanner) {
    System.out.println("Niepoprawny format liczby. Spróbuj ponownie");
    scanner.nextLine();
  }
}
