package com.ncsi.spring.boot.auth.service.repository;

import org.springframework.data.repository.CrudRepository;

import com.ncsi.spring.boot.auth.service.model.TraceRequest;

public interface Service1Repository extends CrudRepository<TraceRequest, Integer>  {

}
