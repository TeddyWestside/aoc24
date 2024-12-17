package day3;

import lombok.Data;
import utils.SharedFunctions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Data
public class MultiplicationParser {

    public long parseAndAddProducts(String path) {
        var lines = SharedFunctions.getLines(path);
        return sumMultiplications(lines.toString());
    }

    private int sumMultiplications(String memory) {
        int sum = 0;
        Pattern pattern = Pattern.compile("mul\\s*\\(\\s*(\\d{1,3})\\s*,\\s*(\\d{1,3})\\s*\\)");
        Matcher matcher = pattern.matcher(memory);

        while (matcher.find()) {
            int x = Integer.parseInt(matcher.group(1));
            int y = Integer.parseInt(matcher.group(2));
            sum += x * y;
        }

        return sum;
    }
}
