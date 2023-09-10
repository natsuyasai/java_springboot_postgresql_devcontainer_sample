\c demodb;

SET search_path to "data";

-- Create a sample table
CREATE TABLE demodata (
    id SERIAL PRIMARY KEY,
    data VARCHAR(255)
);

-- Insert some sample data
INSERT INTO demodata (data) VALUES
('abcdef'),
('hijklmn');
