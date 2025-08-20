DROP DATABASE IF EXISTS expense_tracker;
CREATE DATABASE IF NOT EXISTS expense_tracker;
USE expense_tracker;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR (50) UNIQUE NOT NULL,
    password VARCHAR(100) NOT NULL
);

CREATE TABLE categories (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR (255) NOT NULL,
    user_id INT,
    FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE TABLE expenses (
    id INT AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR (255) NOT NULL,
    amount DECIMAL (10,2) NOT NULL,
    date DATE NOT NULL,
    user_id INT,
    category_id INT,
    FOREIGN KEY (user_id) REFERENCES users (id),
    FOREIGN KEY (category_id) REFERENCES categories (id)
);

INSERT INTO users (username, password) VALUES ('john_doe', 'secure123');
INSERT INTO users (username, password) VALUES ('jane_smith', 'pass456');
INSERT INTO users (username, password) VALUES ('mike_wilson', 'mikepass789');

INSERT INTO categories (name, user_id) VALUES ('Groceries', 1);
INSERT INTO categories (name, user_id) VALUES ('Transportation', 2);
INSERT INTO categories (name, user_id) VALUES ('Entertainment', 3);

INSERT INTO expenses (description, amount, date, user_id, category_id) VALUES ('Milk and eggs', 25.50, '2024-01-15', 1, 1);
INSERT INTO expenses (description, amount, date, user_id, category_id) VALUES ('Bus ticket', 3.75, '2024-01-16', 2, 2);
INSERT INTO expenses (description, amount, date, user_id, category_id) VALUES ('Movie tickets', 45.00, '2024-01-17', 3, 3);