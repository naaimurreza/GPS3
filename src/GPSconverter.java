/**
 *
 * @author naaimurreza
 */
public class GPSconverter {
    public String convert(String str) {
        double lat = Double.parseDouble(str.substring(0, 8));
        double lon = Double.parseDouble(str.substring(13, 22));
        if (str.charAt(10) == 'S') {
            lat *= -1;
        }
        if (str.charAt(24) == 'W') {
            lon *= -1;
        }
        return "<wpt lat=\"" + lat + "\" lon=\"" + lon + "\">";
    }
}