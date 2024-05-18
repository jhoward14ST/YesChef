import React from "react";
import { createStackNavigator } from "@react-navigation/stack";

// TODO: Fix the imports
import InventoryScreen from "../.../../screens/InventoryScreen";
import InventoryItemScreen from "../.../../screens/InventoryItemScreen";

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