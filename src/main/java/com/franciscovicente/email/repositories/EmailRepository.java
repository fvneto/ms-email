package com.franciscovicente.email.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franciscovicente.email.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long>{

}
