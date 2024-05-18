import React from "react";
import { createStackNavigator } from "@react-navigation/stack";

import RecipeScreen from ".../../screens/Recipes";
import RecipeItemScreen from ".../../screens/RecipeItem";

const Stack = createStackNavigator();

const RecipeNavigator = (): React.ReactElement => {
    return (
        <Stack.Navigator>
            <Stack.Screen
                name="Recipe"
                component={RecipeScreen}
            />
            <Stack.Screen
                name="RecipeItem"
                component={RecipeItemScreen}
            />
        </Stack.Navigator>
    );
};

export default RecipeNavigator;