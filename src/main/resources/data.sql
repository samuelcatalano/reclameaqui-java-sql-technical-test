--CITIES
INSERT INTO city (id, name, state) VALUES (1, 'São Paulo', 'SP');
INSERT INTO city (id, name, state) VALUES (2, 'Rio de Janeiro', 'RJ');
INSERT INTO city (id, name, state) VALUES (3, 'Belo Horizonte', 'BH');
INSERT INTO city (id, name, state) VALUES (4, 'Curitiba', 'PR');

--COMPANIES
INSERT INTO company (id, name) VALUES (1, 'XPTO');
INSERT INTO company (id, name) VALUES (2, 'WWZG');
INSERT INTO company (id, name) VALUES (3, 'ABCD');
INSERT INTO company (id, name) VALUES (4, 'RZOP');

--COMPLAINTS
INSERT INTO complaint (id, title, description, company, city) VALUES (1, 'Não recebi o dinheiro', 'Não recebi o dinheiro da venda na empresa XPTO', 1, 1);
INSERT INTO complaint (id, title, description, company, city) VALUES (2, 'Não recebi!!!', 'Não recebi o dinheiro da compra pela empresa XPTO', 1, 1);
INSERT INTO complaint (id, title, description, company, city) VALUES (3, 'Cade meu $$$?', 'XPTO, cade meu dinheiro???', 1, 1);
INSERT INTO complaint (id, title, description, company, city) VALUES (4, 'Não recebi o dinheiro', 'Não recebi o dinheiro da venda na empresa WWZG', 2, 1);
INSERT INTO complaint (id, title, description, company, city) VALUES (5, 'Não recebi!!!', 'Não recebi o dinheiro da compra pela empresa WWZG', 2, 2);
INSERT INTO complaint (id, title, description, company, city) VALUES (6, 'Empresa não é séria', 'Essa empresa ABCD não é séria', 3, 3);
INSERT INTO complaint (id, title, description, company, city) VALUES (7, 'A RZOP é mentirosa', 'Essa empresa é uma farsa', 4, 4);
INSERT INTO complaint (id, title, description, company, city) VALUES (8, 'A RZOP é uma farsa', 'Essa empresa é uma mentirosa!!!!', 1, 4);