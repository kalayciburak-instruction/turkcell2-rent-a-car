package kodlama.io.rentacar.adapters;

import kodlama.io.rentacar.business.abstracts.PosService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class FakePosServiceAdapter implements PosService {
    @Override
    public void pay() {
        boolean isPaymentSuccessful = new Random().nextBoolean();
        if(!isPaymentSuccessful) throw new RuntimeException("Ödeme reddedildi.");
    }
}
