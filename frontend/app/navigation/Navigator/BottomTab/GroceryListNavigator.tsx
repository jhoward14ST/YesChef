import React from "react";
import { createStackNavigator } from "@react-navigation/stack";

// TODO: Fix the imports
import GroceryListScreen from "../.../../screens/GroceryListScreen";
import GroceryListItemScreen from "../.../../screens/GroceryListItemScreen";

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