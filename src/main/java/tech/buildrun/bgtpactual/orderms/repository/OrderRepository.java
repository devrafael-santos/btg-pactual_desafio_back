package tech.buildrun.bgtpactual.orderms.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import tech.buildrun.bgtpactual.orderms.controller.dto.OrderResponse;
import tech.buildrun.bgtpactual.orderms.entity.OrderEntity;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {


    Page<OrderEntity> findAllByCustomerId(Long customerId, PageRequest pageRequest);
}
