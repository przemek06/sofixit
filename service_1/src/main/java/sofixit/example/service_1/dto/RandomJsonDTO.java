package sofixit.example.service_1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record RandomJsonDTO(
        String _type,
        long _id,
        String key,
        String name,
        String fullName,
        @JsonProperty("iata_airport_code")
        String iataAirportCode,
        String type,
        String country,
        @JsonProperty("geo_position")
        GeoPositionDTO geoPosition,
        @JsonProperty("location_id")
        long locationId,
        boolean inEurope,
        String countryCode,
        boolean coreCountry,
        double distance
) {
}
