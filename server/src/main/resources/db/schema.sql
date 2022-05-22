--DROP TABLE pet;
--DROP TABLE pets_store;
--DROP TABLE pets_type;

CREATE TABLE IF NOT EXISTS pets_type (
    pet_type_id INTEGER PRIMARY KEY AUTO_INCREMENT,
    pet_type VARCHAR(30),
    pet_sub_type VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS pets_store (
    store_id INTEGER PRIMARY KEY AUTO_INCREMENT,
    store_name VARCHAR(30),
    address VARCHAR(50),
    store_owner_name VARCHAR(30)
);

CREATE TABLE IF NOT EXISTS pet (
    pet_id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(30),
    available_pets INTEGER,
    tags VARCHAR(30),
    img_url VARCHAR(50),
    pet_type_id INTEGER,
    store_id INTEGER,
    FOREIGN KEY (store_id) REFERENCES pets_store(store_id) ON DELETE CASCADE,
    FOREIGN KEY (pet_type_id) REFERENCES pets_type(pet_type_id)
);