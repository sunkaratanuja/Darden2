package com.doselect.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
    @Table(name = "CUSTOMER")

public class Customer {
        @Id
        @Column(name = "CUST_ID", length = 5)
        private int id;
  @Column(name = "NAME", length = 30)
        private String name;

        @Column(name = "AGE")
        private int age;

        public Customer() {
        }

        public Customer(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }



