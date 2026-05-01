package bootjpa.practise1.web;

import bootjpa.practise1.entities.onetomany.Dealer;
import bootjpa.practise1.services.DealerService;
import bootjpa.practise1.shared.onetomany.DealerData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/dealer")
public class DealerController {

    private final DealerService dealerService;

    public DealerController(DealerService dealerService) {
        this.dealerService = dealerService;
    }

    @GetMapping("/")
    public List<Dealer> getAll() {
        return this.dealerService.getAll();
    }

    @PostMapping("/new")
    public Dealer addDealer(@RequestBody DealerData dealer) {

        return this.dealerService.addDealer(dealer);
    }


}
