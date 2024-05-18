import React from "react";
import { createStackNavigator } from "@react-navigation/stack";

// TODO: Fix the imports
import RecipeScreen from "../.../../screens/RecipeScreen";
import RecipeItemScreen from "../.../../screens/RecipeItemScreen";

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