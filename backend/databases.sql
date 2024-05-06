CREATE TABLE Recipe (
    id      INT     NOT NULL        IDENTITY       PRIMARY KEY,
    description     VARCHAR(255)    NOT NULL,
    instructions    TEXT            NOT NULL,
    is_available    BOOLEAN         NOT NULL
);
GO

CREATE TABLE Ingredient (
    id      INT      NOT NULL        IDENTITY        PRIMARY KEY,
    description      VARCHAR(255),
);
GO

CREATE TABLE ImperialUnit (
    id      INT      NOT NULL        IDENTITY        PRIMARY KEY,
    description      VARCHAR(255)    NOT NULL
);
GO

CREATE TABLE Recipe_Ingredient (
    recipe_id       INT       NOT NULL,
    ingredient_id   INT       NOT NULL,
    imperialUnit_id INT       NOT NULL,
    quantity        DECIMAL(10, 2),
    FOREIGN KEY (recipe_id) REFERENCES Recipe(id)
        ON DELETE CASCADE,
    FOREIGN KEY (ingredient_id) REFERENCES Ingredient(id)
        ON DELETE CASCADE
    FOREIGN KEY (imperialUnit_id) REFERENCES ImperialUnit(id)
        ON DELETE CASCADE
);
GO

ALTER TABLE Recipe_Ingredient ADD
    CONSTRAINT PK_RI PRIMARY KEY (recipe_id, ingredient_id, imperialUnit_id);
GO

CREATE TABLE Inventory_Ingredient (
    id              INT       NOT NULL    IDENTITY    PRIMARY KEY,
    ingredient_id   INT       NOT NULL,
    imperialUnit_id INT       NOT NULL,
    quantity        DECIMAL(10, 2),
    FOREIGN KEY (ingredient_id) REFERENCES Ingredient(id)
        ON DELETE CASCADE
    FOREIGN KEY (imperialUnit_id) REFERENCES ImperialUnit(id)
        ON DELETE CASCADE
);

CREATE TABLE Grocery_List (
    id              INT NOT NULL    IDENTITY    PRIMARY KEY,
    recipe_id       INT NOT NULL,
    ingredient_id   INT NOT NULL,
    FOREIGN KEY (recipe_id, ingredient_id) REFERENCES Recipe_Ingredient(recipe_id, ingredient_id)
);
GO

