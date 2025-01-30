package com.scorestable.rest_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

import java.util.Objects;



    @Entity
    @Table(name = "books") // Optional: Specify table name explicitly
    public class Match {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Size(min = 1, max = 20)
        private String title;
        private String score;

        // No-argument constructor
        public Match() {
        }

        // All-argument constructor (optional, for convenience)
        public Match(String title, String score) {
            this.title = title;
            this.score = score;
        }

        // Getters and setters
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getScore() {
            return score;
        }

        public void setScore(String score) {
            this.score = score;
        }

    }