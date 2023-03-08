package com.text.analyzer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnalyzerController {

    @PostMapping("/analyze")
    public TextAnalysisResult analyzeText(@RequestBody String text )

}
