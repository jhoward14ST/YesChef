import React from 'react';
import { useSelector } from 'react-redux';

import { NavStatelessComponent } from 'interfaces';

import InventoryScreen from "./InventoryScreen";
import navigationOptions from "./InventoryScreen.navigationOptions";

const Inventory: NavStatelessComponent = () => {
    // const { Inventory } = useSelector((state) => state.Inventory);

    // TODO: Get help with this error.
    return (
        <InventoryScreen />
    );
};

Inventory.navigationOptions = navigationOptions();

export default Inventory;