package com.example.BookExchangePortal.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.example.BookExchangePortal.user.User;
import com.example.BookExchangePortal.user.UserRepository;


@Service
public class RequestService {
    
    private RequestRepository requestRepository;
    private UserRepository userRepository;

    @Autowired
    public RequestService(RequestRepository requestRepository,UserRepository userRepository){
        this.requestRepository = requestRepository;
        this.userRepository = userRepository;
    }

    public List<Request> getRequests(){
        return requestRepository.findAll();
    }

    public void addNewRequest(Request request) {
        Optional<User> userOptional = userRepository.findUserByEmail(request.getRequestCreator().getEmail());
		if(userOptional.isPresent()){
            Request newRequest = new Request(request.getBookTitle(), request.getExpectedRetDtTime(), userOptional.get());
            requestRepository.save(newRequest);
		}		
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
