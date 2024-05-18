import React from "react";
import { NavigationContainer } from "@react-navigation/native";
import { createStackNavigator } from "@react-navigation/stack";

import RootNavigator from "./RootNavigator";

const AppStack = createStackNavigator();

const App = (): React.ReactElement => {
    return (
        <NavigationContainer>
            <AppStack.Navigator screenOptions={{ presentation: "modal" }}>
                <AppStack.Screen
                    name="AppStack"
                    options={{ headerShown: false }}
                    component={RootNavigator}
                />
                {/* Add the screens here */}
            </AppStack.Navigator>
        </NavigationContainer>
    );
};

export default App;