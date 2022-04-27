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

    public void deleteRequest(Integer reqId){
		boolean exists = requestRepository.existsById(reqId);
		if(!exists)
		{
			throw new IllegalStateException("User with Id "+reqId+" does not exists.");
		}
		requestRepository.deleteById(reqId);
	}

}
