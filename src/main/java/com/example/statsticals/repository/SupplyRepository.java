package com.example.statsticals.repository;

import com.example.statsticals.model.Supply;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SupplyRepository extends JpaRepository<Supply,Long> {
//    @Query(value = "select ", nativeQuery = true)
//    Page<Supply> searchAll();
}
