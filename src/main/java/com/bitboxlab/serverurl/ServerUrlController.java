package com.bitboxlab.serverurl;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@CrossOrigin
@RestController
@RequestMapping("/api/url")
public class ServerUrlController {

    String url = "url";
    @PutMapping()
    public void updateUrl(@RequestParam("url") String url ) {
        this.url = url;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> getUrl( ) {
        HashMap<String, String> map = new HashMap<>();
        map.put("url", url);
    return map;
    }

}
