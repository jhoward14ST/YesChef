import React from 'react';
import { useSelector } from 'react-redux';

import GroceryListScreen from "./GroceryListScreen";
import navigationOptions from "./GroceryListScreen.navigation";

const GroceryList = () => {
    const { groceryList } = useSelector((state) => state.groceryList);

    return (
        <GroceryListScreen
            groceryList={groceryList}
            navigationOptions={navigationOptions}
        />
    );
};

GroceryList.navigationOptions = navigationOptions();

export default GroceryList;