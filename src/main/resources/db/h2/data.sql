-- Sample data for Spring Pet Clinic

-- Pet Types
INSERT INTO pet_type (name) VALUES ('Cat');
INSERT INTO pet_type (name) VALUES ('Dog');
INSERT INTO pet_type (name) VALUES ('Rabbit');
INSERT INTO pet_type (name) VALUES ('Bird');
INSERT INTO pet_type (name) VALUES ('Hamster');

-- Owners
INSERT INTO owner (first_name, last_name, address, city, telephone) 
VALUES ('George', 'Franklin', '110 W. Liberty St.', 'Madison', '6085551023');
INSERT INTO owner (first_name, last_name, address, city, telephone) 
VALUES ('Betty', 'Davis', '638 Cardinal Ave.', 'Sun Prairie', '6085551749');
INSERT INTO owner (first_name, last_name, address, city, telephone) 
VALUES ('Eddie', 'Stevens', '2452 W. Humingbird Lane', 'Monona', '6085551570');
INSERT INTO owner (first_name, last_name, address, city, telephone) 
VALUES ('Harold', 'Davis', '563 Friendly St.', 'Windsor', '6085551838');
INSERT INTO owner (first_name, last_name, address, city, telephone) 
VALUES ('Peter', 'McTavish', '8476 Elizabeth Ave.', 'Waunakee', '6085555387');
INSERT INTO owner (first_name, last_name, address, city, telephone) 
VALUES ('Jean', 'Coleman', '105 N. Lake St.', 'Monona', '6085552654');
INSERT INTO owner (first_name, last_name, address, city, telephone) 
VALUES ('Jeff', 'Black', '1450 Oak Blvd.', 'Monona', '6085555387');
INSERT INTO owner (first_name, last_name, address, city, telephone) 
VALUES ('Maria', 'Escobito', '345 Maple Ave.', 'Madison', '6085551747');
INSERT INTO owner (first_name, last_name, address, city, telephone) 
VALUES ('David', 'Schroeder', '2749 Newfoundland Ave.', 'Madison', '6085558763');
INSERT INTO owner (first_name, last_name, address, city, telephone) 
VALUES ('Carlos', 'Estaban', '2335 Independence La.', 'Waunakee', '6085555487');

-- Pets
INSERT INTO pet (name, birth_date, type_id, owner_id) VALUES ('Leo', '2010-09-07', 1, 1);
INSERT INTO pet (name, birth_date, type_id, owner_id) VALUES ('Basil', '2012-08-06', 2, 2);
INSERT INTO pet (name, birth_date, type_id, owner_id) VALUES ('Rosy', '2011-04-17', 2, 3);
INSERT INTO pet (name, birth_date, type_id, owner_id) VALUES ('Jewel', '2010-03-07', 2, 3);
INSERT INTO pet (name, birth_date, type_id, owner_id) VALUES ('Iggy', '2010-11-30', 3, 4);
INSERT INTO pet (name, birth_date, type_id, owner_id) VALUES ('George', '2010-01-20', 4, 5);
INSERT INTO pet (name, birth_date, type_id, owner_id) VALUES ('Samantha', '2012-09-04', 1, 6);
INSERT INTO pet (name, birth_date, type_id, owner_id) VALUES ('Max', '2012-09-04', 1, 6);
INSERT INTO pet (name, birth_date, type_id, owner_id) VALUES ('Lucky', '2011-08-06', 2, 7);
INSERT INTO pet (name, birth_date, type_id, owner_id) VALUES ('Mulligan', '2007-02-24', 2, 8);
INSERT INTO pet (name, birth_date, type_id, owner_id) VALUES ('Freddy', '2010-03-09', 5, 9);
INSERT INTO pet (name, birth_date, type_id, owner_id) VALUES ('Lucky', '2010-06-24', 2, 10);
INSERT INTO pet (name, birth_date, type_id, owner_id) VALUES ('Sly', '2012-06-08', 1, 10);

-- Specialties
INSERT INTO specialty (name) VALUES ('Radiology');
INSERT INTO specialty (name) VALUES ('Surgery');
INSERT INTO specialty (name) VALUES ('Dentistry');

-- Vets
INSERT INTO vet (first_name, last_name) VALUES ('James', 'Carter');
INSERT INTO vet (first_name, last_name) VALUES ('Helen', 'Leary');
INSERT INTO vet (first_name, last_name) VALUES ('Linda', 'Douglas');
INSERT INTO vet (first_name, last_name) VALUES ('Rafael', 'Ortega');
INSERT INTO vet (first_name, last_name) VALUES ('Henry', 'Stevens');

-- Vet Specialties
INSERT INTO vet_specialty (vet_id, specialty_id) VALUES (2, 1);
INSERT INTO vet_specialty (vet_id, specialty_id) VALUES (3, 2);
INSERT INTO vet_specialty (vet_id, specialty_id) VALUES (3, 3);
INSERT INTO vet_specialty (vet_id, specialty_id) VALUES (4, 2);
INSERT INTO vet_specialty (vet_id, specialty_id) VALUES (5, 1);

-- Visits
INSERT INTO visit (pet_id, visit_date, description) VALUES (1, '2024-03-04 13:05:43', 'Rabies shot');
INSERT INTO visit (pet_id, visit_date, description) VALUES (2, '2024-03-06 15:38:27', 'Neutered');
INSERT INTO visit (pet_id, visit_date, description) VALUES (3, '2024-03-06 09:02:17', 'Spayed');
INSERT INTO visit (pet_id, visit_date, description) VALUES (4, '2024-03-07 16:38:44', 'Spayed');
INSERT INTO visit (pet_id, visit_date, description) VALUES (5, '2024-03-07 14:23:52', 'Rabies shot');
INSERT INTO visit (pet_id, visit_date, description) VALUES (6, '2024-03-08 10:03:47', 'Rabies shot');
INSERT INTO visit (pet_id, visit_date, description) VALUES (7, '2024-03-09 11:04:23', 'Rabies shot');
INSERT INTO visit (pet_id, visit_date, description) VALUES (8, '2024-03-10 12:04:35', 'Rabies shot');
INSERT INTO visit (pet_id, visit_date, description) VALUES (9, '2024-03-11 14:32:18', 'Rabies shot');
INSERT INTO visit (pet_id, visit_date, description) VALUES (10, '2024-03-12 16:12:34', 'Rabies shot');