package bootjpa.practise1.web;

import bootjpa.practise1.entities.onetomany.Vehicle;
import bootjpa.practise1.services.VehicleService;
import bootjpa.practise1.shared.onetomany.VehicleData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/vehicle")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("/")
    public List<Vehicle> allVehicles() {
        return this.vehicleService.allVehicles();
    }

    @PostMapping("/new")
    public Vehicle createNew(@RequestBody VehicleData vehicle) {
        return this.vehicleService.createNew(vehicle);
    }

    @PutMapping("/update")
    public Vehicle updateVehicle(@RequestBody VehicleData vehicle) {
        return this.vehicleService.updateVehicle(vehicle);
    }

}
