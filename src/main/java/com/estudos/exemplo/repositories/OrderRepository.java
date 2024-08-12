package com.estudos.exemplo.repositories;

import com.estudos.exemplo.entities.WS_Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OrderRepository extends JpaRepository<WS_Order,Long> {

}
