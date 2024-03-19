package com.example.Swigatto.repository;

import com.example.Swigatto.model.DeliveryPartner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryPartnerRepository extends JpaRepository<DeliveryPartner,Integer> {

    String findRandomPartner="select u from DeliveryPartner u order by RAND() LIMIT 1";
    @Query(value = findRandomPartner)
    public DeliveryPartner findRandomDeliveryPartner();
}
