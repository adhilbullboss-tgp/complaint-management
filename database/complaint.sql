CREATE SCHEMA managementofcomplaint ;


CREATE TABLE managementofcomplaint.customer (
  customer_id VARCHAR(15) NOT NULL,
  username VARCHAR(45) NOT NULL,
  password VARCHAR(45) NOT NULL,
  PRIMARY KEY (customer_id),
  UNIQUE INDEX username_UNIQUE (username ASC) VISIBLE
);

CREATE TABLE managementofcomplaint.complaint_type (
  customer_id VARCHAR(15) NOT NULL,
  complaint_type VARCHAR(500) NOT NULL,
  complaint_id VARCHAR(45) NOT NULL,
  status VARCHAR(45) NOT NULL,

  FOREIGN KEY (customer_id) REFERENCES managementofcomplaint.customer(customer_id)
); 
USE managementofcomplaint;
INSERT INTO customer VALUES("CUST1001","john_doe","john@123"),
("CUST1002","jane_smith","jane@123"),
("CUST1003","rajiv_kumar","rajiv@123"),
("CUST1004","anita_shawarma","shawarma@123"),
("CUST1005","mike_brown","mike@123");

USE managementofcomplaint;
INSERT INTO complaint_type VALUES("CUST1001","Package marked as delivered but never arrived","CMP1001","Solved"),
("CUST1002","Items arrived damaged due to poor packaging","CMP1002","More in process"),
("CUST1003","Delivery delayed without notification","CMP1003","In process"),
("CUST1004","Received wrong product or size","CMP1004","More in process"),
("CUST1005","Product stopped working after two days","CMP1005","Solved");
