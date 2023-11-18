package sofixit.example.service_1.service;

import org.springframework.stereotype.Service;
import sofixit.example.service_1.dto.GeoPositionDTO;
import sofixit.example.service_1.dto.RandomJsonDTO;
import sofixit.example.service_1.dto.RandomJsonListDTO;
import sofixit.example.service_1.error.exception.BadVariableException;

import java.util.Random;
import java.util.stream.Stream;

@Service
public class RandomJsonService {

    public RandomJsonListDTO generateJsonList(int size) throws BadVariableException {
        if (size < 0) {
            throw new BadVariableException();
        }

        var jsonList = Stream
                .generate(this::generateRandomJson)
                .limit(size)
                .toList();

        return new RandomJsonListDTO(jsonList);
    }

    private RandomJsonDTO generateRandomJson() {
        return new RandomJsonDTO(
                getRandomString(),
                getRandomId(),
                getRandomString(),
                getRandomString(),
                getRandomString(),
                getRandomString(),
                getRandomString(),
                getRandomString(),
                new GeoPositionDTO(getRandomDouble(), getRandomDouble()),
                getRandomId(),
                getRandomBoolean(),
                getRandomString(),
                getRandomBoolean(),
                getRandomDouble()
        );
    }

    private long getRandomId() {
        // Implement logic to generate a random ID
        return new Random().nextLong();
    }

    private String getRandomString() {
        // Implement logic to generate a random string
        return "RandomString" + new Random().nextInt(100);
    }

    private double getRandomDouble() {
        // Implement logic to generate a random double
        return new Random().nextDouble(100.0);
    }

    private boolean getRandomBoolean() {
        // Implement logic to generate a random boolean
        return new Random().nextBoolean();
    }

}
