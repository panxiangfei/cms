package com.icare.cms.systemconfig.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icare.cms.systemconfig.entity.TUser;
@Repository
public interface UserDao extends JpaRepository<TUser, Long>{

}
