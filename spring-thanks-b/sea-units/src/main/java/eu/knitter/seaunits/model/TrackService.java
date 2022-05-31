package eu.knitter.seaunits.model;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class TrackService {

    @EventListener(ApplicationReadyEvent.class)
    public List<Point> getTracks() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", "Bearer TYPE_IN_YOUR_BEARER");

        HttpEntity httpEntity = new HttpEntity(httpHeaders);

        // In order to obtain the access token to the data, send the following curl (don't forget that you need to register the account via: https://www.barentswatch.no/)
        //curl -X POST --header "Content-Type: application/x-www-form-urlencoded"
        // -d "client_id=myusername@example.com:myclient&scope=api&client_secret=mypassword&grant_type=client_credentials" https://id.barentswatch.no/connect/token

         ResponseEntity<Track[]> exchange = restTemplate.exchange("https://www.barentswatch.no/bwapi/v2/geodata/ais/openpositions?Xmin=10.09094&Xmax=10.67047&Ymin=63.3989&Ymax=63.58645",
                HttpMethod.GET,
                httpEntity,
                Track[].class);
        //Execute the HTTP method to the given URI template, writing the given request entity to the request, and returns the response as ResponseEntity.
        //        url - the URL (String url)
        //        method - the HTTP method
        //        requestEntity - the entity (headers and/or body) to write to the request may be null) (HttpEntity<?> requestEntity)
        //        responseType - the type to convert the response to, or Void.class for no body  (Class<T> responseType)

        List<Point> collect = Stream.of(exchange.getBody()).map(track -> new Point(
                track.getGeometry().getCoordinates().get(0),
                track.getGeometry().getCoordinates().get(1),
                track.getName(),
                track.getDestination()
        )).collect(Collectors.toList());
        return collect;
    }
}
