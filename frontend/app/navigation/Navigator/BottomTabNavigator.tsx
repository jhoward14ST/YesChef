import React from "react";
import { createBottomTabNavigator } from "@react-navigation/bottom-tabs";
import { useSafeAreaInsets } from "react-native-safe-area-context";

import { TabBarIcon } from "components";
import { Colors } from "style";

import GroceryListNavigator from "./BottomTab/GroceryListNavigator";
import InventoryNavigator from "./BottomTab/InventoryNavigator";
import RecipeNavigator from "./BottomTab/RecipeNavigator";

const BottomTab = createBottomTabNavigator();

const GroceryListOptions = {
    tabBarLabel: "Grocery List",
    // TODO: Fix name string when icon/image is added
    tabBarIcon: ({ focused }) => <TabBarIcon focused={focused} name={"image"} />,
};

const InventoryOptions = {
    tabBarLabel: "Inventory",
    // TODO: Fix name string when icon/image is added
    tabBarIcon: ({ focused }) => <TabBarIcon focused={focused} name={"image"} />,
};

const RecipeOptions = {
    tabBarLabel: "Recipes",
    // TODO: Fix name string when icon/image is added
    tabBarIcon: ({ focused }) => <TabBarIcon focused={focused} name={"image"} />,
};

const BottomTabNavigator = (): React.ReactElement => {
    const { bottom } = useSafeAreaInsets();

    return (
        <BottomTab.Navigator
            initialRouteName={"RecipesNavigator"}
            screenOptions={{
                headerShown: false,
                tabBarActiveTintColor: Colors.primary,
                tabBarInactiveTintColor: Colors.black50,
                tabBarBadgeStyle: {
                    backgroundColor: Colors.white,
                    borderTopWidth: 2,
                    borderTopColor: Colors.primary10,
                    paddingBottom: bottom / 2 + 6,
                },
            }}
        >
            <BottomTab.Screen
                name={"GroceryListNavigator"}
                component={GroceryListNavigator}
                options={GroceryListOptions}
            />
            <BottomTab.Screen
                name={"InventoryNavigator"}
                component={InventoryNavigator}
                options={InventoryOptions}
            />
            <BottomTab.Screen
                name={"RecipeNavigator"}
                component={RecipeNavigator}
                options={RecipeOptions}
            />
        </BottomTab.Navigator>
    )
};

export default BottomTabNavigator;