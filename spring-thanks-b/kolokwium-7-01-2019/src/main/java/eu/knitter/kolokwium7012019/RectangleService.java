// Inside application.properties define 4 sets of data for rectangles (sideA,sideB).
// Then load the data from application.properties and provide a service, which will store values in the DB. (1.5 point)

package eu.knitter.kolokwium7012019;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;





@Service
public class RectangleService {

        private RectangleRepo rectangleRepo;

        @Autowired
        public RectangleService(RectangleRepo rectangleRepo) {
                this.rectangleRepo = rectangleRepo;
        }

        @Value("${siteA1}")
        private int siteA1 = 1;
        @Value("${siteB1}")
        private int siteB1 = 2;

        @Value("${siteA2}")
        private int siteA2 = 3;
        @Value("${siteB2}")
        private int siteB2 = 5;

        @Value("${siteA3}")
        private int siteA3 = 1;
        @Value("${siteB3}")
        private int siteB3 = 4;

        @Value("${siteA4}")
        private int siteA4 = 3;
        @Value("${siteB4}")
        private int siteB4 = 3;

        //run immediately after the app is ready
        @EventListener(ApplicationReadyEvent.class)
        public void addRectangles(){
                Rectangle rectangle1 = new Rectangle(siteA1, siteB1);
                Rectangle rectangle2 = new Rectangle(siteA2, siteB2);
                Rectangle rectangle3 = new Rectangle(siteA3, siteB3);
                Rectangle rectangle4 = new Rectangle(siteA4, siteB4);
                rectangleRepo.save(rectangle1);
                rectangleRepo.save(rectangle2);
                rectangleRepo.save(rectangle3);
                rectangleRepo.save(rectangle4);


        }

}
