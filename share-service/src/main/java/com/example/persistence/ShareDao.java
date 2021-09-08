package com.example.persistence;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bean.Share;

@Repository
public interface ShareDao extends JpaRepository<Share, Integer>{

}
