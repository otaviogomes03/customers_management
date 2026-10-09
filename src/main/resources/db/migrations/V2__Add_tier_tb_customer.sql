-- V2: Migration to add the tier column to the customers table

ALTER TABLE tb_customer
ADD COLUMN tier VARCHAR(255);