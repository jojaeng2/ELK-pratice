package elk.practice.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ELKController {


  @GetMapping("/success")
  public ResponseEntity<?> successMethod() {
    log.info("successMethod");
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @GetMapping("/fail")
  public ResponseEntity<?> failMethod() {
    log.error("failMethod");
    throw new RuntimeException();
  }
}
