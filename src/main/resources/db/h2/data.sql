INSERT INTO owners (id, first_name, last_name) VALUES (1, 'John', 'Doe');
INSERT INTO owners (id, first_name, last_name) VALUES (2, 'Jane', 'Smith');

INSERT INTO pets (id, name, type_id, owner_id) VALUES (1, 'Rex', 1, 1);
INSERT INTO pets (id, name, type_id, owner_id) VALUES (2, 'Fluffy', 2, 1);
INSERT INTO pets (id, name, type_id, owner_id) VALUES (3, 'Fido', 1, 2);

INSERT INTO pet_types (id, name) VALUES (1, 'Dog');
INSERT INTO pet_types (id, name) VALUES (2, 'Cat');

INSERT INTO vets (id, first_name, last_name) VALUES (1, 'Dr. Alice', 'Johnson');
INSERT INTO vets (id, first_name, last_name) VALUES (2, 'Dr. Bob', 'Williams');

INSERT INTO specialties (id, name) VALUES (1, 'Surgery');
INSERT INTO specialties (id, name) VALUES (2, 'Dentistry');

INSERT INTO visits (id, date, pet_id, description) VALUES (1, '2023-01-01', 1, 'Annual checkup');
INSERT INTO visits (id, date, pet_id, description) VALUES (2, '2023-02-15', 2, 'Vaccination');