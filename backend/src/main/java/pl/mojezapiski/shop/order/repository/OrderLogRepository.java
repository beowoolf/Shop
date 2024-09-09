package pl.mojezapiski.shop.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mojezapiski.shop.order.model.OrderLog;

public interface OrderLogRepository extends JpaRepository<OrderLog, Long> {
}
