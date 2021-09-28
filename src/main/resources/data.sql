CREATE TABLE pilots (
                        id INT AUTO_INCREMENT  PRIMARY KEY,
                        first_name VARCHAR(100) NOT NULL,
                        last_name VARCHAR(100) NOT NULL,
                        rang VARCHAR(50),
                        code VARCHAR(50) NOT NULL UNIQUE

);

CREATE TABLE planes (
                        id INT AUTO_INCREMENT  PRIMARY KEY,
                        brand VARCHAR(100) NOT NULL,
                        model VARCHAR(100) NOT NULL,
                        capacity INT UNSIGNED NOT NULL,
                        tale_number VARCHAR(100) NOT NULL UNIQUE

);

CREATE TABLE flights (
                         id INT AUTO_INCREMENT  PRIMARY KEY,
                         planes_id INT,
                         pilots_id INT,
                         date DATE NOT NULL,
                         time TIME NOT NULL,
                         number VARCHAR(100) NOT NULL UNIQUE,
                         FOREIGN KEY (planes_id) REFERENCES planes(id),
                         FOREIGN KEY (pilots_id) REFERENCES pilots(id)
);