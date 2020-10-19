DROP TABLE IF EXISTS beers;

CREATE TABLE beers (
                       id INT PRIMARY KEY,
                       NAME VARCHAR(250) NOT NULL,
                       BREWERIE VARCHAR(250) NOT NULL,
                       STYLE VARCHAR(250) NOT NULL,
                       ABV DOUBLE NOT NULL,
                       DESCRIPTION VARCHAR(250)
);

INSERT INTO beers (ID, NAME, BREWERIE, STYLE, ABV, DESCRIPTION)VALUES
(1, 'nelson mango', 'La Ptite Mouse', 'Sour', 5.5, 'pas ouf'),
(2, 'In Plenty', 'Omnipollo', 'Imperial Stout', 10.00, 'excellent stout'),
(3, 'In Plenty', 'Omnipollo', 'Imperial Stout', 10.00, 'excellent stout')