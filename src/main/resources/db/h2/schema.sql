-- H2 Database Schema for Spring Pet Clinic
-- Java 8 Compatible

CREATE TABLE owner (
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    address VARCHAR(255),
    city VARCHAR(80),
    telephone VARCHAR(20),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE pet_type (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(80) NOT NULL UNIQUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE pet (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(30) NOT NULL,
    birth_date DATE,
    type_id INT NOT NULL,
    owner_id INT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (type_id) REFERENCES pet_type(id),
    FOREIGN KEY (owner_id) REFERENCES owner(id)
);

CREATE TABLE specialty (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(80) NOT NULL UNIQUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE vet (
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE vet_specialty (
    vet_id INT NOT NULL,
    specialty_id INT NOT NULL,
    PRIMARY KEY (vet_id, specialty_id),
    FOREIGN KEY (vet_id) REFERENCES vet(id),
    FOREIGN KEY (specialty_id) REFERENCES specialty(id)
);

CREATE TABLE visit (
    id INT PRIMARY KEY AUTO_INCREMENT,
    pet_id INT NOT NULL,
    visit_date TIMESTAMP NOT NULL,
    description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (pet_id) REFERENCES pet(id)
);

-- Create Indexes for performance
CREATE INDEX idx_owner_name ON owner(last_name, first_name);
CREATE INDEX idx_pet_owner ON pet(owner_id);
CREATE INDEX idx_pet_type ON pet(type_id);
CREATE INDEX idx_visit_pet ON visit(pet_id);
CREATE INDEX idx_visit_date ON visit(visit_date);
CREATE INDEX idx_vet_name ON vet(last_name, first_name);