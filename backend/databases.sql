CREATE TABLE Recipe (
    id      INT     NOT NULL        IDENTITY       PRIMARY KEY,
    description     VARCHAR(255)        NOT NULL,
    instructions        TEXT        NOT NULL
);
GO

CREATE TABLE Ingredient (
    id      INT      NOT NULL        IDENTITY        PRIMARY KEY,
    description     VARCHAR(255),
    qty_in_inventory        DECIMAL(10, 2),
    unit_id     INT,
    FOREIGN KEY (unit_id) REFERENCES ImperialUnit(id)
);
GO

CREATE TABLE ImperialUnit (
    id      INT      NOT NULL        IDENTITY        PRIMARY KEY,
    description     VARCHAR(255)        NOT NULL
);
GO

CREATE TABLE Recipe_Ingredient (
    recipe_id       INT       NOT NULL,
    ingredient_id   INT       NOT NULL,
    quantity        DECIMAL(10, 2),
    unit            VARCHAR(255),
    FOREIGN KEY (recipe_id) REFERENCES Recipe(id)
        ON DELETE CASCADE,
    FOREIGN KEY (ingredient_id) REFERENCES Ingredient(id)
        ON DELETE CASCADE
);
GO

ALTER TABLE Recipe_Ingredient ADD
    CONSTRAINT PK_RI PRIMARY KEY (recipe_id, ingredient_id);
GO

CREATE TABLE Grocery_List (
    id      INT      NOT NULL        IDENTITY        PRIMARY KEY,
    description     VARCHAR(255)        NOT NULL,
);


