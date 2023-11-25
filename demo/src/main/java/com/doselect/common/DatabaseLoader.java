package com.doselect.common;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Controller
   public class DatabaseLoader implements CommandLineRunner {

        @PersistenceContext
        private EntityManager entityManager;

        @Transactional
        @Override
        public void run(String... args) throws Exception {
            // Initialize database with sample data if needed
        }

}
