CREATE TABLE owners (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL
);

CREATE TABLE pets (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    type_id BIGINT NOT NULL,
    owner_id BIGINT NOT NULL,
    FOREIGN KEY (type_id) REFERENCES pet_types(id),
    FOREIGN KEY (owner_id) REFERENCES owners(id)
);

CREATE TABLE pet_types (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);

CREATE TABLE specialties (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);

CREATE TABLE vets (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL
);

CREATE TABLE vet_specialties (
    vet_id BIGINT NOT NULL,
    specialty_id BIGINT NOT NULL,
    PRIMARY KEY (vet_id, specialty_id),
    FOREIGN KEY (vet_id) REFERENCES vets(id),
    FOREIGN KEY (specialty_id) REFERENCES specialties(id)
);

CREATE TABLE visits (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    pet_id BIGINT NOT NULL,
    visit_date DATE NOT NULL,
    description VARCHAR(255),
    FOREIGN KEY (pet_id) REFERENCES pets(id)
);