package com.example.BookExchangePortal.request;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/requests")
public class RequestController {
    
    private final RequestService requestService;

    @Autowired
    public RequestController(RequestService requestService){
        this.requestService = requestService;
    }

    @GetMapping
    public List<Request> getRequests(){
        return requestService.getRequests();
    }

    @DeleteMapping(path = "{reqId}")
    public void deleteUser(@PathVariable("reqId") Integer reqId){
        requestService.deleteRequest(reqId);
    }

}
