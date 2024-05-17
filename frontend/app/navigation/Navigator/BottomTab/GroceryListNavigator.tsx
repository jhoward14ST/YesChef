import React from 'react';
import { createStackNavigator } from '@react-navigation/stack';

import GroceryListScreen from '../../../screens/GroceryListScreen';
import GroceryListItemScreen from '../../../screens/GroceryItemScreen';

const Stack = createStackNavigator();

const GroceryListNavigator = () => {
    return (
        <Stack.Navigator>
            <Stack.Screen
                name="GroceryList"
                component={GroceryListScreen}
            />
            <Stack.Screen
                name="GroceryList"
                component={GroceryListItemScreen}
            />
        </Stack.Navigator>
    );
};

export default GroceryListNavigator;