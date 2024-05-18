import React from 'react';
import { useSelector } from 'react-redux';

import { NavStatelessComponent } from 'interfaces';

import GroceryListItemScreen from "./GroceryListItemScreen";
import navigationOptions from "./GroceryListItemScreen.navigationOptions";

const GroceryListItem = () => {
    // const { groceryList } = useSelector((state) => state.groceryList);

    return (
        <GroceryListItemScreen />
    );
};

GroceryListItem.navigationOptions = navigationOptions();

export default GroceryListItem;