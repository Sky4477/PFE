package app.mobility.Smart_mobility.Service.Imp;

import app.mobility.Smart_mobility.Model.Station;
import app.mobility.Smart_mobility.Repository.StationRepository;
import app.mobility.Smart_mobility.Service.Interf.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StationServiceImpl implements StationService {

    @Autowired
    private StationRepository stationRepository;

    @Override
    public Station createStation(Station station) {
        return stationRepository.save(station);
    }

    @Override
    public Station getStationByName(String name) {
        return stationRepository.findByName(name);
    }

    @Override
    public List<Station> getAllStations() {
        return stationRepository.findAll();
    }

    @Override
    public Station updateStation(Long id, Station updatedStation) {
        Optional<Station> optionalStation = stationRepository.findById(id);
        if (optionalStation.isPresent()) {
            updatedStation.setId(id);
            return stationRepository.save(updatedStation);
        }
        return null; // Ou gérer le cas où la station n'est pas trouvée
    }

    @Override
    public void deleteStation(Long id) {
        stationRepository.deleteById(id);
    }
}
