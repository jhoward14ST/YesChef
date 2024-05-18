import React from "react";
import { createStackNavigator } from "@react-navigation/stack";

import GroceryListScreen from "../../../screens/GroceryList";
import GroceryListItemScreen from "../../../screens/GroceryListItem";

const Stack = createStackNavigator();

const GroceryListNavigator = (): React.ReactElement => {
    return (
        <Stack.Navigator>
            <Stack.Screen
                name="GroceryList"
                component={GroceryListScreen}
            />
            <Stack.Screen
                name="GroceryListItem"
                component={GroceryListItemScreen}
            />
        </Stack.Navigator>
    );
};

export default GroceryListNavigator;