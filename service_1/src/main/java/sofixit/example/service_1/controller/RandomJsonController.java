package sofixit.example.service_1.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sofixit.example.service_1.dto.RandomJsonListDTO;
import sofixit.example.service_1.error.exception.BadVariableException;
import sofixit.example.service_1.service.RandomJsonService;

@RestController
@AllArgsConstructor
public class RandomJsonController {

    private final RandomJsonService randomJsonService;

    @GetMapping("/generate/json/{size}")
    public ResponseEntity<RandomJsonListDTO> generateJsonList(@PathVariable int size) throws BadVariableException {
        return ResponseEntity.ok(randomJsonService.generateJsonList(size));
    }

}
