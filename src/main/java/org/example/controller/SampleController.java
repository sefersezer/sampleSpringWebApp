package org.example.controller;

import org.example.services.ISampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sample")
public class SampleController {

  @Autowired
  private ISampleService sampleService;

  @GetMapping(value = "/{query}", produces = "application/json")
  public ResponseEntity<String> sample(@PathVariable(value = "query") String query, @RequestParam(value = "limit") Integer limit) {
    Long yeniSonuc = this.sampleService.toEuro(limit.longValue());
    return new ResponseEntity<>(query + " " + yeniSonuc, HttpStatus.OK);
  }


}