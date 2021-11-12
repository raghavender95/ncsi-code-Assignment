package com.ncsi.spring.boot.cloud.gateway.repository;

import org.springframework.data.repository.CrudRepository;

import com.ncsi.spring.boot.cloud.gateway.model.TraceRequest;

public interface Service1Repository extends CrudRepository<TraceRequest, Integer>  {

}
