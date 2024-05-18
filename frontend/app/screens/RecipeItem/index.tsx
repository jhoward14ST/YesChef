import React from "react";
import { useSelector } from "react-redux";

import { NavStatelessComponent } from "interfaces";

import RecipeItemScreen from "./RecipeItemScreen";
import navigationOptions from "./RecipeItemScreen.navigationOptions";

const RecipeItem = () => {
    // const { RecipeItem } = useSelector((state) => state.RecipeItem);

    return (
        <RecipeItemScreen />
    );
};

RecipeItem.navigationOptions = navigationOptions();

export default RecipeItem;