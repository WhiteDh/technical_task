    CREATE TABLE fish_images (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    file_name VARCHAR(255) NOT NULL,
    fish_id INT NOT NULL,
    CONSTRAINT fk_fish_images_fish
    FOREIGN KEY (fish_id)
    REFERENCES fish(id)
    ON DELETE CASCADE
);
