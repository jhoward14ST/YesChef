import React, { Component } from "react";
import { createStackNavigator } from "@react-navigation/stack";
import { useSelector } from "react-redux";

// TODO: Add the import statement *import { ComponentsStyle } from "style"* once added

// import BottomTabNavigator from "./BottomTabNavigator";

const Stack = createStackNavigator();
const screenOptions = {
    headerShown: false,
    // ...ComponentsStyle.transitionBetweenScreenPresets,
};

const RootNavigator = () => {
    return (
        <Stack.Navigator>
            <Stack.Screen
                name="BottomTab"
                component={BottomTabNavigator}
                options={screenOptions}
            />
        </Stack.Navigator>
    );
};