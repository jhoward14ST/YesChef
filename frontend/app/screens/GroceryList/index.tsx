import React from "react";
import { useSelector } from "react-redux";

import { NavStatelessComponent } from "interfaces";

import GroceryListScreen from "./GroceryListScreen";
import navigationOptions from "./GroceryListScreen.navigationOptions";

const GroceryList: NavStatelessComponent = () => {
    // const { groceryList } = useSelector((state) => state.groceryList);

    return (
        <GroceryListScreen />
    );
};

GroceryList.navigationOptions = navigationOptions();

export default GroceryList;