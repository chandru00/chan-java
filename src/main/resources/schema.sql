CREATE TABLE IF NOT EXISTS Content (
   id SERIAL PRIMARY KEY ,
   title varchar(255) NOT NULL,
    desc text,
    status VARCHAR(20) NOT NULL,
    content_type VARCHAR(50) NOT NULL,
    date_created TIMESTAMP NOT NULL,
    date_updated TIMESTAMP,
    url VARCHAR(255)
);

-- INSERT INTO Content(title, description, status, content_type,date_created)VALUES ('My Spring Data', 'A POST about spring', 'IDEA','ARTICLE', CURRENT_TIMESTAMP)