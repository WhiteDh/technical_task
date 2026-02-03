INSERT INTO fish_images (file_name, fish_id)
SELECT image_file_name, id
FROM fish
WHERE image_file_name IS NOT NULL;
