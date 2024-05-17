import React from 'react';
import { useSelector } from 'react-redux';

import { NavStatelessComponent } from 'interfaces';

import RecipesScreen from "./RecipesScreen";
import navigationOptions from "./RecipesScreen.navigationOptions";

const Recipes: NavStatelessComponent = () => {
    // const { Recipes } = useSelector((state) => state.Recipes);

    // TODO: Get help with this error.
    return (
        <RecipesScreen />
    );
};

Recipes.navigationOptions = navigationOptions();

export default Recipes;