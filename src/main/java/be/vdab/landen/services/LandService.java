package be.vdab.landen.services;

import be.vdab.landen.repositories.LandRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class LandService {
    private final LandRepository landRepository;

    public LandService(LandRepository landRepository) {
        this.landRepository = landRepository;
    }

    public long findAantal() {
        return landRepository.count();
    }
}
