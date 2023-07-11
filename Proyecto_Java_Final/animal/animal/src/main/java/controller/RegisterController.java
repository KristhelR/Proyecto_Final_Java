package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RegisterController {

    @GetMapping("/animalId")
    public ResponseEntity<List<Record>> getTasks(@RequestParam String animalId){

        Util.getInstance();
        return new ResponseEntity<>(Util.getInstance().getValue(animalId),
                HttpStatus.OK);
    }

    @PutMapping("/saveAnimal/{animalId}")
    public ResponseEntity<String> save(@PathVariable String animalId, @RequestBody Record record){
        List<Record> record = Util.getInstance().getValue(animalId);
        if(record == null) {
            record = new ArrayList<Record>();
        }
        record.add(new Record(record.getAnimalId());
        Util.getInstance().add(animalId,record);
        return new ResponseEntity<>("added",
                HttpStatus.OK);
    }

}