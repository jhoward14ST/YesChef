import React from 'react';
import { useSelector } from 'react-redux';

import { NavStatelessComponent } from '../../interfaces';

import InventoryItemScreen from "./InventoryItemScreen";
import navigationOptions from "./InventoryItemScreen.navigationOptions";

const InventoryItem: NavStatelessComponent = () => {
    // const { InventoryItem } = useSelector((state) => state.InventoryItem);

    // TODO: Get help with this error.
    return (
        <InventoryItemScreen />
    );
};

InventoryItem.navigationOptions = navigationOptions();

export default InventoryItem;