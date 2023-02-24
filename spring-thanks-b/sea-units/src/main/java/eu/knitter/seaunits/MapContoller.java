package eu.knitter.seaunits;

import eu.knitter.seaunits.model.TrackService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapContoller {

    private final TrackService trackService;

    public MapContoller(TrackService trackService) {
        this.trackService = trackService;
    }

    @GetMapping
    public String getMap(Model model){
        model.addAttribute("tracks", trackService.getTracks());

        return "leafletmap";
    }
}

