import React from "react";
import { createStackNavigator } from "@react-navigation/stack";

import InventoryScreen from "../../../screens/Inventory";
import InventoryItemScreen from "../../../screens/InventoryItem";

const Stack = createStackNavigator();

const InventoryNavigator = (): React.ReactElement => {
    return (
        <Stack.Navigator>
            <Stack.Screen
                name="Inventory"
                component={InventoryScreen}
            />
            <Stack.Screen
                name="InventoryItem"
                component={InventoryItemScreen}
            />
        </Stack.Navigator>
    );
};

export default InventoryNavigator;