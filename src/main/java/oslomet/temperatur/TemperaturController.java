package oslomet.temperatur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperaturController {
    private final Integer[] tempArray = new Integer[]{-3,-2,2,7,11,15,18,19,12,8,3,-2};

    @GetMapping("/temp")
    public int getTemp(String month){
        int temp = switch (month.toLowerCase()){
            case "januar" -> tempArray[0];
            case "februar" -> tempArray[1];
            case "mars" -> tempArray[2];
            case "april" -> tempArray[3];
            case "mai" -> tempArray[4];
            case "juni" -> tempArray[5];
            case "juli" -> tempArray[6];
            case "august" -> tempArray[7];
            case "september" -> tempArray[8];
            case "oktober" -> tempArray[9];
            case "november" -> tempArray[10];
            case "desember" -> tempArray[11];
            default -> 0;
        };
        return temp;
    }
}
