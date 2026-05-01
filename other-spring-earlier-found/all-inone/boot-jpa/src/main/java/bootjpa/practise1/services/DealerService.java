package bootjpa.practise1.services;

import bootjpa.practise1.entities.onetomany.Dealer;
import bootjpa.practise1.repositories.DealerRepository;
import bootjpa.practise1.shared.onetomany.DealerData;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DealerService {

    private DealerRepository dealerRepository;

    public DealerService(DealerRepository dealerRepository) {
        this.dealerRepository = dealerRepository;
    }

    @Transactional(readOnly = true)
    public List<Dealer> getAll() {
        return this.dealerRepository.findAll();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Dealer addDealer(DealerData dealer) {
        var newdealer = new Dealer();
        BeanUtils.copyProperties(dealer, newdealer);
        var newDealer = this.dealerRepository.save(newdealer);
        return newDealer;
    }

}
