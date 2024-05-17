import React from 'react';
import { useSelector } from 'react-redux';

import { NavStatelessComponent } from 'interfaces';

import GroceryListScreen from "./GroceryListItemScreen";
import navigationOptions from "./GroceryListItemScreen.navigationOptions";

const GroceryListItem: NavStatelessComponent = () => {
    // const { groceryList } = useSelector((state) => state.groceryList);

    // TODO: Get help with this error.
    return (
        <GroceryListItemScreen />
    );
};

GroceryListItem.navigationOptions = navigationOptions();

export default GroceryListItem;