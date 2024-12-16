package com.parkauto.rest.service;

import com.parkauto.rest.entity.Location;
import com.parkauto.rest.repository.ILocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    @Autowired
    private ILocationRepository locationRepository;

    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    public Location saveLocation(Location location) {
        return locationRepository.save(location);
    }

    public Location getLocationById(Long idLocation) {
        return locationRepository.findById(idLocation).orElseThrow(() -> new RuntimeException("Location not found"));
    }

    public void deleteLocation(Long idLocation) {
        Location location = getLocationById(idLocation);
        locationRepository.delete(location);
    }
}