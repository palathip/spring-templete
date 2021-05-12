package com.project.app.controller;

import org.apache.ibatis.annotations.Delete;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class RestfulApiController {

    @GetMapping("/api/v1/restful")
    public ResponseEntity<String> getData() {

        return new ResponseEntity("Get Success", HttpStatus.OK);
    }

    @PostMapping("/api/v1/restful")
    public ResponseEntity<String> postData(){
        return new ResponseEntity("Post Success", HttpStatus.OK);
    }

    @PutMapping("/api/v1/restful")
    public ResponseEntity<String> putData(){
        return new ResponseEntity("Put Success", HttpStatus.OK);
    }


    @DeleteMapping("/api/v1/restful")
    public ResponseEntity<String> deleteData(){
        return new ResponseEntity("delete Success", HttpStatus.OK);
    }

}
