CREATE TABLE fabrica (
     id SERIAL NOT NULL PRIMARY KEY,
     name VARCHAR(50) NOT NULL
);

insert into "fabrica" (id, name) values (1, 'Default');

ALTER TABLE carro_default
    ADD COLUMN id_fabrica INTEGER NOT NULL DEFAULT 1,
    ADD CONSTRAINT carro_fabrica_FK FOREIGN KEY (id_fabrica) REFERENCES "fabrica" (id)
;
