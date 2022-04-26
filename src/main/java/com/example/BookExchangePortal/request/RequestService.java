package com.example.BookExchangePortal.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class RequestService {
    
    private RequestRepository requestRepository;

    @Autowired
    public RequestService(RequestRepository requestRepository){
        this.requestRepository = requestRepository;
    }

    public List<Request> getRequests(){
        return requestRepository.findAll();
    }
}
