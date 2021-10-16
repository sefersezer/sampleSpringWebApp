package org.example.services.implementations;

import org.example.services.ISampleService;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements ISampleService {
  @Override
  public Long toEuro(Long tl) {
    //todo bi işler yap
    long sonuc = tl * 20;
    return sonuc;
  }
}
