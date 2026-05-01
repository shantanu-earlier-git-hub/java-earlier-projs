package bootjpa.practise1.services;

import bootjpa.practise1.entities.onetomany.Vehicle;
import bootjpa.practise1.repositories.DealerRepository;
import bootjpa.practise1.repositories.VehicleRepository;
import bootjpa.practise1.shared.onetomany.VehicleData;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;
    private final DealerRepository dealerRepository;

    public VehicleService(VehicleRepository vehicleRepository, DealerRepository dealerRepository) {
        this.vehicleRepository = vehicleRepository;
        this.dealerRepository = dealerRepository;
    }

    @Transactional(readOnly = true)
    public List<Vehicle> allVehicles() {
        return this.vehicleRepository.findAll();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Vehicle createNew(VehicleData vehicle) {
        var newVehicle = new Vehicle();
        BeanUtils.copyProperties(vehicle, newVehicle);
        var dealer = vehicle.getDealer();
        dealer = this.dealerRepository.save(dealer);
        vehicle.setDealer(dealer);
        return this.vehicleRepository.save(newVehicle);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Vehicle updateVehicle(VehicleData vehicle) {
        var updatedVehicle = this.vehicleRepository.findById(vehicle.getId()).get();
        if (updatedVehicle != null) {
            BeanUtils.copyProperties(vehicle, updatedVehicle);
            updatedVehicle = this.vehicleRepository.save(updatedVehicle);
        }
        return updatedVehicle;
    }

}
