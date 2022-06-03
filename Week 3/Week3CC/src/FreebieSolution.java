import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FreebieSolution {
    public String deleteAllNumbers(String s) {

        s = s.replaceAll("\\d","");

        return s;
    }
}
