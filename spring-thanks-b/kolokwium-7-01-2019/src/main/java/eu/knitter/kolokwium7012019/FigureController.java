//Create an endpoint, which allows the user to calculate permiter of a triangle or a rectangle. Type of the figure and its sides (sideA, sideB,..) will be passed in URL (1.5 point)

package eu.knitter.kolokwium7012019;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FigureController {

    @GetMapping("/calculate")
    public int calculatePerimeter(@RequestParam String figure, @RequestParam int sideA, @RequestParam int sideB, @RequestParam(required = false) Integer sideC){
        if(figure.equalsIgnoreCase("rectangle")){
            return (2*sideA+2*sideB);
        } else if (figure.equalsIgnoreCase("triangle")){
            return (sideA+sideB+sideC);
        }
        return -1;
    }
}
